.class public final Ldefpackage/n23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/String;

.field public final f:Ldefpackage/rp4;

.field public final g:Ldefpackage/rp4;

.field public final h:Ldefpackage/r72;

.field public i:Z

.field public final j:Ldefpackage/r72;

.field public final k:Ldefpackage/r72;

.field public final l:Ldefpackage/r72;

.field public final m:Ldefpackage/rp4;

.field public final n:Ljava/lang/String;

.field public final o:Ldefpackage/rp4;

.field public final p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^[a-zA-Z]+[+\\w\\-.]*:"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldefpackage/n23;->q:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\{(.+?)\\}"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ldefpackage/n23;->r:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Ldefpackage/n23;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance v0, Ldefpackage/l23;

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-direct {v0, p0, v1}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ldefpackage/rp4;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ldefpackage/n23;->f:Ldefpackage/rp4;

    .line 29
    .line 30
    new-instance v0, Ldefpackage/l23;

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-direct {v0, p0, v1}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ldefpackage/rp4;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Ldefpackage/n23;->g:Ldefpackage/rp4;

    .line 42
    .line 43
    new-instance v0, Ldefpackage/l23;

    .line 44
    .line 45
    const/4 v1, 0x7

    .line 46
    invoke-direct {v0, p0, v1}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Ldefpackage/b92;->n:Ldefpackage/b92;

    .line 50
    .line 51
    invoke-static {v1, v0}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Ldefpackage/n23;->h:Ldefpackage/r72;

    .line 56
    .line 57
    new-instance v0, Ldefpackage/l23;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-direct {v0, p0, v2}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v0}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Ldefpackage/n23;->j:Ldefpackage/r72;

    .line 68
    .line 69
    new-instance v0, Ldefpackage/l23;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v0, p0, v3}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v0}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Ldefpackage/n23;->k:Ldefpackage/r72;

    .line 80
    .line 81
    new-instance v0, Ldefpackage/l23;

    .line 82
    .line 83
    const/4 v4, 0x3

    .line 84
    invoke-direct {v0, p0, v4}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v0}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Ldefpackage/n23;->l:Ldefpackage/r72;

    .line 92
    .line 93
    new-instance v0, Ldefpackage/l23;

    .line 94
    .line 95
    const/4 v1, 0x2

    .line 96
    invoke-direct {v0, p0, v1}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Ldefpackage/rp4;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Ldefpackage/n23;->m:Ldefpackage/rp4;

    .line 105
    .line 106
    new-instance v0, Ldefpackage/l23;

    .line 107
    .line 108
    const/4 v1, 0x5

    .line 109
    invoke-direct {v0, p0, v1}, Ldefpackage/l23;-><init>(Ldefpackage/n23;I)V

    .line 110
    .line 111
    .line 112
    new-instance v1, Ldefpackage/rp4;

    .line 113
    .line 114
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 115
    .line 116
    .line 117
    iput-object v1, p0, Ldefpackage/n23;->o:Ldefpackage/rp4;

    .line 118
    .line 119
    if-nez p1, :cond_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, "^"

    .line 125
    .line 126
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, Ldefpackage/n23;->q:Ljava/util/regex/Pattern;

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_1

    .line 140
    .line 141
    const-string v1, "http[s]?://"

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_1
    const-string v1, "(\\?|\\#|$)"

    .line 147
    .line 148
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p1, p2, v0}, Ldefpackage/n23;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 168
    .line 169
    .line 170
    const-string p1, ".*"

    .line 171
    .line 172
    invoke-static {v0, p1}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-nez p2, :cond_2

    .line 177
    .line 178
    const-string p2, "([^/]+?)"

    .line 179
    .line 180
    invoke-static {v0, p2}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-nez p2, :cond_2

    .line 185
    .line 186
    move p2, v2

    .line 187
    goto :goto_0

    .line 188
    :cond_2
    move p2, v3

    .line 189
    :goto_0
    iput-boolean p2, p0, Ldefpackage/n23;->p:Z

    .line 190
    .line 191
    const-string p2, "($|(\\?(.)*)|(\\#(.)*))"

    .line 192
    .line 193
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    const-string v0, "\\E.*\\Q"

    .line 201
    .line 202
    invoke-static {p2, p1, v0}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iput-object p1, p0, Ldefpackage/n23;->e:Ljava/lang/String;

    .line 207
    .line 208
    :goto_1
    if-nez p3, :cond_3

    .line 209
    .line 210
    return-void

    .line 211
    :cond_3
    const-string p1, "^[\\s\\S]+/[\\s\\S]+$"

    .line 212
    .line 213
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_8

    .line 226
    .line 227
    const-string p1, "/"

    .line 228
    .line 229
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v3}, Ldefpackage/qm4;->A0(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    if-nez p2, :cond_4

    .line 248
    .line 249
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {p1}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    goto :goto_2

    .line 258
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 259
    .line 260
    const/16 v0, 0xa

    .line 261
    .line 262
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    .line 264
    .line 265
    move v0, v3

    .line 266
    :cond_5
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-nez v1, :cond_5

    .line 290
    .line 291
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    invoke-virtual {p3, v0, p1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-object p1, p2

    .line 307
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 308
    .line 309
    .line 310
    move-result p2

    .line 311
    if-nez p2, :cond_7

    .line 312
    .line 313
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    invoke-interface {p1, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    :goto_3
    invoke-interface {p2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 322
    .line 323
    .line 324
    move-result p3

    .line 325
    if-eqz p3, :cond_7

    .line 326
    .line 327
    invoke-interface {p2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p3

    .line 331
    check-cast p3, Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 334
    .line 335
    .line 336
    move-result p3

    .line 337
    if-nez p3, :cond_6

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_6
    invoke-interface {p2}, Ljava/util/ListIterator;->nextIndex()I

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    add-int/2addr p2, v2

    .line 345
    invoke-static {p1, p2}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    goto :goto_4

    .line 350
    :cond_7
    sget-object p1, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 351
    .line 352
    :goto_4
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    check-cast p2, Ljava/lang/String;

    .line 357
    .line 358
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    check-cast p1, Ljava/lang/String;

    .line 363
    .line 364
    const-string p3, "|[*]+)/("

    .line 365
    .line 366
    const-string v0, "|[*]+)$"

    .line 367
    .line 368
    const-string v1, "^("

    .line 369
    .line 370
    invoke-static {v1, p2, p3, p1, v0}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    const-string p2, "*|[*]"

    .line 375
    .line 376
    const-string p3, "[\\s\\S]"

    .line 377
    .line 378
    invoke-static {p1, p2, p3}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    iput-object p1, p0, Ldefpackage/n23;->n:Ljava/lang/String;

    .line 383
    .line 384
    return-void

    .line 385
    :cond_8
    const-string p0, "The given mimeType "

    .line 386
    .line 387
    const-string p1, " does not match to required \"type/subtype\" format"

    .line 388
    .line 389
    invoke-static {p0, p3, p1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    const/4 p0, 0x0

    .line 397
    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/n23;->r:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-le v2, v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_0
    const-string v1, "([^/]*?|)"

    .line 47
    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ge v1, p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public static e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ldefpackage/z13;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p3, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, p2}, Ldefpackage/h33;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p3, p0, p1, p2}, Ldefpackage/h33;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/n23;->h:Ldefpackage/r72;

    .line 2
    .line 3
    invoke-interface {v0}, Ldefpackage/r72;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ldefpackage/k23;

    .line 35
    .line 36
    iget-object v2, v2, Ldefpackage/k23;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {v2, v1}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, Ldefpackage/n23;->d:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {v0, v1}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p0, p0, Ldefpackage/n23;->k:Ldefpackage/r72;

    .line 49
    .line 50
    invoke-interface {p0}, Ldefpackage/r72;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v0, p0}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public final c(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/n23;->d:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p0, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    add-int/lit8 v6, v3, 0x1

    .line 30
    .line 31
    if-ltz v3, :cond_0

    .line 32
    .line 33
    check-cast v5, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {p3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ldefpackage/z13;

    .line 48
    .line 49
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v5, v3, v7}, Ldefpackage/n23;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ldefpackage/z13;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    sget-object v3, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move v3, v6

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    return v2

    .line 63
    :cond_0
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0

    .line 68
    :cond_1
    const/4 p0, 0x1

    .line 69
    return p0
.end method

.method public final d(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/n23;->h:Ldefpackage/r72;

    .line 6
    .line 7
    invoke-interface {v2}, Ldefpackage/r72;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_f

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ldefpackage/k23;

    .line 44
    .line 45
    move-object/from16 v6, p1

    .line 46
    .line 47
    invoke-virtual {v6, v5}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-boolean v7, v0, Ldefpackage/n23;->i:Z

    .line 52
    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-eqz v7, :cond_0

    .line 60
    .line 61
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-nez v8, :cond_0

    .line 70
    .line 71
    invoke-static {v7}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v7, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    new-array v9, v8, [Ldefpackage/kd3;

    .line 82
    .line 83
    invoke-static {v9}, Ldefpackage/fh0;->g([Ldefpackage/kd3;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iget-object v10, v3, Ldefpackage/k23;->b:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    move v12, v8

    .line 94
    :cond_1
    :goto_1
    if-ge v12, v11, :cond_3

    .line 95
    .line 96
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    add-int/lit8 v12, v12, 0x1

    .line 101
    .line 102
    check-cast v14, Ljava/lang/String;

    .line 103
    .line 104
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    check-cast v15, Ldefpackage/z13;

    .line 109
    .line 110
    if-eqz v15, :cond_2

    .line 111
    .line 112
    iget-object v13, v15, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 113
    .line 114
    :goto_2
    const/16 v16, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    const/4 v13, 0x0

    .line 118
    goto :goto_2

    .line 119
    :goto_3
    instance-of v4, v13, Ldefpackage/a33;

    .line 120
    .line 121
    if-eqz v4, :cond_1

    .line 122
    .line 123
    iget-boolean v4, v15, Ldefpackage/z13;->c:Z

    .line 124
    .line 125
    if-nez v4, :cond_1

    .line 126
    .line 127
    move-object v4, v13

    .line 128
    check-cast v4, Ldefpackage/a33;

    .line 129
    .line 130
    iget v4, v4, Ldefpackage/a33;->r:I

    .line 131
    .line 132
    sget-object v15, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 133
    .line 134
    packed-switch v4, :pswitch_data_0

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :pswitch_0
    new-array v15, v8, [Ljava/lang/String;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :pswitch_1
    new-array v15, v8, [J

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :pswitch_2
    new-array v15, v8, [I

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :pswitch_3
    new-array v15, v8, [F

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :pswitch_4
    new-array v15, v8, [Z

    .line 151
    .line 152
    :goto_4
    :pswitch_5
    invoke-virtual {v13, v9, v14, v15}, Ldefpackage/h33;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    const/16 v16, 0x1

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_e

    .line 167
    .line 168
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Ljava/lang/String;

    .line 173
    .line 174
    iget-object v10, v3, Ldefpackage/k23;->a:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v10, :cond_4

    .line 177
    .line 178
    const/16 v11, 0x20

    .line 179
    .line 180
    invoke-static {v10, v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-virtual {v10, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    goto :goto_6

    .line 189
    :cond_4
    const/4 v5, 0x0

    .line 190
    :goto_6
    if-eqz v5, :cond_5

    .line 191
    .line 192
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-nez v10, :cond_6

    .line 197
    .line 198
    :cond_5
    move/from16 v18, v8

    .line 199
    .line 200
    goto/16 :goto_c

    .line 201
    .line 202
    :cond_6
    iget-object v10, v3, Ldefpackage/k23;->b:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v11, Ljava/util/ArrayList;

    .line 205
    .line 206
    const/16 v12, 0xa

    .line 207
    .line 208
    invoke-static {v10, v12}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    move v14, v8

    .line 220
    move v15, v14

    .line 221
    :goto_7
    if-ge v15, v12, :cond_d

    .line 222
    .line 223
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v17

    .line 227
    add-int/lit8 v15, v15, 0x1

    .line 228
    .line 229
    move/from16 v18, v8

    .line 230
    .line 231
    add-int/lit8 v8, v14, 0x1

    .line 232
    .line 233
    if-ltz v14, :cond_c

    .line 234
    .line 235
    move-object/from16 v14, v17

    .line 236
    .line 237
    check-cast v14, Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v5, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    if-nez v17, :cond_7

    .line 244
    .line 245
    const-string v17, ""

    .line 246
    .line 247
    :cond_7
    move-object/from16 v13, v17

    .line 248
    .line 249
    const/16 v19, 0x0

    .line 250
    .line 251
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v17

    .line 255
    move-object/from16 v0, v17

    .line 256
    .line 257
    check-cast v0, Ldefpackage/z13;

    .line 258
    .line 259
    :try_start_0
    invoke-virtual {v9, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v17

    .line 263
    if-nez v17, :cond_8

    .line 264
    .line 265
    invoke-static {v9, v14, v13, v0}, Ldefpackage/n23;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ldefpackage/z13;)V

    .line 266
    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_8
    invoke-virtual {v9, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v17

    .line 273
    if-nez v17, :cond_9

    .line 274
    .line 275
    move/from16 v0, v16

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_9
    if-eqz v0, :cond_b

    .line 279
    .line 280
    iget-object v0, v0, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 281
    .line 282
    invoke-virtual {v0, v14, v9}, Ldefpackage/h33;->a(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v9, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v17

    .line 290
    if-eqz v17, :cond_a

    .line 291
    .line 292
    invoke-virtual {v0, v1, v13}, Ldefpackage/h33;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v0, v9, v14, v1}, Ldefpackage/h33;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    const-string v1, "There is no previous value in this bundle."

    .line 303
    .line 304
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v0

    .line 308
    :cond_b
    :goto_8
    move/from16 v0, v18

    .line 309
    .line 310
    :goto_9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 311
    .line 312
    .line 313
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    goto :goto_b

    .line 315
    :catch_0
    :goto_a
    move-object v0, v7

    .line 316
    :goto_b
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-object/from16 v0, p0

    .line 320
    .line 321
    move-object/from16 v1, p3

    .line 322
    .line 323
    move v14, v8

    .line 324
    move/from16 v8, v18

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_c
    const/16 v19, 0x0

    .line 328
    .line 329
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 330
    .line 331
    .line 332
    throw v19

    .line 333
    :cond_d
    move-object/from16 v0, p0

    .line 334
    .line 335
    move-object/from16 v1, p3

    .line 336
    .line 337
    goto/16 :goto_5

    .line 338
    .line 339
    :goto_c
    return v18

    .line 340
    :cond_e
    move-object/from16 v0, p2

    .line 341
    .line 342
    invoke-virtual {v0, v9}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v0, p0

    .line 346
    .line 347
    move-object/from16 v1, p3

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_f
    const/16 v16, 0x1

    .line 352
    .line 353
    return v16

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    instance-of v1, p1, Ldefpackage/n23;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    check-cast p1, Ldefpackage/n23;

    .line 10
    .line 11
    iget-object v1, p1, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v2, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p1, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object p0, p0, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v0

    .line 24
    :goto_1
    add-int/2addr v1, v2

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :cond_2
    add-int/2addr v1, v0

    .line 36
    return v1
.end method
