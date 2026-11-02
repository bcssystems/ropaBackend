package com.bcsystems.siga.dto;

import java.math.BigDecimal;

public record CatalogoProductoListadoResponse(
        Integer idProducto,
        String sku,
        String nombre,
        Double precio,
        BigDecimal stockActual,
        String unidadMedida,
        Integer idCategoria,
        String categoriaNombre,
        String imagenPrincipalUrl
) {}
