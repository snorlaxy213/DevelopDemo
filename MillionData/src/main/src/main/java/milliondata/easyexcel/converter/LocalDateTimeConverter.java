package milliondata.easyexcel.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @className: LocalDateTimeConverter
 * @description: 日期解析成LocalDateTime
 * @author: Grio Vino
 * @date: 2021/10/9
 **/
public class LocalDateTimeConverter implements Converter<LocalDateTime> {

    @Override
    public Class<LocalDateTime> supportJavaTypeKey() {
        return LocalDateTime.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    // 将Excel日期转换为Java日期
    public static LocalDateTime convertExcelDateToJavaDate(long excelDate) {
        // Excel中的日期起点为1900-01-01
        Date date = new Date(((excelDate - 1) * 24 * 60 * 60 * 1000));
        // Date转化为LocalDateTime
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override
    public WriteCellData<?> convertToExcelData(LocalDateTime value, ExcelContentProperty contentProperty,
                                               GlobalConfiguration globalConfiguration) {
        return new WriteCellData<String>(value.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    
    @Override
    public LocalDateTime convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String stringValue = cellData.getStringValue();
        BigDecimal numberValue = cellData.getNumberValue();
        return convertExcelDateToJavaDate(stringValue != null ? Long.parseLong(stringValue) : numberValue.longValue());
    }
}
