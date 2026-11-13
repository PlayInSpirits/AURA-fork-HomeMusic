.class public final Ldefpackage/o7;
.super Landroid/widget/Filter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Landroid/widget/Filterable;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 11
    const/4 v0, 0x4

    iput v0, p0, Ldefpackage/o7;->a:I

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/dw3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/o7;->a:I

    .line 2
    .line 3
    check-cast p1, Landroid/widget/Filterable;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/o7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/Filter;->convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/pg0;

    .line 14
    .line 15
    check-cast p1, Landroid/database/Cursor;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/pg0;->c(Landroid/database/Cursor;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/o7;->a:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/ni4;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Ldefpackage/ni4;->w:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, p0, Ldefpackage/ni4;->u:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    :goto_1
    iget-object p0, p0, Ldefpackage/ni4;->u:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    :cond_3
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 84
    .line 85
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_0
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 92
    .line 93
    check-cast p0, Ldefpackage/ej;

    .line 94
    .line 95
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    :cond_5
    :goto_2
    if-ge v3, v1, :cond_7

    .line 128
    .line 129
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_5

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_6
    :goto_3
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 158
    .line 159
    .line 160
    :cond_7
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 161
    .line 162
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_1
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 169
    .line 170
    check-cast p0, Ldefpackage/ej;

    .line 171
    .line 172
    new-instance v0, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    if-eqz p1, :cond_a

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_8

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    :cond_9
    :goto_4
    if-ge v3, v1, :cond_b

    .line 205
    .line 206
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    add-int/lit8 v3, v3, 0x1

    .line 211
    .line 212
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 213
    .line 214
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_9

    .line 227
    .line 228
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_a
    :goto_5
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 235
    .line 236
    .line 237
    :cond_b
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 238
    .line 239
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    iput p1, p0, Landroid/widget/Filter$FilterResults;->count:I

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_2
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 252
    .line 253
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 254
    .line 255
    .line 256
    if-eqz p1, :cond_c

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :cond_c
    if-nez v2, :cond_d

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_d
    move-object v1, v2

    .line 266
    :goto_6
    iput-object v1, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_3
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 270
    .line 271
    check-cast p0, Ldefpackage/ej;

    .line 272
    .line 273
    new-instance v0, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    if-eqz p1, :cond_10

    .line 279
    .line 280
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_e

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_e
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    :cond_f
    :goto_7
    if-ge v3, v1, :cond_11

    .line 306
    .line 307
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    add-int/lit8 v3, v3, 0x1

    .line 312
    .line 313
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 314
    .line 315
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_f

    .line 328
    .line 329
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_10
    :goto_8
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 336
    .line 337
    .line 338
    :cond_11
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 339
    .line 340
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 341
    .line 342
    .line 343
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_4
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 347
    .line 348
    check-cast p0, Ldefpackage/pg0;

    .line 349
    .line 350
    check-cast p0, Ldefpackage/co4;

    .line 351
    .line 352
    iget-object v0, p0, Ldefpackage/co4;->x:Landroidx/appcompat/widget/SearchView;

    .line 353
    .line 354
    if-nez p1, :cond_12

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_12
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    :goto_9
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-nez p1, :cond_14

    .line 366
    .line 367
    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    if-eqz p1, :cond_13

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_13
    :try_start_0
    iget-object p1, p0, Ldefpackage/co4;->y:Landroid/app/SearchableInfo;

    .line 375
    .line 376
    invoke-virtual {p0, p1, v1}, Ldefpackage/co4;->f(Landroid/app/SearchableInfo;Ljava/lang/String;)Landroid/database/Cursor;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    if-eqz p0, :cond_14

    .line 381
    .line 382
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 383
    .line 384
    .line 385
    goto :goto_b

    .line 386
    :catch_0
    move-exception p0

    .line 387
    const-string p1, "SuggestionsAdapter"

    .line 388
    .line 389
    const-string v0, "Search suggestions query threw an exception."

    .line 390
    .line 391
    invoke-static {p1, v0, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 392
    .line 393
    .line 394
    :cond_14
    :goto_a
    move-object p0, v2

    .line 395
    :goto_b
    new-instance p1, Landroid/widget/Filter$FilterResults;

    .line 396
    .line 397
    invoke-direct {p1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 398
    .line 399
    .line 400
    if-eqz p0, :cond_15

    .line 401
    .line 402
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    iput v0, p1, Landroid/widget/Filter$FilterResults;->count:I

    .line 407
    .line 408
    iput-object p0, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 409
    .line 410
    goto :goto_c

    .line 411
    :cond_15
    iput v3, p1, Landroid/widget/Filter$FilterResults;->count:I

    .line 412
    .line 413
    iput-object v2, p1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 414
    .line 415
    :goto_c
    return-object p1

    .line 416
    :pswitch_5
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 417
    .line 418
    check-cast p0, Ldefpackage/b8;

    .line 419
    .line 420
    new-instance v0, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 423
    .line 424
    .line 425
    if-eqz p1, :cond_18

    .line 426
    .line 427
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-nez v1, :cond_16

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_16
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    iput-object p1, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 447
    .line 448
    iget-object p0, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 449
    .line 450
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    :cond_17
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_19

    .line 459
    .line 460
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 465
    .line 466
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_17

    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_18
    :goto_e
    iget-object p0, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 485
    .line 486
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 487
    .line 488
    .line 489
    :cond_19
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 490
    .line 491
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 492
    .line 493
    .line 494
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 495
    .line 496
    return-object p0

    .line 497
    :pswitch_6
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 498
    .line 499
    check-cast p0, Ldefpackage/ej;

    .line 500
    .line 501
    new-instance v0, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    if-eqz p1, :cond_1c

    .line 507
    .line 508
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-nez v1, :cond_1a

    .line 513
    .line 514
    goto :goto_10

    .line 515
    :cond_1a
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object p1

    .line 519
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    :cond_1b
    :goto_f
    if-ge v3, v1, :cond_1d

    .line 534
    .line 535
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    add-int/lit8 v3, v3, 0x1

    .line 540
    .line 541
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 542
    .line 543
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_1b

    .line 556
    .line 557
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    goto :goto_f

    .line 561
    :cond_1c
    :goto_10
    iget-object p0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 562
    .line 563
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 564
    .line 565
    .line 566
    :cond_1d
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 567
    .line 568
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 569
    .line 570
    .line 571
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 572
    .line 573
    return-object p0

    .line 574
    :pswitch_7
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 575
    .line 576
    check-cast p0, Ldefpackage/b8;

    .line 577
    .line 578
    new-instance v0, Ljava/util/ArrayList;

    .line 579
    .line 580
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 581
    .line 582
    .line 583
    if-eqz p1, :cond_20

    .line 584
    .line 585
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    if-nez v1, :cond_1e

    .line 590
    .line 591
    goto :goto_12

    .line 592
    :cond_1e
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    iput-object p1, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 605
    .line 606
    iget-object p0, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 607
    .line 608
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    :cond_1f
    :goto_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    if-eqz v1, :cond_21

    .line 617
    .line 618
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 623
    .line 624
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    if-eqz v2, :cond_1f

    .line 637
    .line 638
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    goto :goto_11

    .line 642
    :cond_20
    :goto_12
    iget-object p0, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 643
    .line 644
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 645
    .line 646
    .line 647
    :cond_21
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 648
    .line 649
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 650
    .line 651
    .line 652
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 653
    .line 654
    return-object p0

    .line 655
    :pswitch_8
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 656
    .line 657
    check-cast p0, Ldefpackage/q7;

    .line 658
    .line 659
    new-instance v0, Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 662
    .line 663
    .line 664
    if-eqz p1, :cond_24

    .line 665
    .line 666
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    if-nez v1, :cond_22

    .line 671
    .line 672
    goto :goto_14

    .line 673
    :cond_22
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    iget-object p0, p0, Ldefpackage/q7;->t:Ljava/util/List;

    .line 686
    .line 687
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object p0

    .line 691
    :cond_23
    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-eqz v1, :cond_25

    .line 696
    .line 697
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 702
    .line 703
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    if-eqz v2, :cond_23

    .line 716
    .line 717
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    goto :goto_13

    .line 721
    :cond_24
    :goto_14
    iget-object p0, p0, Ldefpackage/q7;->t:Ljava/util/List;

    .line 722
    .line 723
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 724
    .line 725
    .line 726
    :cond_25
    new-instance p0, Landroid/widget/Filter$FilterResults;

    .line 727
    .line 728
    invoke-direct {p0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 729
    .line 730
    .line 731
    iput-object v0, p0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 732
    .line 733
    return-object p0

    .line 734
    nop

    .line 735
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/o7;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    iget-object p2, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 11
    .line 12
    check-cast p2, Ldefpackage/ni4;

    .line 13
    .line 14
    iget-object p2, p2, Ldefpackage/ni4;->v:Ldefpackage/pk;

    .line 15
    .line 16
    new-instance v0, Ldefpackage/jq3;

    .line 17
    .line 18
    const/16 v1, 0x9

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Ldefpackage/jq3;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1, v0}, Ldefpackage/pk;->b(Ljava/util/List;Ldefpackage/jq3;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/ej;

    .line 30
    .line 31
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 34
    .line 35
    .line 36
    iget p1, p2, Landroid/widget/Filter$FilterResults;->count:I

    .line 37
    .line 38
    if-lez p1, :cond_0

    .line 39
    .line 40
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 41
    .line 42
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 54
    .line 55
    check-cast p0, Ldefpackage/ej;

    .line 56
    .line 57
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget-object p2, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 67
    .line 68
    check-cast p1, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 78
    .line 79
    check-cast p0, Ldefpackage/q7;

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    if-eqz p2, :cond_2

    .line 83
    .line 84
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-object p2, p1

    .line 88
    :goto_0
    instance-of v0, p2, Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    move-object p1, p2

    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    :cond_3
    if-nez p1, :cond_4

    .line 96
    .line 97
    const-string p1, ""

    .line 98
    .line 99
    :cond_4
    iput-object p1, p0, Ldefpackage/q7;->v:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object p2, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {p1, p2}, Ldefpackage/su3;->q(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Ldefpackage/q7;->t:Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_3
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 114
    .line 115
    check-cast p0, Ldefpackage/ej;

    .line 116
    .line 117
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Ljava/util/ArrayList;

    .line 120
    .line 121
    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 122
    .line 123
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_4
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 128
    .line 129
    check-cast p0, Ldefpackage/pg0;

    .line 130
    .line 131
    iget-object p1, p0, Ldefpackage/pg0;->p:Landroid/database/Cursor;

    .line 132
    .line 133
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 134
    .line 135
    if-eqz p2, :cond_5

    .line 136
    .line 137
    if-eq p2, p1, :cond_5

    .line 138
    .line 139
    check-cast p2, Landroid/database/Cursor;

    .line 140
    .line 141
    invoke-virtual {p0, p2}, Ldefpackage/pg0;->b(Landroid/database/Cursor;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    return-void

    .line 145
    :pswitch_5
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 146
    .line 147
    check-cast p0, Ldefpackage/b8;

    .line 148
    .line 149
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, Ljava/util/List;

    .line 152
    .line 153
    iput-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 154
    .line 155
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_6
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 160
    .line 161
    check-cast p0, Ldefpackage/ej;

    .line 162
    .line 163
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 166
    .line 167
    .line 168
    iget p1, p2, Landroid/widget/Filter$FilterResults;->count:I

    .line 169
    .line 170
    if-lez p1, :cond_6

    .line 171
    .line 172
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 173
    .line 174
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p2, Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_7
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 186
    .line 187
    check-cast p0, Ldefpackage/b8;

    .line 188
    .line 189
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p1, Ljava/util/List;

    .line 192
    .line 193
    iput-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 194
    .line 195
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_8
    iget-object p0, p0, Ldefpackage/o7;->b:Landroid/widget/Filterable;

    .line 200
    .line 201
    check-cast p0, Ldefpackage/q7;

    .line 202
    .line 203
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Ljava/util/List;

    .line 206
    .line 207
    iput-object p1, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 208
    .line 209
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
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
