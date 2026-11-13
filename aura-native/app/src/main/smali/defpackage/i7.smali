.class public final Ldefpackage/i7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/i7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/i7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/i7;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ldefpackage/k03;I)V
    .locals 0

    .line 11
    iput p3, p0, Ldefpackage/i7;->a:I

    iput-object p1, p0, Ldefpackage/i7;->c:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/i7;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/i7;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "Continuous Play: adding "

    .line 5
    .line 6
    const-string v3, "MediaManager"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Ldefpackage/i7;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, Ldefpackage/i7;->c:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    check-cast v6, Ldefpackage/ad2;

    .line 22
    .line 23
    invoke-virtual {v6, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 24
    .line 25
    .line 26
    check-cast v5, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 27
    .line 28
    iput-boolean v4, v5, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->v0:Z

    .line 29
    .line 30
    invoke-virtual {v5, p1}, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->h0(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 35
    .line 36
    check-cast v5, Ldefpackage/wk3;

    .line 37
    .line 38
    check-cast v6, Ldefpackage/aj3;

    .line 39
    .line 40
    invoke-virtual {v6}, Ldefpackage/aj3;->c()Ldefpackage/k03;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    move p0, v4

    .line 66
    :goto_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-ge p0, v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getCurrent()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move p0, v4

    .line 105
    :goto_2
    iget-object v0, v5, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string v1, "queue"

    .line 112
    .line 113
    invoke-static {v0, p1, p0, v1}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string p1, "Queue loaded"

    .line 121
    .line 122
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    const-string p1, "No saved queue found"

    .line 135
    .line 136
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-virtual {v5}, Ldefpackage/wk3;->k0()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 148
    .line 149
    check-cast v6, Ldefpackage/ao2;

    .line 150
    .line 151
    check-cast v5, Ldefpackage/k03;

    .line 152
    .line 153
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 154
    .line 155
    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_4

    .line 163
    .line 164
    invoke-static {v6, p1}, Ldefpackage/bo2;->a(Ldefpackage/ao2;Ljava/util/List;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_4

    .line 173
    .line 174
    new-instance p0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, " similar tracks"

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {v3, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    invoke-static {v6, p1}, Ldefpackage/bo2;->b(Ldefpackage/ao2;Ljava/util/List;)I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    sget-object v0, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 203
    .line 204
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v6}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-static {v0, p0, p1}, Ldefpackage/is3;->b(Ldefpackage/qi3;II)V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_4
    const-string p1, "fallback_to_random_tracks"

    .line 220
    .line 221
    invoke-static {p1, v4}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_5

    .line 226
    .line 227
    const-string p1, "Continuous Play: no new similar tracks, falling back to random songs"

    .line 228
    .line 229
    invoke-static {v3, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    const/16 p1, 0x19

    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    invoke-static {p1, v0, v0}, Ldefpackage/xi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance v0, Ldefpackage/i7;

    .line 240
    .line 241
    const/4 v1, 0x2

    .line 242
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/i7;-><init>(Ljava/lang/Object;Ldefpackage/k03;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_5
    const-string p0, "Continuous Play: no new similar tracks, random fallback disabled"

    .line 250
    .line 251
    invoke-static {v3, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    sget-object p0, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 255
    .line 256
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v6}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0, v1, v4}, Ldefpackage/is3;->b(Ldefpackage/qi3;II)V

    .line 264
    .line 265
    .line 266
    :goto_4
    return-void

    .line 267
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 268
    .line 269
    check-cast v6, Ldefpackage/i7;

    .line 270
    .line 271
    iget-object v0, v6, Ldefpackage/i7;->c:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Ldefpackage/ao2;

    .line 274
    .line 275
    check-cast v5, Ldefpackage/k03;

    .line 276
    .line 277
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 278
    .line 279
    .line 280
    if-eqz p1, :cond_7

    .line 281
    .line 282
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    if-nez p0, :cond_7

    .line 287
    .line 288
    invoke-static {v0, p1}, Ldefpackage/bo2;->a(Ldefpackage/ao2;Ljava/util/List;)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-nez p1, :cond_6

    .line 297
    .line 298
    new-instance p1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, " random tracks"

    .line 311
    .line 312
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {v3, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    invoke-static {v0, p0}, Ldefpackage/bo2;->b(Ldefpackage/ao2;Ljava/util/List;)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    goto :goto_6

    .line 331
    :cond_6
    const-string p0, "Continuous Play: random tracks already in queue"

    .line 332
    .line 333
    invoke-static {v3, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_7
    const-string p0, "Continuous Play: random fallback also empty"

    .line 338
    .line 339
    invoke-static {v3, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    :goto_5
    move p0, v4

    .line 343
    :goto_6
    sget-object p1, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 344
    .line 345
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-static {p1, v1, p0}, Ldefpackage/is3;->b(Ldefpackage/qi3;II)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 357
    .line 358
    check-cast v5, Ldefpackage/k03;

    .line 359
    .line 360
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 361
    .line 362
    .line 363
    if-eqz p1, :cond_8

    .line 364
    .line 365
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    if-nez p0, :cond_8

    .line 370
    .line 371
    check-cast v6, Ldefpackage/xd0;

    .line 372
    .line 373
    invoke-virtual {v6, p1}, Ldefpackage/xd0;->accept(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    :cond_8
    return-void

    .line 377
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 378
    .line 379
    if-eqz p1, :cond_9

    .line 380
    .line 381
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_9

    .line 386
    .line 387
    check-cast v6, Landroid/content/Context;

    .line 388
    .line 389
    invoke-static {v6}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {p1}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    new-instance v2, Ldefpackage/hu3;

    .line 402
    .line 403
    const/4 v3, 0x6

    .line 404
    invoke-direct {v2, v3}, Ldefpackage/hu3;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    check-cast p1, Ljava/util/List;

    .line 420
    .line 421
    invoke-virtual {v0, v1, p1, v4}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 422
    .line 423
    .line 424
    :cond_9
    check-cast v5, Ldefpackage/k03;

    .line 425
    .line 426
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    nop

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
