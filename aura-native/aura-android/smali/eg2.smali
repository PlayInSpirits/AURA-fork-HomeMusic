.class public final Leg2;
.super Lbz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Leg2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Leg2;->b:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Leg2;->c:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Leg2;->d:Ljava/lang/Object;

    .line 27
    .line 28
    :try_start_0
    new-instance v0, Lgz4;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lgz4;-><init>(Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, [Ljava/lang/reflect/Field;

    .line 38
    .line 39
    array-length v0, p1

    .line 40
    const/4 v1, 0x0

    .line 41
    move v2, v1

    .line 42
    :goto_0
    if-ge v2, v0, :cond_1

    .line 43
    .line 44
    aget-object v3, p1, v2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/lang/Enum;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const-class v7, Lka4;

    .line 62
    .line 63
    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lka4;

    .line 68
    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-interface {v3}, Lka4;->value()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v3}, Lka4;->alternate()[Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    array-length v7, v3

    .line 80
    move v8, v1

    .line 81
    :goto_1
    if-ge v8, v7, :cond_0

    .line 82
    .line 83
    aget-object v9, v3, v8

    .line 84
    .line 85
    iget-object v10, p0, Leg2;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v10, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v8, v8, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    iget-object v3, p0, Leg2;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Leg2;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Leg2;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    return-void

    .line 120
    :catch_0
    move-exception p0

    .line 121
    new-instance p1, Ljava/lang/AssertionError;

    .line 122
    .line 123
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method public constructor <init>(Lnk1;Lbz4;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Leg2;->a:I

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Leg2;->b:Ljava/lang/Object;

    .line 129
    iput-object p2, p0, Leg2;->c:Ljava/lang/Object;

    .line 130
    iput-object p3, p0, Leg2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp40;Lnk1;Ljava/lang/reflect/Type;Lbz4;Ljava/lang/reflect/Type;Lbz4;Lo73;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Leg2;->a:I

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    new-instance p1, Leg2;

    invoke-direct {p1, p2, p4, p3}, Leg2;-><init>(Lnk1;Lbz4;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Leg2;->b:Ljava/lang/Object;

    .line 133
    new-instance p1, Leg2;

    invoke-direct {p1, p2, p6, p5}, Leg2;-><init>(Lnk1;Lbz4;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Leg2;->c:Ljava/lang/Object;

    .line 134
    iput-object p7, p0, Leg2;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ll32;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Leg2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Leg2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Leg2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 v4, 0x9

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ll32;->e0()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-ne p0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ll32;->a0()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Ll32;->c0()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast v1, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v2, p1

    .line 34
    check-cast v2, Ljava/lang/Enum;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    check-cast v3, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v3, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    move-object v2, p0

    .line 45
    check-cast v2, Ljava/lang/Enum;

    .line 46
    .line 47
    :cond_1
    :goto_0
    return-object v2

    .line 48
    :pswitch_0
    check-cast v3, Lbz4;

    .line 49
    .line 50
    invoke-virtual {v3, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast v3, Leg2;

    .line 56
    .line 57
    iget-object v0, v3, Leg2;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lbz4;

    .line 60
    .line 61
    check-cast v1, Leg2;

    .line 62
    .line 63
    iget-object v1, v1, Leg2;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lbz4;

    .line 66
    .line 67
    invoke-virtual {p1}, Ll32;->e0()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v3, v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1}, Ll32;->a0()V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_2
    iget-object p0, p0, Leg2;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Lo73;

    .line 81
    .line 82
    invoke-interface {p0}, Lo73;->A()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    move-object v2, p0

    .line 87
    check-cast v2, Ljava/util/Map;

    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    const-string v5, "duplicate key: "

    .line 91
    .line 92
    if-ne v3, p0, :cond_5

    .line 93
    .line 94
    invoke-virtual {p1}, Ll32;->b()V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {p1}, Ll32;->J()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    invoke-virtual {p1}, Ll32;->b()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v0, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v2, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-nez v3, :cond_3

    .line 119
    .line 120
    invoke-virtual {p1}, Ll32;->q()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_4
    invoke-virtual {p1}, Ll32;->q()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_5
    invoke-virtual {p1}, Ll32;->f()V

    .line 148
    .line 149
    .line 150
    :goto_2
    invoke-virtual {p1}, Ll32;->J()Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_c

    .line 155
    .line 156
    sget-object p0, Lfz0;->i0:Lfz0;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    instance-of p0, p1, Ln32;

    .line 162
    .line 163
    if-eqz p0, :cond_6

    .line 164
    .line 165
    move-object p0, p1

    .line 166
    check-cast p0, Ln32;

    .line 167
    .line 168
    const/4 v3, 0x5

    .line 169
    invoke-virtual {p0, v3}, Ln32;->m0(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Ln32;->q0()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/util/Iterator;

    .line 177
    .line 178
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/util/Map$Entry;

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-virtual {p0, v6}, Ln32;->s0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    new-instance v6, Lk32;

    .line 192
    .line 193
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/String;

    .line 198
    .line 199
    invoke-direct {v6, v3}, Lk32;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v6}, Ln32;->s0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_6
    iget p0, p1, Ll32;->u:I

    .line 207
    .line 208
    if-nez p0, :cond_7

    .line 209
    .line 210
    invoke-virtual {p1}, Ll32;->n()I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    :cond_7
    const/16 v3, 0xd

    .line 215
    .line 216
    if-ne p0, v3, :cond_8

    .line 217
    .line 218
    iput v4, p1, Ll32;->u:I

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_8
    const/16 v3, 0xc

    .line 222
    .line 223
    if-ne p0, v3, :cond_9

    .line 224
    .line 225
    const/16 p0, 0x8

    .line 226
    .line 227
    iput p0, p1, Ll32;->u:I

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_9
    const/16 v3, 0xe

    .line 231
    .line 232
    if-ne p0, v3, :cond_a

    .line 233
    .line 234
    const/16 p0, 0xa

    .line 235
    .line 236
    iput p0, p1, Ll32;->u:I

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_a
    invoke-virtual {p1}, Ll32;->e0()I

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    invoke-static {p0}, Lb11;->x(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p1}, Ll32;->M()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    const-string v6, "Expected a name but was "

    .line 252
    .line 253
    invoke-static {p0, v3, v6}, Ler1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :goto_3
    invoke-virtual {v1, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {v0, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-interface {v2, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-nez v3, :cond_b

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_b
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 272
    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw p1

    .line 289
    :cond_c
    invoke-virtual {p1}, Ll32;->s()V

    .line 290
    .line 291
    .line 292
    :goto_4
    return-object v2

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lq32;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Leg2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Leg2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Leg2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p2, Ljava/lang/Enum;

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast v2, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1, p0}, Lq32;->W(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast v1, Lbz4;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/reflect/Type;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    instance-of v0, v2, Ljava/lang/Class;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    instance-of v0, v2, Ljava/lang/reflect/TypeVariable;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v0, v2

    .line 48
    :goto_1
    if-eq v0, v2, :cond_7

    .line 49
    .line 50
    iget-object p0, p0, Leg2;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lnk1;

    .line 53
    .line 54
    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of v0, p0, Lqx3;

    .line 63
    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    move-object v0, v1

    .line 68
    :goto_2
    instance-of v2, v0, Lja4;

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    move-object v2, v0

    .line 73
    check-cast v2, Lja4;

    .line 74
    .line 75
    invoke-virtual {v2}, Lja4;->c()Lbz4;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-ne v2, v0, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-object v0, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    :goto_3
    instance-of v0, v0, Lqx3;

    .line 85
    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_6
    :goto_4
    move-object v1, p0

    .line 90
    :cond_7
    :goto_5
    invoke-virtual {v1, p1, p2}, Lbz4;->b(Lq32;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_1
    check-cast p2, Ljava/util/Map;

    .line 95
    .line 96
    check-cast v1, Leg2;

    .line 97
    .line 98
    if-nez p2, :cond_8

    .line 99
    .line 100
    invoke-virtual {p1}, Lq32;->F()Lq32;

    .line 101
    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_8
    invoke-virtual {p1}, Lq32;->j()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_9

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, Ljava/util/Map$Entry;

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1, v0}, Lq32;->u(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {v1, p1, p2}, Leg2;->b(Lq32;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_9
    invoke-virtual {p1}, Lq32;->s()V

    .line 147
    .line 148
    .line 149
    :goto_7
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
