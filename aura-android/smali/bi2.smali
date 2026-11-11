.class public final synthetic Lbi2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbi2;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ltv1;I)V
    .locals 0

    .line 7
    iput p2, p0, Lbi2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget p0, p0, Lbi2;->a:I

    .line 2
    .line 3
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 4
    .line 5
    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    .line 6
    .line 7
    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    .line 8
    .line 9
    const-wide/high16 v6, 0x403e000000000000L    # 30.0

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const-wide/high16 v9, 0x4054000000000000L    # 80.0

    .line 13
    .line 14
    const-wide v11, 0x4056800000000000L    # 90.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    packed-switch p0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const-class p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 23
    .line 24
    check-cast p1, Lcom/eddyizm/tempus/model/Queue;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/model/Queue;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/model/Queue;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_2
    check-cast p1, Ld64;

    .line 44
    .line 45
    iget-boolean p0, p1, Ld64;->c:Z

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    new-instance p0, Lzh2;

    .line 50
    .line 51
    const/16 p1, 0x1d

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lzh2;-><init>(I)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lai2;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {p1, v0}, Lai2;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1, v8, v8}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    new-instance p0, Lzh2;

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    invoke-direct {p0, p1}, Lzh2;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lzh2;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    invoke-direct {p1, v0}, Lzh2;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, p1, v8, v8}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_0
    return-object p0

    .line 84
    :pswitch_3
    check-cast p1, Ld64;

    .line 85
    .line 86
    invoke-static {p1}, Ltv1;->C(Ld64;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    iget-boolean p1, p1, Ld64;->c:Z

    .line 91
    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    const-wide/16 p0, 0x0

    .line 100
    .line 101
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    if-eqz p1, :cond_3

    .line 107
    .line 108
    move-wide v2, v9

    .line 109
    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :goto_2
    return-object p0

    .line 114
    :pswitch_4
    check-cast p1, Ld64;

    .line 115
    .line 116
    iget-object p0, p1, Ld64;->e:Ltu4;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_5
    check-cast p1, Ld64;

    .line 120
    .line 121
    iget-boolean p0, p1, Ld64;->c:Z

    .line 122
    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    move-wide v6, v11

    .line 127
    :goto_3
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_6
    check-cast p1, Ld64;

    .line 133
    .line 134
    iget-object p0, p1, Ld64;->j:Ltu4;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_7
    check-cast p1, Ld64;

    .line 138
    .line 139
    iget-boolean p0, p1, Ld64;->c:Z

    .line 140
    .line 141
    if-eqz p0, :cond_5

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    move-wide v6, v9

    .line 145
    :goto_4
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :pswitch_8
    check-cast p1, Ld64;

    .line 151
    .line 152
    iget-object p0, p1, Ld64;->i:Ltu4;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_9
    check-cast p1, Ld64;

    .line 156
    .line 157
    iget-boolean p0, p1, Ld64;->c:Z

    .line 158
    .line 159
    if-eqz p0, :cond_6

    .line 160
    .line 161
    move-wide v4, v11

    .line 162
    :cond_6
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :pswitch_a
    check-cast p1, Ld64;

    .line 168
    .line 169
    iget-object p0, p1, Ld64;->j:Ltu4;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_b
    check-cast p1, Ld64;

    .line 173
    .line 174
    iget-boolean p0, p1, Ld64;->c:Z

    .line 175
    .line 176
    if-eqz p0, :cond_7

    .line 177
    .line 178
    move-wide v0, v11

    .line 179
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :pswitch_c
    check-cast p1, Ld64;

    .line 185
    .line 186
    iget-boolean p0, p1, Ld64;->c:Z

    .line 187
    .line 188
    if-eqz p0, :cond_8

    .line 189
    .line 190
    move-wide v4, v11

    .line 191
    :cond_8
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_d
    check-cast p1, Ld64;

    .line 197
    .line 198
    iget-object p0, p1, Ld64;->h:Ltu4;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_e
    check-cast p1, Ld64;

    .line 202
    .line 203
    new-instance p0, Lai2;

    .line 204
    .line 205
    const/16 p1, 0xd

    .line 206
    .line 207
    invoke-direct {p0, p1}, Lai2;-><init>(I)V

    .line 208
    .line 209
    .line 210
    new-instance p1, Lai2;

    .line 211
    .line 212
    const/16 v0, 0xe

    .line 213
    .line 214
    invoke-direct {p1, v0}, Lai2;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-static {p0, p1, v8, v8}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0

    .line 222
    :pswitch_f
    check-cast p1, Ld64;

    .line 223
    .line 224
    iget-boolean p0, p1, Ld64;->c:Z

    .line 225
    .line 226
    if-eqz p0, :cond_9

    .line 227
    .line 228
    move-wide v6, v9

    .line 229
    :cond_9
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :pswitch_10
    check-cast p1, Ld64;

    .line 235
    .line 236
    iget-object p0, p1, Ld64;->i:Ltu4;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_11
    check-cast p1, Ld64;

    .line 240
    .line 241
    iget-boolean p0, p1, Ld64;->c:Z

    .line 242
    .line 243
    if-eqz p0, :cond_a

    .line 244
    .line 245
    const-wide/high16 p0, 0x4028000000000000L    # 12.0

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_a
    const-wide p0, 0x4057800000000000L    # 94.0

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0

    .line 258
    :pswitch_12
    check-cast p1, Ld64;

    .line 259
    .line 260
    iget-object p0, p1, Ld64;->h:Ltu4;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_13
    check-cast p1, Ld64;

    .line 264
    .line 265
    iget-boolean p0, p1, Ld64;->c:Z

    .line 266
    .line 267
    if-eqz p0, :cond_b

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_b
    move-wide v4, v11

    .line 271
    :goto_6
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :pswitch_14
    check-cast p1, Ld64;

    .line 277
    .line 278
    iget-object p0, p1, Ld64;->h:Ltu4;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_15
    check-cast p1, Ld64;

    .line 282
    .line 283
    iget-boolean p0, p1, Ld64;->c:Z

    .line 284
    .line 285
    if-eqz p0, :cond_c

    .line 286
    .line 287
    move-wide v2, v9

    .line 288
    :cond_c
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_16
    check-cast p1, Ld64;

    .line 294
    .line 295
    iget-object p0, p1, Ld64;->h:Ltu4;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_17
    check-cast p1, Ld64;

    .line 299
    .line 300
    iget-object p0, p1, Ld64;->j:Ltu4;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_18
    check-cast p1, Ld64;

    .line 304
    .line 305
    iget-object p0, p1, Ld64;->f:Ltu4;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_19
    check-cast p1, Ld64;

    .line 309
    .line 310
    iget-object p0, p1, Ld64;->g:Ltu4;

    .line 311
    .line 312
    return-object p0

    .line 313
    :pswitch_1a
    check-cast p1, Ld64;

    .line 314
    .line 315
    new-instance p0, Lbi2;

    .line 316
    .line 317
    const/16 p1, 0xf

    .line 318
    .line 319
    invoke-direct {p0, p1}, Lbi2;-><init>(I)V

    .line 320
    .line 321
    .line 322
    new-instance p1, Lbi2;

    .line 323
    .line 324
    const/16 v0, 0x11

    .line 325
    .line 326
    invoke-direct {p1, v0}, Lbi2;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-static {p0, p1, v8, v8}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    return-object p0

    .line 334
    :pswitch_1b
    check-cast p1, Ld64;

    .line 335
    .line 336
    iget-boolean p0, p1, Ld64;->c:Z

    .line 337
    .line 338
    if-eqz p0, :cond_d

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_d
    const-wide v0, 0x4057c00000000000L    # 95.0

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    :goto_7
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    return-object p0

    .line 351
    :pswitch_1c
    check-cast p1, Ld64;

    .line 352
    .line 353
    iget-object p0, p1, Ld64;->h:Ltu4;

    .line 354
    .line 355
    return-object p0

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
