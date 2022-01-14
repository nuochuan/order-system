package com.ruyuan.eshop.order.domain.dto;

import com.ruyuan.eshop.common.core.AbstractObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Noel
 * @version 1.0
 */
@Data
public class GenOrderIdDTO extends AbstractObject implements Serializable {

    /**
     * 订单号
     */
    private String orderId;

}