.class public final synthetic Lun1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p6, p0, Lun1;->n:I

    iput-wide p1, p0, Lun1;->o:J

    iput-object p3, p0, Lun1;->p:Ljava/lang/Object;

    iput-object p4, p0, Lun1;->q:Ljava/lang/Object;

    iput-object p5, p0, Lun1;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lh62;JLjava/lang/Object;Landroid/net/nsd/NsdServiceInfo;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lun1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lun1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p2, p0, Lun1;->o:J

    .line 10
    .line 11
    iput-object p4, p0, Lun1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lun1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lh62;Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;J)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lun1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun1;->q:Ljava/lang/Object;

    iput-object p2, p0, Lun1;->r:Ljava/lang/Object;

    iput-object p3, p0, Lun1;->p:Ljava/lang/Object;

    iput-wide p4, p0, Lun1;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lun1;->n:I

    .line 2
    .line 3
    const v1, 0x7f1302b1

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lun1;->p:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v6, v0

    .line 13
    check-cast v6, Lh62;

    .line 14
    .line 15
    iget-wide v3, p0, Lun1;->o:J

    .line 16
    .line 17
    iget-object v0, p0, Lun1;->q:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p0, p0, Lun1;->r:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v7, p0

    .line 22
    check-cast v7, Landroid/net/nsd/NsdServiceInfo;

    .line 23
    .line 24
    invoke-virtual {v6, v3, v4}, Lh62;->l0(J)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    iput-boolean v2, v6, Lh62;->O0:Z

    .line 33
    .line 34
    instance-of p0, v0, Ls14;

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    if-nez p0, :cond_5

    .line 38
    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Ly42;

    .line 41
    .line 42
    iget-object p0, v5, Ly42;->a:Ljava/lang/String;

    .line 43
    .line 44
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 45
    .line 46
    iget-object v3, v6, Lh62;->t0:Landroid/content/Context;

    .line 47
    .line 48
    const-string v4, "app"

    .line 49
    .line 50
    if-eqz v3, :cond_4

    .line 51
    .line 52
    const-string v8, "lan-playback"

    .line 53
    .line 54
    invoke-virtual {v3, v8, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v8, "receivers"

    .line 59
    .line 60
    sget-object v10, Lz01;->n:Lz01;

    .line 61
    .line 62
    invoke-interface {v3, v8, v10}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {v8, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    iget-boolean v10, v5, Ly42;->c:Z

    .line 74
    .line 75
    if-eqz v10, :cond_2

    .line 76
    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    iget-object v2, v6, Lh62;->t0:Landroid/content/Context;

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    invoke-static {v2, v7, p0}, Lu52;->b(Landroid/content/Context;Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Lkc1;->X()Lnc1;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-static {v4}, Lh12;->Q(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v9

    .line 98
    :cond_2
    new-instance p0, Lvg2;

    .line 99
    .line 100
    invoke-virtual {v6}, Lkc1;->Z()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {p0, v4, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 105
    .line 106
    .line 107
    const v2, 0x7f1302cc

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lvg2;->p(I)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v5, Ly42;->b:Ljava/lang/String;

    .line 114
    .line 115
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const v4, 0x7f1302c6

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v4, v2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget-object v4, p0, Le9;->a:La9;

    .line 127
    .line 128
    iput-object v2, v4, La9;->f:Ljava/lang/CharSequence;

    .line 129
    .line 130
    move-object v4, v3

    .line 131
    new-instance v3, Lvs1;

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    invoke-direct/range {v3 .. v8}, Lvs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    const v2, 0x7f1302c7

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v2, v3}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const/high16 v2, 0x1040000

    .line 145
    .line 146
    invoke-virtual {p0, v2, v9}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    iput-object v9, v6, Lh62;->U0:Lh52;

    .line 155
    .line 156
    iget-object v2, v6, Lh62;->K0:Lf9;

    .line 157
    .line 158
    if-eqz v2, :cond_3

    .line 159
    .line 160
    invoke-virtual {v2}, Ldg;->dismiss()V

    .line 161
    .line 162
    .line 163
    :cond_3
    iput-object p0, v6, Lh62;->K0:Lf9;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_4
    invoke-static {v4}, Lh12;->Q(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v9

    .line 173
    :cond_5
    :goto_0
    invoke-static {v0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-eqz p0, :cond_f

    .line 178
    .line 179
    instance-of v0, p0, Lcom/eddyizm/tempus/lan/LanConnectionFailure;

    .line 180
    .line 181
    if-eqz v0, :cond_6

    .line 182
    .line 183
    check-cast p0, Lcom/eddyizm/tempus/lan/LanConnectionFailure;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    move-object p0, v9

    .line 187
    :goto_1
    if-eqz p0, :cond_7

    .line 188
    .line 189
    iget-object v9, p0, Lcom/eddyizm/tempus/lan/LanConnectionFailure;->n:Lr42;

    .line 190
    .line 191
    :cond_7
    const/4 p0, -0x1

    .line 192
    if-nez v9, :cond_8

    .line 193
    .line 194
    move v0, p0

    .line 195
    goto :goto_2

    .line 196
    :cond_8
    sget-object v0, Ld62;->a:[I

    .line 197
    .line 198
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    aget v0, v0, v2

    .line 203
    .line 204
    :goto_2
    if-eq v0, p0, :cond_e

    .line 205
    .line 206
    const/4 p0, 0x1

    .line 207
    if-eq v0, p0, :cond_d

    .line 208
    .line 209
    const/4 p0, 0x2

    .line 210
    if-eq v0, p0, :cond_c

    .line 211
    .line 212
    const/4 p0, 0x3

    .line 213
    if-eq v0, p0, :cond_b

    .line 214
    .line 215
    const/4 p0, 0x4

    .line 216
    if-eq v0, p0, :cond_a

    .line 217
    .line 218
    const/4 p0, 0x5

    .line 219
    if-ne v0, p0, :cond_9

    .line 220
    .line 221
    const v1, 0x7f1302dc

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_9
    invoke-static {}, Ler1;->n()V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    const v1, 0x7f1302bd

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_b
    const v1, 0x7f1302e8

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_c
    const v1, 0x7f1302af

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_d
    const v1, 0x7f1302bc

    .line 242
    .line 243
    .line 244
    :cond_e
    :goto_3
    invoke-virtual {v6, v1}, Lh62;->s0(I)V

    .line 245
    .line 246
    .line 247
    :cond_f
    :goto_4
    return-void

    .line 248
    :pswitch_0
    iget-object v0, p0, Lun1;->q:Ljava/lang/Object;

    .line 249
    .line 250
    move-object v2, v0

    .line 251
    check-cast v2, Lh62;

    .line 252
    .line 253
    iget-object v0, p0, Lun1;->r:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v6, v0

    .line 256
    check-cast v6, Landroid/net/nsd/NsdServiceInfo;

    .line 257
    .line 258
    iget-object v0, p0, Lun1;->p:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Ljava/lang/String;

    .line 261
    .line 262
    iget-wide v3, p0, Lun1;->o:J

    .line 263
    .line 264
    :try_start_0
    iget-object p0, v2, Lh62;->F0:Lz42;

    .line 265
    .line 266
    invoke-virtual {p0, v6, v0}, Lz42;->a(Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;)Ly42;

    .line 267
    .line 268
    .line 269
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    move-object v5, p0

    .line 271
    goto :goto_5

    .line 272
    :catchall_0
    move-exception v0

    .line 273
    move-object p0, v0

    .line 274
    new-instance v0, Ls14;

    .line 275
    .line 276
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    move-object v5, v0

    .line 280
    :goto_5
    iget-object p0, v2, Lh62;->D0:Landroid/os/Handler;

    .line 281
    .line 282
    new-instance v1, Lun1;

    .line 283
    .line 284
    invoke-direct/range {v1 .. v6}, Lun1;-><init>(Lh62;JLjava/lang/Object;Landroid/net/nsd/NsdServiceInfo;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_1
    iget-wide v3, p0, Lun1;->o:J

    .line 292
    .line 293
    iget-object v0, p0, Lun1;->p:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Ljava/lang/Exception;

    .line 296
    .line 297
    iget-object v5, p0, Lun1;->q:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v5, Lorg/json/JSONObject;

    .line 300
    .line 301
    iget-object p0, p0, Lun1;->r:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, Lgf1;

    .line 304
    .line 305
    sget-wide v6, Lu52;->i:J

    .line 306
    .line 307
    cmp-long v3, v6, v3

    .line 308
    .line 309
    if-nez v3, :cond_12

    .line 310
    .line 311
    instance-of v0, v0, Lq52;

    .line 312
    .line 313
    if-eqz v0, :cond_10

    .line 314
    .line 315
    const v1, 0x7f1302d3

    .line 316
    .line 317
    .line 318
    :cond_10
    sget-object v0, Lu52;->b:Lk03;

    .line 319
    .line 320
    invoke-static {}, Lu52;->c()Lv52;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    const v4, 0x1ffdffff

    .line 325
    .line 326
    .line 327
    invoke-static {v3, v2, v2, v1, v4}, Lv52;->a(Lv52;IIII)Lv52;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v0, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    const-string v0, "command"

    .line 335
    .line 336
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const-string v2, "queue_state"

    .line 341
    .line 342
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_11

    .line 347
    .line 348
    sget-object v0, Lu52;->a:Landroid/os/Handler;

    .line 349
    .line 350
    invoke-static {v1}, Lu52;->h(I)V

    .line 351
    .line 352
    .line 353
    :cond_11
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    :cond_12
    return-void

    .line 357
    :pswitch_2
    iget-wide v0, p0, Lun1;->o:J

    .line 358
    .line 359
    iget-object v2, p0, Lun1;->p:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v2, Ljava/lang/String;

    .line 362
    .line 363
    iget-object v3, p0, Lun1;->q:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v3, Ljava/util/function/Consumer;

    .line 366
    .line 367
    iget-object p0, p0, Lun1;->r:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast p0, Ljava/util/List;

    .line 370
    .line 371
    invoke-static {}, Ln61;->d()J

    .line 372
    .line 373
    .line 374
    move-result-wide v4

    .line 375
    cmp-long v0, v0, v4

    .line 376
    .line 377
    if-nez v0, :cond_13

    .line 378
    .line 379
    sget-object v0, Lb00;->a:Lb00;

    .line 380
    .line 381
    invoke-static {}, Lb00;->a()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v2, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_13

    .line 390
    .line 391
    invoke-static {p0}, Lkb4;->U(Ljava/util/List;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    invoke-interface {v3, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_13
    return-void

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
