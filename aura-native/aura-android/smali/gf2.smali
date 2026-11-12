.class public final synthetic Lgf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lif2;


# direct methods
.method public synthetic constructor <init>(Lif2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgf2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lgf2;->o:Lif2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lgf2;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lgf2;->o:Lif2;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lif2;->s:Lf72;

    .line 12
    .line 13
    iget-object v3, v0, Lf72;->a:Lc72;

    .line 14
    .line 15
    invoke-static {v3}, Lh12;->A(Lc72;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget-boolean v3, v0, Lf72;->c:Z

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v3, v3, Lf63;->J:Lf63;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Lf63;->y0()Lef2;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    iget-object v2, v3, Lcf2;->C:Ldf2;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, Lf63;->J:Lf63;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget-object v2, v3, Lcf2;->C:Ldf2;

    .line 51
    .line 52
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 53
    .line 54
    iget-object v2, v0, Lf72;->a:Lc72;

    .line 55
    .line 56
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lra;

    .line 61
    .line 62
    invoke-virtual {v2}, Lra;->getPlacementScope()Lig3;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_2
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lf63;->y0()Lef2;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-wide v3, p0, Lif2;->A:J

    .line 78
    .line 79
    invoke-static {v2, v0, v3, v4}, Lig3;->j(Lig3;Ljg3;J)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_0
    iget-object v0, p0, Lif2;->s:Lf72;

    .line 84
    .line 85
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lf63;->y0()Lef2;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v2, p0, Lif2;->I:J

    .line 97
    .line 98
    invoke-interface {v0, v2, v3}, Lpi2;->r(J)Ljg3;

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_1
    iget-object v0, p0, Lif2;->s:Lf72;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    iput v3, v0, Lf72;->h:I

    .line 106
    .line 107
    iget-object v0, v0, Lf72;->a:Lc72;

    .line 108
    .line 109
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget-object v5, v4, Lf13;->n:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v4, v4, Lf13;->p:I

    .line 116
    .line 117
    move v6, v3

    .line 118
    :goto_1
    const v7, 0x7fffffff

    .line 119
    .line 120
    .line 121
    if-ge v6, v4, :cond_4

    .line 122
    .line 123
    aget-object v8, v5, v6

    .line 124
    .line 125
    check-cast v8, Lc72;

    .line 126
    .line 127
    iget-object v8, v8, Lc72;->R:Lf72;

    .line 128
    .line 129
    iget-object v8, v8, Lf72;->q:Lif2;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget v9, v8, Lif2;->v:I

    .line 135
    .line 136
    iput v9, v8, Lif2;->u:I

    .line 137
    .line 138
    iput v7, v8, Lif2;->v:I

    .line 139
    .line 140
    iget-object v7, v8, Lif2;->w:La72;

    .line 141
    .line 142
    sget-object v9, La72;->o:La72;

    .line 143
    .line 144
    if-ne v7, v9, :cond_3

    .line 145
    .line 146
    sget-object v7, La72;->p:La72;

    .line 147
    .line 148
    iput-object v7, v8, Lif2;->w:La72;

    .line 149
    .line 150
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget-object v5, v4, Lf13;->n:[Ljava/lang/Object;

    .line 158
    .line 159
    iget v4, v4, Lf13;->p:I

    .line 160
    .line 161
    move v6, v3

    .line 162
    :goto_2
    if-ge v6, v4, :cond_5

    .line 163
    .line 164
    aget-object v8, v5, v6

    .line 165
    .line 166
    check-cast v8, Lc72;

    .line 167
    .line 168
    iget-object v8, v8, Lc72;->R:Lf72;

    .line 169
    .line 170
    iget-object v8, v8, Lf72;->q:Lif2;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v8, v8, Lif2;->D:Ld72;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    add-int/lit8 v6, v6, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-virtual {p0}, Lif2;->c()Liz1;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, Liz1;->o0:Lhz1;

    .line 188
    .line 189
    if-eqz p0, :cond_f

    .line 190
    .line 191
    invoke-virtual {v0}, Lc72;->n()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, Lc13;

    .line 196
    .line 197
    iget-object v5, v4, Lc13;->n:Lf13;

    .line 198
    .line 199
    iget v5, v5, Lf13;->p:I

    .line 200
    .line 201
    move v6, v3

    .line 202
    :goto_3
    if-ge v6, v5, :cond_9

    .line 203
    .line 204
    invoke-virtual {v4, v6}, Lc13;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    check-cast v8, Lc72;

    .line 209
    .line 210
    iget-object v9, v8, Lc72;->Q:Lw12;

    .line 211
    .line 212
    iget-object v9, v9, Lw12;->e:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v9, Lf63;

    .line 215
    .line 216
    invoke-virtual {v9}, Lf63;->y0()Lef2;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    if-nez v9, :cond_6

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_6
    iget-boolean v10, v9, Lcf2;->B:Z

    .line 224
    .line 225
    if-eqz v10, :cond_8

    .line 226
    .line 227
    if-nez v2, :cond_7

    .line 228
    .line 229
    new-instance v2, Lq03;

    .line 230
    .line 231
    invoke-direct {v2}, Lq03;-><init>()V

    .line 232
    .line 233
    .line 234
    :cond_7
    invoke-virtual {v2, v8}, Lq03;->a(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_8
    iget-boolean v8, p0, Lcf2;->B:Z

    .line 238
    .line 239
    iput-boolean v8, v9, Lcf2;->B:Z

    .line 240
    .line 241
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    invoke-virtual {p0}, Lef2;->h0()Lvi2;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-interface {p0}, Lvi2;->c()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lc72;->n()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    check-cast p0, Lc13;

    .line 256
    .line 257
    iget-object v4, p0, Lc13;->n:Lf13;

    .line 258
    .line 259
    iget v4, v4, Lf13;->p:I

    .line 260
    .line 261
    move v5, v3

    .line 262
    :goto_5
    const/4 v6, 0x1

    .line 263
    if-ge v5, v4, :cond_c

    .line 264
    .line 265
    invoke-virtual {p0, v5}, Lc13;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    check-cast v8, Lc72;

    .line 270
    .line 271
    if-eqz v2, :cond_a

    .line 272
    .line 273
    invoke-virtual {v2, v8}, Lq03;->g(Ljava/lang/Object;)I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-ltz v9, :cond_a

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_a
    move v6, v3

    .line 281
    :goto_6
    iget-object v8, v8, Lc72;->Q:Lw12;

    .line 282
    .line 283
    iget-object v8, v8, Lw12;->e:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v8, Lf63;

    .line 286
    .line 287
    invoke-virtual {v8}, Lf63;->y0()Lef2;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    if-eqz v8, :cond_b

    .line 292
    .line 293
    iput-boolean v6, v8, Lcf2;->B:Z

    .line 294
    .line 295
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    iget-object v2, p0, Lf13;->n:[Ljava/lang/Object;

    .line 303
    .line 304
    iget p0, p0, Lf13;->p:I

    .line 305
    .line 306
    move v4, v3

    .line 307
    :goto_7
    if-ge v4, p0, :cond_e

    .line 308
    .line 309
    aget-object v5, v2, v4

    .line 310
    .line 311
    check-cast v5, Lc72;

    .line 312
    .line 313
    iget-object v5, v5, Lc72;->R:Lf72;

    .line 314
    .line 315
    iget-object v5, v5, Lf72;->q:Lif2;

    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    iget v8, v5, Lif2;->u:I

    .line 321
    .line 322
    iget v9, v5, Lif2;->v:I

    .line 323
    .line 324
    if-eq v8, v9, :cond_d

    .line 325
    .line 326
    if-ne v9, v7, :cond_d

    .line 327
    .line 328
    invoke-virtual {v5, v6}, Lif2;->X(Z)V

    .line 329
    .line 330
    .line 331
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_e
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    iget-object v0, p0, Lf13;->n:[Ljava/lang/Object;

    .line 339
    .line 340
    iget p0, p0, Lf13;->p:I

    .line 341
    .line 342
    move v2, v3

    .line 343
    :goto_8
    if-ge v2, p0, :cond_10

    .line 344
    .line 345
    aget-object v4, v0, v2

    .line 346
    .line 347
    check-cast v4, Lc72;

    .line 348
    .line 349
    iget-object v4, v4, Lc72;->R:Lf72;

    .line 350
    .line 351
    iget-object v4, v4, Lf72;->q:Lif2;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v4, v4, Lif2;->D:Ld72;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iput-boolean v3, v4, Ld72;->c:Z

    .line 362
    .line 363
    add-int/lit8 v2, v2, 0x1

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_f
    const-string p0, "Expected lookahead delegate"

    .line 367
    .line 368
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    move-object v1, v2

    .line 372
    :cond_10
    return-object v1

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
