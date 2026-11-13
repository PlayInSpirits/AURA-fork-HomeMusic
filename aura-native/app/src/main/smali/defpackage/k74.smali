.class public final synthetic Ldefpackage/k74;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/k74;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/k74;->b:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/k74;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Ldefpackage/k74;->b:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 15
    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getArtists()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/ae1;->h:Landroid/view/View;

    .line 27
    .line 28
    check-cast v0, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getArtists()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    move v4, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v4, v1

    .line 43
    :goto_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->p0:Ldefpackage/vi;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getArtists()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iput-object v4, v0, Ldefpackage/vi;->u:Ljava/util/List;

    .line 53
    .line 54
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->p0:Ldefpackage/vi;

    .line 59
    .line 60
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    iput-object v2, v0, Ldefpackage/vi;->u:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 68
    .line 69
    iget-object v0, v0, Ldefpackage/ae1;->h:Landroid/view/View;

    .line 70
    .line 71
    check-cast v0, Landroid/widget/LinearLayout;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    move v2, v3

    .line 77
    :goto_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getAlbums()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 84
    .line 85
    iget-object v0, v0, Ldefpackage/ae1;->g:Landroid/view/View;

    .line 86
    .line 87
    check-cast v0, Landroid/widget/LinearLayout;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getAlbums()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_2

    .line 98
    .line 99
    move v4, v3

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    move v4, v1

    .line 102
    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->q0:Ldefpackage/s6;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getAlbums()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual {v0, v4}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->q0:Ldefpackage/s6;

    .line 118
    .line 119
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 125
    .line 126
    iget-object v0, v0, Ldefpackage/ae1;->g:Landroid/view/View;

    .line 127
    .line 128
    check-cast v0, Landroid/widget/LinearLayout;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    :goto_3
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 140
    .line 141
    iget-object v0, v0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 142
    .line 143
    check-cast v0, Landroid/widget/LinearLayout;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-nez v4, :cond_4

    .line 154
    .line 155
    move v4, v3

    .line 156
    goto :goto_4

    .line 157
    :cond_4
    move v4, v1

    .line 158
    :goto_4
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 174
    .line 175
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 181
    .line 182
    iget-object p1, p1, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 183
    .line 184
    check-cast p1, Landroid/widget/LinearLayout;

    .line 185
    .line 186
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 187
    .line 188
    .line 189
    :goto_5
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 190
    .line 191
    if-nez v2, :cond_6

    .line 192
    .line 193
    iget-object p0, p0, Ldefpackage/ae1;->f:Landroid/view/View;

    .line 194
    .line 195
    check-cast p0, Landroid/widget/LinearLayout;

    .line 196
    .line 197
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_6
    iget-object p0, p0, Ldefpackage/ae1;->f:Landroid/view/View;

    .line 202
    .line 203
    check-cast p0, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    :cond_7
    :goto_6
    return-void

    .line 209
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 210
    .line 211
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 212
    .line 213
    iget-object v0, v0, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 214
    .line 215
    check-cast v0, Landroid/widget/LinearLayout;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 218
    .line 219
    .line 220
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Ljava/lang/String;

    .line 235
    .line 236
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 237
    .line 238
    iget-object v2, v2, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 239
    .line 240
    check-cast v2, Landroid/widget/LinearLayout;

    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 251
    .line 252
    iget-object v4, v4, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 253
    .line 254
    check-cast v4, Landroid/widget/LinearLayout;

    .line 255
    .line 256
    const v5, 0x7f0d00b7

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v5, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const v4, 0x7f0a054d

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    check-cast v4, Landroid/widget/ImageView;

    .line 271
    .line 272
    const v5, 0x7f0a054e

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    check-cast v5, Landroid/widget/TextView;

    .line 280
    .line 281
    const v6, 0x7f0a054c

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    check-cast v6, Landroid/widget/ImageView;

    .line 289
    .line 290
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    const v8, 0x7f080216

    .line 295
    .line 296
    .line 297
    const/4 v9, 0x0

    .line 298
    invoke-virtual {v7, v8, v9}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 309
    .line 310
    .line 311
    new-instance v4, Ldefpackage/l74;

    .line 312
    .line 313
    const/4 v5, 0x2

    .line 314
    invoke-direct {v4, p0, v0, v5}, Ldefpackage/l74;-><init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 318
    .line 319
    .line 320
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Ldefpackage/ae1;

    .line 321
    .line 322
    iget-object v0, v0, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 323
    .line 324
    check-cast v0, Landroid/widget/LinearLayout;

    .line 325
    .line 326
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_8
    return-void

    .line 331
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 332
    .line 333
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 334
    .line 335
    if-eqz v0, :cond_a

    .line 336
    .line 337
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 338
    .line 339
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 340
    .line 341
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Ljava/lang/String;

    .line 346
    .line 347
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 348
    .line 349
    if-eqz p1, :cond_9

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-eqz p1, :cond_9

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_9
    move v2, v3

    .line 359
    :goto_8
    invoke-virtual {p0, v0, v2}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 360
    .line 361
    .line 362
    :cond_a
    return-void

    .line 363
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 364
    .line 365
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 366
    .line 367
    if-eqz v0, :cond_c

    .line 368
    .line 369
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->o0:Ldefpackage/li3;

    .line 370
    .line 371
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 372
    .line 373
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, Ljava/lang/Boolean;

    .line 378
    .line 379
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->r0:Ldefpackage/ni4;

    .line 380
    .line 381
    if-eqz v0, :cond_b

    .line 382
    .line 383
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_b

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_b
    move v2, v3

    .line 391
    :goto_9
    invoke-virtual {p0, p1, v2}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 392
    .line 393
    .line 394
    :cond_c
    return-void

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
