.class public final synthetic Lnk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lqk3;


# direct methods
.method public synthetic constructor <init>(Lqk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnk3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnk3;->o:Lqk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lnk3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lnk3;->o:Lqk3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 13
    .line 14
    if-eqz v0, :cond_b

    .line 15
    .line 16
    iget-object v0, p0, Lqk3;->m0:Laj3;

    .line 17
    .line 18
    iget-object v0, v0, Laj3;->k:Lk03;

    .line 19
    .line 20
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 25
    .line 26
    invoke-static {}, Lu52;->c()Lv52;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-boolean v1, v1, Lv52;->a:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-static {}, Lu52;->c()Lv52;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v1, v2, v3}, Lv52;->b(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v1, p0, Lqk3;->o0:Lbj2;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, Lsk2;->M0()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-wide/16 v1, 0x0

    .line 57
    .line 58
    :goto_0
    long-to-int v1, v1

    .line 59
    invoke-static {v0}, Lqk3;->h0(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_b

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getLine()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_b

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_2
    move v3, v2

    .line 91
    move v4, v3

    .line 92
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-ge v3, v5, :cond_4

    .line 97
    .line 98
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Line;

    .line 103
    .line 104
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Line;->getStart()Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-le v5, v1, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    add-int/lit8 v4, v3, 0x1

    .line 118
    .line 119
    move v11, v4

    .line 120
    move v4, v3

    .line 121
    move v3, v11

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    :goto_2
    iget-object v1, p0, Lqk3;->t0:Ljava/lang/Integer;

    .line 124
    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-ne v4, v1, :cond_5

    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iput-object v1, p0, Lqk3;->t0:Ljava/lang/Integer;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_6

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Line;

    .line 161
    .line 162
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Line;->getValue()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v5, "\n\n"

    .line 174
    .line 175
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v3, Landroid/text/SpannableString;

    .line 184
    .line 185
    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    const/4 v1, -0x1

    .line 189
    move v5, v2

    .line 190
    move v6, v5

    .line 191
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-ge v5, v7, :cond_9

    .line 196
    .line 197
    if-ne v5, v4, :cond_7

    .line 198
    .line 199
    const/4 v7, 0x1

    .line 200
    goto :goto_5

    .line 201
    :cond_7
    move v7, v2

    .line 202
    :goto_5
    if-eqz v7, :cond_8

    .line 203
    .line 204
    move v1, v6

    .line 205
    :cond_8
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Line;

    .line 210
    .line 211
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Line;->getValue()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    add-int/lit8 v8, v8, 0x2

    .line 220
    .line 221
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    check-cast v9, Lcom/eddyizm/tempus/subsonic/models/Line;

    .line 226
    .line 227
    invoke-virtual {v9}, Lcom/eddyizm/tempus/subsonic/models/Line;->getStart()Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    new-instance v10, Lpk3;

    .line 236
    .line 237
    invoke-direct {v10, p0, v9, v7}, Lpk3;-><init>(Lqk3;IZ)V

    .line 238
    .line 239
    .line 240
    add-int/2addr v8, v6

    .line 241
    const/16 v7, 0x21

    .line 242
    .line 243
    invoke-virtual {v3, v10, v6, v8, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 244
    .line 245
    .line 246
    add-int/lit8 v5, v5, 0x1

    .line 247
    .line 248
    move v6, v8

    .line 249
    goto :goto_4

    .line 250
    :cond_9
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 251
    .line 252
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 261
    .line 262
    .line 263
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 264
    .line 265
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Landroid/widget/TextView;

    .line 268
    .line 269
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    if-ltz v1, :cond_b

    .line 273
    .line 274
    iget-object v0, p0, Lqk3;->m0:Laj3;

    .line 275
    .line 276
    iget-boolean v0, v0, Laj3;->s:Z

    .line 277
    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 281
    .line 282
    iget-object v3, v0, Lml3;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v3, Landroidx/core/widget/NestedScrollView;

    .line 285
    .line 286
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Landroid/widget/TextView;

    .line 289
    .line 290
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-nez v0, :cond_a

    .line 295
    .line 296
    move v0, v2

    .line 297
    goto :goto_6

    .line 298
    :cond_a
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineTop(I)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    add-int/2addr v0, v4

    .line 311
    div-int/lit8 v0, v0, 0x2

    .line 312
    .line 313
    iget-object v1, p0, Lqk3;->l0:Lml3;

    .line 314
    .line 315
    iget-object v1, v1, Lml3;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 318
    .line 319
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    div-int/lit8 v1, v1, 0x2

    .line 324
    .line 325
    sub-int/2addr v0, v1

    .line 326
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    :goto_6
    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    rsub-int/lit8 v1, v1, 0x0

    .line 335
    .line 336
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    sub-int/2addr v0, v4

    .line 341
    invoke-virtual {v3, v1, v0, v2}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    .line 342
    .line 343
    .line 344
    :cond_b
    :goto_7
    iget-object v0, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 345
    .line 346
    iget-object p0, p0, Lqk3;->q0:Lnk3;

    .line 347
    .line 348
    const-wide/16 v1, 0xfa

    .line 349
    .line 350
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 351
    .line 352
    .line 353
    :cond_c
    return-void

    .line 354
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lqk3;->n0:Lbl2;

    .line 355
    .line 356
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lbj2;

    .line 361
    .line 362
    iput-object v0, p0, Lqk3;->o0:Lbj2;

    .line 363
    .line 364
    iget-object v0, p0, Lqk3;->m0:Laj3;

    .line 365
    .line 366
    iget-object v0, v0, Laj3;->k:Lk03;

    .line 367
    .line 368
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    new-instance v2, Lmk3;

    .line 373
    .line 374
    const/4 v3, 0x4

    .line 375
    invoke-direct {v2, p0, v3}, Lmk3;-><init>(Lqk3;I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :catch_0
    move-exception p0

    .line 383
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 384
    .line 385
    .line 386
    :goto_8
    return-void

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
