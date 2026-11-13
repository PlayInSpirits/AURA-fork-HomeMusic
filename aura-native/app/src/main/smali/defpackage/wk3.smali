.class public Ldefpackage/wk3;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/lv4;

.field public m0:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public n0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public o0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public p0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public q0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

.field public s0:Z

.field public t0:Ldefpackage/aj3;

.field public u0:Ldefpackage/li3;

.field public v0:Ldefpackage/bl2;

.field public w0:Ldefpackage/yk3;

.field public x0:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/wk3;->s0:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/wk3;->x0:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    const p3, 0x7f0d0091

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a023a

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    move-object v3, p3

    .line 17
    check-cast v3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    const p2, 0x7f0a023b

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 31
    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    const p2, 0x7f0a023c

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v5, v1

    .line 42
    check-cast v5, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    const p2, 0x7f0a023d

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroid/widget/LinearLayout;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    const p2, 0x7f0a023e

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    move-object v6, v1

    .line 65
    check-cast v6, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    const p2, 0x7f0a023f

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v7, v1

    .line 77
    check-cast v7, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 78
    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    const p2, 0x7f0a0240

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v8, v1

    .line 89
    check-cast v8, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 90
    .line 91
    if-eqz v8, :cond_3

    .line 92
    .line 93
    const p2, 0x7f0a0492

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v9, v1

    .line 101
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 102
    .line 103
    if-eqz v9, :cond_3

    .line 104
    .line 105
    new-instance v1, Ldefpackage/lv4;

    .line 106
    .line 107
    move-object v2, p1

    .line 108
    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 109
    .line 110
    invoke-direct/range {v1 .. v9}, Ldefpackage/lv4;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 111
    .line 112
    .line 113
    iput-object v1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 114
    .line 115
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v3, Ldefpackage/bq4;

    .line 132
    .line 133
    invoke-direct {v3, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 134
    .line 135
    .line 136
    const-class p1, Ldefpackage/aj3;

    .line 137
    .line 138
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 147
    .line 148
    if-eqz p2, :cond_2

    .line 149
    .line 150
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 151
    .line 152
    invoke-virtual {v4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {v3, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Ldefpackage/aj3;

    .line 161
    .line 162
    iput-object p1, p0, Ldefpackage/wk3;->t0:Ldefpackage/aj3;

    .line 163
    .line 164
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static {p1, v3}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v5, Ldefpackage/bq4;

    .line 181
    .line 182
    invoke-direct {v5, p2, v3, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 183
    .line 184
    .line 185
    const-class p1, Ldefpackage/li3;

    .line 186
    .line 187
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    if-eqz p2, :cond_1

    .line 196
    .line 197
    invoke-virtual {v4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-virtual {v5, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Ldefpackage/li3;

    .line 206
    .line 207
    iput-object p1, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 208
    .line 209
    iget-object p1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 210
    .line 211
    iget-object p2, p1, Ldefpackage/lv4;->q:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 214
    .line 215
    iput-object p2, p0, Ldefpackage/wk3;->m0:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 216
    .line 217
    iget-object p3, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 220
    .line 221
    iput-object p3, p0, Ldefpackage/wk3;->n0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 222
    .line 223
    iget-object p3, p1, Ldefpackage/lv4;->s:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 226
    .line 227
    iput-object p3, p0, Ldefpackage/wk3;->o0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 228
    .line 229
    iget-object p3, p1, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 232
    .line 233
    iput-object p3, p0, Ldefpackage/wk3;->p0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 234
    .line 235
    iget-object p3, p1, Ldefpackage/lv4;->o:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 238
    .line 239
    iput-object p3, p0, Ldefpackage/wk3;->q0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 240
    .line 241
    iget-object p1, p1, Ldefpackage/lv4;->p:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p1, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 244
    .line 245
    iput-object p1, p0, Ldefpackage/wk3;->r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 246
    .line 247
    new-instance p1, Ldefpackage/vk3;

    .line 248
    .line 249
    invoke-direct {p1, p0, v0}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Ldefpackage/wk3;->n0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 256
    .line 257
    new-instance p2, Ldefpackage/vk3;

    .line 258
    .line 259
    const/4 p3, 0x1

    .line 260
    invoke-direct {p2, p0, p3}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Ldefpackage/wk3;->o0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 267
    .line 268
    new-instance p2, Ldefpackage/vk3;

    .line 269
    .line 270
    const/4 v1, 0x2

    .line 271
    invoke-direct {p2, p0, v1}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Ldefpackage/wk3;->p0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 278
    .line 279
    new-instance p2, Ldefpackage/vk3;

    .line 280
    .line 281
    const/4 v3, 0x3

    .line 282
    invoke-direct {p2, p0, v3}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p0, Ldefpackage/wk3;->q0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 289
    .line 290
    new-instance p2, Ldefpackage/vk3;

    .line 291
    .line 292
    const/4 v4, 0x4

    .line 293
    invoke-direct {p2, p0, v4}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Ldefpackage/wk3;->r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 300
    .line 301
    new-instance p2, Ldefpackage/vk3;

    .line 302
    .line 303
    const/4 v4, 0x5

    .line 304
    invoke-direct {p2, p0, v4}, Ldefpackage/vk3;-><init>(Ldefpackage/wk3;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    .line 309
    .line 310
    invoke-static {}, Ldefpackage/ud3;->Y()Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-nez p1, :cond_0

    .line 315
    .line 316
    iget-object p1, p0, Ldefpackage/wk3;->r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 317
    .line 318
    const/16 p2, 0x8

    .line 319
    .line 320
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    :cond_0
    iget-object p1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 324
    .line 325
    iget-object p1, p1, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 328
    .line 329
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 330
    .line 331
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 332
    .line 333
    .line 334
    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 338
    .line 339
    .line 340
    iget-object p1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 341
    .line 342
    iget-object p1, p1, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 345
    .line 346
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 347
    .line 348
    .line 349
    iget-object p1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 350
    .line 351
    iget-object p1, p1, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 354
    .line 355
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 356
    .line 357
    .line 358
    iget-object p1, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 359
    .line 360
    iget-object p1, p1, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 363
    .line 364
    new-instance p2, Ldefpackage/tk3;

    .line 365
    .line 366
    invoke-direct {p2, p0, v4}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 370
    .line 371
    .line 372
    new-instance p1, Ldefpackage/yk3;

    .line 373
    .line 374
    invoke-direct {p1, p0}, Ldefpackage/yk3;-><init>(Ldefpackage/wk3;)V

    .line 375
    .line 376
    .line 377
    iput-object p1, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 378
    .line 379
    iget-object p2, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 380
    .line 381
    iget-object p2, p2, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 384
    .line 385
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 386
    .line 387
    .line 388
    sget-object p1, Lcom/eddyizm/tempus/homemusic/a;->f:Ldefpackage/k03;

    .line 389
    .line 390
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    new-instance v4, Ldefpackage/uk3;

    .line 395
    .line 396
    invoke-direct {v4, p0, v0}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, p2, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Ldefpackage/wk3;->j0()V

    .line 403
    .line 404
    .line 405
    iget-object p1, p0, Ldefpackage/wk3;->t0:Ldefpackage/aj3;

    .line 406
    .line 407
    iget-object p1, p1, Ldefpackage/aj3;->f:Ldefpackage/vs3;

    .line 408
    .line 409
    iget-object p1, p1, Ldefpackage/vs3;->a:Ldefpackage/ns3;

    .line 410
    .line 411
    iget-object p2, p1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast p2, Ldefpackage/s24;

    .line 414
    .line 415
    invoke-virtual {p2}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 416
    .line 417
    .line 418
    move-result-object p2

    .line 419
    const-string v0, "queue"

    .line 420
    .line 421
    filled-new-array {v0}, [Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    new-instance v4, Ldefpackage/ks3;

    .line 426
    .line 427
    invoke-direct {v4, p1, p3}, Ldefpackage/ks3;-><init>(Ldefpackage/ns3;I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p2, v0, v4}, Ldefpackage/s12;->a([Ljava/lang/String;Ldefpackage/if1;)Ldefpackage/t24;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 435
    .line 436
    .line 437
    move-result-object p2

    .line 438
    new-instance v0, Ldefpackage/uk3;

    .line 439
    .line 440
    invoke-direct {v0, p0, p3}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {p1, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 444
    .line 445
    .line 446
    sget-object p1, Ldefpackage/u52;->c:Ldefpackage/k03;

    .line 447
    .line 448
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 449
    .line 450
    .line 451
    move-result-object p2

    .line 452
    new-instance p3, Ldefpackage/uk3;

    .line 453
    .line 454
    invoke-direct {p3, p0, v1}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 458
    .line 459
    .line 460
    sget-object p1, Ldefpackage/u52;->b:Ldefpackage/k03;

    .line 461
    .line 462
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 463
    .line 464
    .line 465
    move-result-object p2

    .line 466
    new-instance p3, Ldefpackage/uk3;

    .line 467
    .line 468
    invoke-direct {p3, p0, v3}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 472
    .line 473
    .line 474
    new-instance p1, Ldefpackage/f22;

    .line 475
    .line 476
    new-instance p2, Ldefpackage/oo1;

    .line 477
    .line 478
    invoke-direct {p2, p0}, Ldefpackage/oo1;-><init>(Ldefpackage/wk3;)V

    .line 479
    .line 480
    .line 481
    invoke-direct {p1, p2}, Ldefpackage/f22;-><init>(Ldefpackage/e22;)V

    .line 482
    .line 483
    .line 484
    iget-object p0, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 485
    .line 486
    iget-object p0, p0, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 489
    .line 490
    invoke-virtual {p1, p0}, Ldefpackage/f22;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 491
    .line 492
    .line 493
    return-object v2

    .line 494
    :cond_1
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    return-object p3

    .line 498
    :cond_2
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    return-object p3

    .line 502
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    const-string p1, "Missing required view with ID: "

    .line 511
    .line 512
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    return-object p3
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/wk3;->l0:Ldefpackage/lv4;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/yk3;->r:Ldefpackage/bl2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 14
    .line 15
    new-instance v1, Ldefpackage/tk3;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final R()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Ldefpackage/cb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Ldefpackage/aj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ldefpackage/bl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v9, 0x4

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    new-instance v0, Ldefpackage/xc5;

    .line 54
    .line 55
    new-instance v1, Ldefpackage/x7;

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    new-instance v8, Ldefpackage/fi0;

    .line 61
    .line 62
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v9, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Ldefpackage/bj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 86
    .line 87
    iget-object v0, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 88
    .line 89
    invoke-static {v7, v0}, Ldefpackage/bo2;->j(Ldefpackage/bl2;Ldefpackage/li3;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 93
    .line 94
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 95
    .line 96
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Ldefpackage/uk3;

    .line 101
    .line 102
    invoke-direct {v2, p0, v9}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 109
    .line 110
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 111
    .line 112
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v2, Ldefpackage/uk3;

    .line 117
    .line 118
    const/4 v3, 0x5

    .line 119
    invoke-direct {v2, p0, v3}, Ldefpackage/uk3;-><init>(Ldefpackage/wk3;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final h0(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr p2, v0

    .line 13
    int-to-float p2, p2

    .line 14
    const/high16 v1, 0x428c0000    # 70.0f

    .line 15
    .line 16
    mul-float/2addr p2, v1

    .line 17
    mul-float/2addr p2, p0

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-wide/16 v1, 0xfa

    .line 32
    .line 33
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance p2, Ldefpackage/ni0;

    .line 38
    .line 39
    invoke-direct {p2, p1, v0}, Ldefpackage/ni0;-><init>(Landroid/view/View;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final i0(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    add-int/lit8 p2, p2, 0x1

    .line 12
    .line 13
    int-to-float p2, p2

    .line 14
    const/high16 v0, 0x428c0000    # 70.0f

    .line 15
    .line 16
    mul-float/2addr p2, v0

    .line 17
    mul-float/2addr p2, p0

    .line 18
    const/4 p0, 0x0

    .line 19
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, p0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/high16 p1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-wide/16 p1, 0xfa

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final j0()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, v0, Ldefpackage/v52;->o:I

    .line 18
    .line 19
    invoke-static {}, Ldefpackage/u52;->l()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ge v1, v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget-object p0, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 44
    .line 45
    iget-boolean v0, v0, Ldefpackage/v52;->j:Z

    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Ldefpackage/yk3;->q(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v0, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 52
    .line 53
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 54
    .line 55
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, p0, Ldefpackage/wk3;->u0:Ldefpackage/li3;

    .line 62
    .line 63
    iget-object v1, v1, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 64
    .line 65
    invoke-virtual {v1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/Boolean;

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v1, 0x0

    .line 84
    :goto_1
    invoke-virtual {p0, v0, v1}, Ldefpackage/yk3;->q(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    :cond_3
    return-void
.end method

.method public final k0()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ldefpackage/wk3;->s0:Z

    .line 2
    .line 3
    const-wide/16 v1, 0xfa

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x4

    .line 9
    const/4 v7, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {}, Ldefpackage/ud3;->Y()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/wk3;->r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 19
    .line 20
    invoke-virtual {p0, v0, v6}, Ldefpackage/wk3;->h0(Landroid/view/View;I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Ldefpackage/wk3;->p0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v5}, Ldefpackage/wk3;->h0(Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ldefpackage/wk3;->n0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v4}, Ldefpackage/wk3;->h0(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/wk3;->q0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 34
    .line 35
    invoke-virtual {p0, v0, v7}, Ldefpackage/wk3;->h0(Landroid/view/View;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Ldefpackage/wk3;->o0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 39
    .line 40
    invoke-virtual {p0, v0, v3}, Ldefpackage/wk3;->h0(Landroid/view/View;I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ldefpackage/wk3;->m0:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v0, p0, Ldefpackage/wk3;->o0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 63
    .line 64
    invoke-virtual {p0, v0, v3}, Ldefpackage/wk3;->i0(Landroid/view/View;I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Ldefpackage/wk3;->q0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 68
    .line 69
    invoke-virtual {p0, v0, v7}, Ldefpackage/wk3;->i0(Landroid/view/View;I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Ldefpackage/wk3;->n0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 73
    .line 74
    invoke-virtual {p0, v0, v4}, Ldefpackage/wk3;->i0(Landroid/view/View;I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Ldefpackage/wk3;->p0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 78
    .line 79
    invoke-virtual {p0, v0, v5}, Ldefpackage/wk3;->i0(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ldefpackage/ud3;->Y()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    iget-object v0, p0, Ldefpackage/wk3;->r0:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 89
    .line 90
    invoke-virtual {p0, v0, v6}, Ldefpackage/wk3;->i0(Landroid/view/View;I)V

    .line 91
    .line 92
    .line 93
    :cond_2
    iget-object v0, p0, Ldefpackage/wk3;->m0:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/high16 v3, 0x42340000    # 45.0f

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 110
    .line 111
    .line 112
    :goto_0
    iget-boolean v0, p0, Ldefpackage/wk3;->s0:Z

    .line 113
    .line 114
    xor-int/2addr v0, v7

    .line 115
    iput-boolean v0, p0, Ldefpackage/wk3;->s0:Z

    .line 116
    .line 117
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 2
    .line 3
    const-string v0, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-string v1, "queue"

    .line 16
    .line 17
    invoke-static {p0, v0, p1, v1}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
