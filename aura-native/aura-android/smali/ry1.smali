.class public final synthetic Lry1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Lb13;)V
    .locals 1

    .line 16
    const/4 v0, 0x3

    iput v0, p0, Lry1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lry1;->p:Ljava/lang/Object;

    iput-object p2, p0, Lry1;->q:Ljava/lang/Object;

    iput-object p3, p0, Lry1;->r:Ljava/lang/Object;

    iput-object p4, p0, Lry1;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lgx3;Lhy2;Le74;Ley2;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lry1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lry1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lry1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lry1;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lry1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Lry1;->n:I

    iput-object p1, p0, Lry1;->o:Ljava/lang/Object;

    iput-object p2, p0, Lry1;->p:Ljava/lang/Object;

    iput-object p3, p0, Lry1;->q:Ljava/lang/Object;

    iput-object p4, p0, Lry1;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lry1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Lj15;->a:Lj15;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, Lry1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lry1;->r:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lry1;->q:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, Lry1;->p:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    check-cast v7, Landroid/net/Uri;

    .line 23
    .line 24
    check-cast v6, Ljava/lang/String;

    .line 25
    .line 26
    check-cast v5, Lb13;

    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Lyr0;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v1, Li73;

    .line 36
    .line 37
    invoke-direct {v1, v5, v4}, Li73;-><init>(Lb13;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Lc04;->g()Lvz3;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v7}, Lvz3;->N(Landroid/net/Uri;)Lvz3;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v3, 0x8

    .line 53
    .line 54
    invoke-static {v3, v0, v6}, Lwg0;->a(ILandroid/content/Context;Ljava/lang/String;)Lg04;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Lvz3;->G(Llq;)Lvz3;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v7}, Lxt3;->a(Lvz3;Landroid/net/Uri;)Lvz3;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    sget-object v4, Lfh0;->g:Lof;

    .line 74
    .line 75
    invoke-virtual {v2, v1, v3, v2, v4}, Lvz3;->J(Lwq4;Lyz3;Llq;Ljava/util/concurrent/Executor;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Lvy1;

    .line 79
    .line 80
    const/4 v3, 0x2

    .line 81
    invoke-direct {v2, v3, v0, v1}, Lvy1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_0
    check-cast v7, Lgx3;

    .line 86
    .line 87
    check-cast v5, Lhy2;

    .line 88
    .line 89
    check-cast v0, Le74;

    .line 90
    .line 91
    check-cast v6, Ley2;

    .line 92
    .line 93
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Lvd;

    .line 96
    .line 97
    iget-object v2, v1, Lvd;->e:Lzd3;

    .line 98
    .line 99
    invoke-virtual {v2}, Lzd3;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    iget v4, v7, Lgx3;->n:F

    .line 110
    .line 111
    sub-float/2addr v2, v4

    .line 112
    invoke-static {v2}, Lh12;->b(F)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_1

    .line 117
    .line 118
    invoke-virtual {v5, v0, v2}, Lhy2;->G(Le74;F)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sub-float v0, v2, v0

    .line 123
    .line 124
    invoke-static {v0}, Lh12;->b(F)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_0

    .line 129
    .line 130
    invoke-virtual {v1}, Lvd;->a()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_0
    iget v0, v7, Lgx3;->n:F

    .line 135
    .line 136
    add-float/2addr v0, v2

    .line 137
    iput v0, v7, Lgx3;->n:F

    .line 138
    .line 139
    :cond_1
    iget v0, v7, Lgx3;->n:F

    .line 140
    .line 141
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v6, v0}, Ley2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-virtual {v1}, Lvd;->a()V

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_0
    return-object v3

    .line 161
    :pswitch_1
    check-cast v5, Lq82;

    .line 162
    .line 163
    check-cast v0, Lc82;

    .line 164
    .line 165
    check-cast v7, Lkn4;

    .line 166
    .line 167
    check-cast v6, Lwp3;

    .line 168
    .line 169
    move-object/from16 v1, p1

    .line 170
    .line 171
    check-cast v1, Lyr0;

    .line 172
    .line 173
    new-instance v1, Lll;

    .line 174
    .line 175
    invoke-direct {v1, v0, v7, v6}, Lll;-><init>(Lc82;Lkn4;Lwp3;)V

    .line 176
    .line 177
    .line 178
    iput-object v1, v5, Lq82;->c:Lll;

    .line 179
    .line 180
    new-instance v0, La82;

    .line 181
    .line 182
    invoke-direct {v0, v2, v5}, La82;-><init>(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_2
    check-cast v5, Lb13;

    .line 187
    .line 188
    check-cast v0, Lty1;

    .line 189
    .line 190
    check-cast v7, Lgx3;

    .line 191
    .line 192
    check-cast v6, Lwe0;

    .line 193
    .line 194
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, Ljava/lang/Long;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    invoke-interface {v5}, Lkl4;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lkl4;

    .line 207
    .line 208
    if-eqz v1, :cond_3

    .line 209
    .line 210
    invoke-interface {v1}, Lkl4;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v10

    .line 220
    goto :goto_1

    .line 221
    :cond_3
    move-wide v10, v8

    .line 222
    :goto_1
    iget-wide v12, v0, Lty1;->c:J

    .line 223
    .line 224
    iget-object v1, v0, Lty1;->a:Lf13;

    .line 225
    .line 226
    const-wide/high16 v14, -0x8000000000000000L

    .line 227
    .line 228
    cmp-long v5, v12, v14

    .line 229
    .line 230
    if-eqz v5, :cond_4

    .line 231
    .line 232
    iget v5, v7, Lgx3;->n:F

    .line 233
    .line 234
    invoke-interface {v6}, Lwe0;->e()Lne0;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    invoke-static {v12}, Lj51;->v(Lne0;)F

    .line 239
    .line 240
    .line 241
    move-result v12

    .line 242
    cmpg-float v5, v5, v12

    .line 243
    .line 244
    if-nez v5, :cond_4

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_4
    iput-wide v8, v0, Lty1;->c:J

    .line 248
    .line 249
    iget-object v5, v1, Lf13;->n:[Ljava/lang/Object;

    .line 250
    .line 251
    iget v8, v1, Lf13;->p:I

    .line 252
    .line 253
    move v9, v4

    .line 254
    :goto_2
    if-ge v9, v8, :cond_5

    .line 255
    .line 256
    aget-object v12, v5, v9

    .line 257
    .line 258
    check-cast v12, Lqy1;

    .line 259
    .line 260
    iput-boolean v2, v12, Lqy1;->s:Z

    .line 261
    .line 262
    add-int/lit8 v9, v9, 0x1

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_5
    invoke-interface {v6}, Lwe0;->e()Lne0;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-static {v5}, Lj51;->v(Lne0;)F

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    iput v5, v7, Lgx3;->n:F

    .line 274
    .line 275
    :goto_3
    iget v5, v7, Lgx3;->n:F

    .line 276
    .line 277
    const/4 v6, 0x0

    .line 278
    cmpg-float v6, v5, v6

    .line 279
    .line 280
    if-nez v6, :cond_6

    .line 281
    .line 282
    iget-object v0, v1, Lf13;->n:[Ljava/lang/Object;

    .line 283
    .line 284
    iget v1, v1, Lf13;->p:I

    .line 285
    .line 286
    :goto_4
    if-ge v4, v1, :cond_b

    .line 287
    .line 288
    aget-object v5, v0, v4

    .line 289
    .line 290
    check-cast v5, Lqy1;

    .line 291
    .line 292
    iget-object v6, v5, Lqy1;->q:Lyq4;

    .line 293
    .line 294
    iget-object v6, v6, Lyq4;->c:Ljava/lang/Float;

    .line 295
    .line 296
    iget-object v7, v5, Lqy1;->p:Lzd3;

    .line 297
    .line 298
    invoke-virtual {v7, v6}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iput-boolean v2, v5, Lqy1;->s:Z

    .line 302
    .line 303
    add-int/lit8 v4, v4, 0x1

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_6
    iget-wide v6, v0, Lty1;->c:J

    .line 307
    .line 308
    sub-long/2addr v10, v6

    .line 309
    long-to-float v6, v10

    .line 310
    div-float/2addr v6, v5

    .line 311
    float-to-long v5, v6

    .line 312
    iget-object v7, v1, Lf13;->n:[Ljava/lang/Object;

    .line 313
    .line 314
    iget v1, v1, Lf13;->p:I

    .line 315
    .line 316
    move v9, v2

    .line 317
    move v8, v4

    .line 318
    :goto_5
    if-ge v8, v1, :cond_a

    .line 319
    .line 320
    aget-object v10, v7, v8

    .line 321
    .line 322
    check-cast v10, Lqy1;

    .line 323
    .line 324
    iget-boolean v11, v10, Lqy1;->r:Z

    .line 325
    .line 326
    if-nez v11, :cond_8

    .line 327
    .line 328
    iget-object v11, v10, Lqy1;->u:Lty1;

    .line 329
    .line 330
    iget-object v11, v11, Lty1;->b:Lzd3;

    .line 331
    .line 332
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 333
    .line 334
    invoke-virtual {v11, v12}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    iget-boolean v11, v10, Lqy1;->s:Z

    .line 338
    .line 339
    if-eqz v11, :cond_7

    .line 340
    .line 341
    iput-boolean v4, v10, Lqy1;->s:Z

    .line 342
    .line 343
    iput-wide v5, v10, Lqy1;->t:J

    .line 344
    .line 345
    :cond_7
    iget-wide v11, v10, Lqy1;->t:J

    .line 346
    .line 347
    sub-long v11, v5, v11

    .line 348
    .line 349
    iget-object v13, v10, Lqy1;->q:Lyq4;

    .line 350
    .line 351
    invoke-virtual {v13, v11, v12}, Lyq4;->f(J)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    iget-object v14, v10, Lqy1;->p:Lzd3;

    .line 356
    .line 357
    invoke-virtual {v14, v13}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-object v13, v10, Lqy1;->q:Lyq4;

    .line 361
    .line 362
    invoke-interface {v13, v11, v12}, Lrd;->e(J)Z

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    iput-boolean v11, v10, Lqy1;->r:Z

    .line 367
    .line 368
    :cond_8
    iget-boolean v10, v10, Lqy1;->r:Z

    .line 369
    .line 370
    if-nez v10, :cond_9

    .line 371
    .line 372
    move v9, v4

    .line 373
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_a
    xor-int/lit8 v1, v9, 0x1

    .line 377
    .line 378
    iget-object v0, v0, Lty1;->d:Lzd3;

    .line 379
    .line 380
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-virtual {v0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_b
    return-object v3

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
