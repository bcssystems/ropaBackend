package com.bcsystems.siga.dto;

import java.util.List;
import java.math.BigDecimal;

public record CatalogoProductoResponse(
        Integer idProducto,
        String sku,
        String nombre,
        String descripcion,
        Double precio,
        BigDecimal stockActual,
        String unidadMedida,
        Integer idCategoria,
        String categoriaNombre,
        String imagenPrincipalUrl,
        List<CatalogoMediaResponse> multimedia
) {}
