package org.formacion.flyweight;

public enum Camiseta {

    UNICA;

    private static final String camiseta =
                "                                                                                                                             \n" +
                        "                                         ;Lti   1:C.                     ,G:.    t0i                                         \n" +
                        "                                 :Lt         .   C      1LCt;:::;tCL1      :    ;        1C;                                 \n" +
                        "                         ,CL;                 .    .                      ;    1              : .f8:                         \n" +
                        "                  iLi         ;                1                        t     ,                         ,CL                  \n" +
                        "          iLi                                          :.            C      1                .                  ,Cf          \n" +
                        "  ;Li                          .                   i          .           .                 .                           ;Ci  \n" +
                        " C                                                    ;.              :                     ;                              8 \n" +
                        "  .                             ;                                                                                          , \n" +
                        "  L                             :                                                                                         8  \n" +
                        "                                ,                                                                                         ,  \n" +
                        "   f                            .                                                                                        8   \n" +
                        "                                :                                                           ,                            ,   \n" +
                        "    C                           ;                                                           ;                           8    \n" +
                        "     .                          .                                                                                       i    \n" +
                        "     C                                                                                       :                         @     \n" +
                        "      ;                        .                                                                                       i     \n" +
                        "      G                       ;                                                               :                       0      \n" +
                        "       :                                                                                       .                      1      \n" +
                        "       1111111ii;:,.                                                                            :::::::::::::::::::::G       \n" +
                        "                            L                                                                   L                            \n" +
                        "                            L                                                                   L                            \n" +
                        "                            L                                                                   L                            \n" +
                        "                            L                                                                   G                            \n" +
                        "                            L                                                                   G                            \n" +
                        "                            L                                                                   G                            \n" +
                        "                            L                                                                   G                            \n" +
                        "                            L                                                                   C                            \n" +
                        "                            L                                                                   C                            \n" +
                        "                            L                              X                                    C                            \n" +
                        "                            L                                                                   L                            \n" +
                        "                            C                                                                   L                            \n" +
                        "                            C                                                                   L                            \n" +
                        "                            C                                                                   L                            \n" +
                        "                            C                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            f                                                                   L                            \n" +
                        "                            t                                                                   L                            \n" +
                        "                            t                                                                   L                            \n" +
                        "                            t                                                                   C                            \n" +
                        "                            t                                                                   C                            \n" +
                        "                            1                                                                   C                            \n" +
                        "                            1                                                                   C                            \n" +
                        "                            1                                                                   C                            \n" +
                        "                            i                                                                   C                            \n" +
                        "                            i                                                                   C                            \n" +
                        "                            i                                                                   0                            \n" +
                        "                            :GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG0                            \n" +
                        "                                                                                                                             \n"
                ;

    public String dibujaCamiseta(String numero) {
        return camiseta.replaceAll("X", numero);
    }
}
