package guo.proj.javao2o.service;

import guo.proj.javao2o.dto.ImageHolder;
import guo.proj.javao2o.dto.ProductExecution;
import guo.proj.javao2o.entity.Product;
import guo.proj.javao2o.exceptions.ProductOperationException;

import java.awt.*;
import java.io.InputStream;
import java.util.List;

public interface ProductService {

    /**
     * Add product info and process its image
     *
     * @param product
     * @param thumbnail
     * @param productImgList
     * @return
     * @throws ProductOperationException
     */
    ProductExecution addProduct(Product product, ImageHolder thumbnail,
                                List<ImageHolder> productImgList) throws ProductOperationException;

    Product getProductById(long productId);

    ProductExecution modifyProduct(Product product, ImageHolder thumbnail,
                                   List<ImageHolder> productImgList) throws ProductOperationException;

    /**
     * Get product list and do pagination. The filter can be: product name, product status, shopId, product category.
     *
     * @param productCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ProductExecution getProductList(Product productCondition, int pageIndex, int pageSize);

}
