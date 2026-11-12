.class public final Lp40;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcz4;


# instance fields
.field public final synthetic n:I

.field public final o:Lmf4;


# direct methods
.method public synthetic constructor <init>(Lmf4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp40;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lp40;->o:Lmf4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static b(Lmf4;Lnk1;Lcom/google/gson/reflect/TypeToken;Le32;)Lbz4;
    .locals 6

    .line 1
    invoke-interface {p3}, Le32;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lmf4;->e(Lcom/google/gson/reflect/TypeToken;)Lo73;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lo73;->A()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p3}, Le32;->nullSafe()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    instance-of p3, p0, Lbz4;

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    check-cast p0, Lbz4;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    instance-of p3, p0, Lcz4;

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    check-cast p0, Lcz4;

    .line 33
    .line 34
    invoke-interface {p0, p1, p2}, Lcz4;->a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    instance-of p3, p0, Lg32;

    .line 40
    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    move-object v1, p0

    .line 44
    check-cast v1, Lg32;

    .line 45
    .line 46
    new-instance v0, Lvx4;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    move-object v2, p1

    .line 50
    move-object v3, p2

    .line 51
    invoke-direct/range {v0 .. v5}, Lvx4;-><init>(Lg32;Lnk1;Lcom/google/gson/reflect/TypeToken;Lux4;Z)V

    .line 52
    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    move-object p0, v0

    .line 56
    :goto_0
    if-eqz p0, :cond_2

    .line 57
    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    new-instance p1, Lek4;

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    invoke-direct {p1, p0, p2}, Lek4;-><init>(Lbz4;I)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    return-object p0

    .line 68
    :cond_3
    move-object v3, p2

    .line 69
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance p2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string p3, "Invalid attempt to bind an instance of "

    .line 82
    .line 83
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p0, " as a @JsonAdapter for "

    .line 90
    .line 91
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/google/gson/reflect/TypeToken;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 102
    .line 103
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method


# virtual methods
.method public final a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;
    .locals 12

    .line 1
    iget v3, p0, Lp40;->n:I

    .line 2
    .line 3
    const-class v4, Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v5, p0, Lp40;->o:Lmf4;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    const-class v9, Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    if-nez v10, :cond_0

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    const-class v6, Ljava/util/Properties;

    .line 31
    .line 32
    const/4 v10, 0x2

    .line 33
    const/4 v11, 0x1

    .line 34
    if-ne v3, v6, :cond_1

    .line 35
    .line 36
    new-array v3, v10, [Ljava/lang/reflect/Type;

    .line 37
    .line 38
    const-class v4, Ljava/lang/String;

    .line 39
    .line 40
    aput-object v4, v3, v7

    .line 41
    .line 42
    aput-object v4, v3, v11

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v6, v3, Ljava/lang/reflect/WildcardType;

    .line 46
    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    check-cast v3, Ljava/lang/reflect/WildcardType;

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    aget-object v3, v3, v7

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6}, Lvr1;->d(Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v8, v9}, Lgb;->A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    new-instance v9, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v8, v6, v9}, Lgb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    instance-of v6, v3, Ljava/lang/reflect/ParameterizedType;

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    new-array v3, v10, [Ljava/lang/reflect/Type;

    .line 89
    .line 90
    aput-object v4, v3, v7

    .line 91
    .line 92
    aput-object v4, v3, v11

    .line 93
    .line 94
    :goto_0
    aget-object v4, v3, v7

    .line 95
    .line 96
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    if-eq v4, v6, :cond_5

    .line 99
    .line 100
    const-class v6, Ljava/lang/Boolean;

    .line 101
    .line 102
    if-ne v4, v6, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-static {v4}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p1, v4}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    :goto_1
    sget-object v4, Lhz4;->c:Llk1;

    .line 115
    .line 116
    :goto_2
    aget-object v6, v3, v11

    .line 117
    .line 118
    invoke-static {v6}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {p1, v6}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    move v8, v7

    .line 127
    invoke-virtual {v5, p2}, Lmf4;->e(Lcom/google/gson/reflect/TypeToken;)Lo73;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    new-instance v0, Leg2;

    .line 132
    .line 133
    move-object v5, v3

    .line 134
    aget-object v3, v5, v8

    .line 135
    .line 136
    aget-object v5, v5, v11

    .line 137
    .line 138
    move-object v1, p0

    .line 139
    move-object v2, p1

    .line 140
    invoke-direct/range {v0 .. v7}, Leg2;-><init>(Lp40;Lnk1;Ljava/lang/reflect/Type;Lbz4;Ljava/lang/reflect/Type;Lbz4;Lo73;)V

    .line 141
    .line 142
    .line 143
    move-object v6, v0

    .line 144
    :goto_3
    return-object v6

    .line 145
    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const-class v3, Le32;

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Le32;

    .line 156
    .line 157
    if-nez v1, :cond_6

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    invoke-static {v5, p1, p2, v1}, Lp40;->b(Lmf4;Lnk1;Lcom/google/gson/reflect/TypeToken;Le32;)Lbz4;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    :goto_4
    return-object v6

    .line 165
    :pswitch_1
    move v8, v7

    .line 166
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-class v7, Ljava/util/Collection;

    .line 175
    .line 176
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-nez v9, :cond_7

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    instance-of v6, v1, Ljava/lang/reflect/WildcardType;

    .line 184
    .line 185
    if-eqz v6, :cond_8

    .line 186
    .line 187
    check-cast v1, Ljava/lang/reflect/WildcardType;

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    aget-object v1, v1, v8

    .line 194
    .line 195
    :cond_8
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-static {v6}, Lvr1;->d(Z)V

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v3, v7}, Lgb;->A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    new-instance v7, Ljava/util/HashMap;

    .line 207
    .line 208
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v3, v6, v7}, Lgb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    instance-of v3, v1, Ljava/lang/reflect/ParameterizedType;

    .line 216
    .line 217
    if-eqz v3, :cond_9

    .line 218
    .line 219
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    aget-object v4, v1, v8

    .line 226
    .line 227
    :cond_9
    invoke-static {v4}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {p1, v1}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v5, p2}, Lmf4;->e(Lcom/google/gson/reflect/TypeToken;)Lo73;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v6, Lsi;

    .line 240
    .line 241
    invoke-direct {v6, p1, v4, v1, v0}, Lsi;-><init>(Lnk1;Ljava/lang/reflect/Type;Lbz4;Lo73;)V

    .line 242
    .line 243
    .line 244
    :goto_5
    return-object v6

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
