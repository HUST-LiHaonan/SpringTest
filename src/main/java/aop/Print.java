/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Print
 * Author:   mac
 * Date:     2019/10/26 6:42 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019/10/26
 * @since 1.0.0
 */
@Component
public interface Print {
    void print();
    String print(String str);
}
