.class public final Lh80;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/view/View;

.field public b:Z

.field public c:Lu80;

.field public d:Lba2;

.field public e:Lj54;

.field public f:Lf75;

.field public final g:Liw1;

.field public final h:Lz04;

.field public final i:Landroid/content/res/Configuration;

.field public final j:Lb13;

.field public final k:Lrv2;

.field public final l:Lpa;

.field public final m:Lhd5;

.field public final n:Ly30;

.field public final o:Lga1;

.field public final p:Lb13;

.field public final q:Lkl1;

.field public final r:Lgd;

.field public final s:Le72;

.field public final t:Lom1;

.field public final u:Lnz;

.field public v:I

.field public w:Lvc;

.field public final x:Lg80;


# direct methods
.method public constructor <init>(Lh80;Landroid/view/View;Lu80;Lba2;Lj54;Lf75;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Lh80;->a:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lh80;->a:Landroid/view/View;

    .line 26
    .line 27
    iput-object p3, p0, Lh80;->c:Lu80;

    .line 28
    .line 29
    iput-object p4, p0, Lh80;->d:Lba2;

    .line 30
    .line 31
    iput-object p5, p0, Lh80;->e:Lj54;

    .line 32
    .line 33
    iput-object p6, p0, Lh80;->f:Lf75;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p3, p1, Lh80;->g:Liw1;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p3, Liw1;

    .line 44
    .line 45
    invoke-direct {p3}, Liw1;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_1
    iput-object p3, p0, Lh80;->g:Liw1;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p3, p1, Lh80;->h:Lz04;

    .line 53
    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    :cond_2
    new-instance p3, Lz04;

    .line 57
    .line 58
    invoke-direct {p3}, Lz04;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    iput-object p3, p0, Lh80;->h:Lz04;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p3, p1, Lh80;->i:Landroid/content/res/Configuration;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    new-instance p3, Landroid/content/res/Configuration;

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-direct {p3, p4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    iput-object p3, p0, Lh80;->i:Landroid/content/res/Configuration;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p3, p1, Lh80;->j:Lb13;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    new-instance p4, Landroid/content/res/Configuration;

    .line 99
    .line 100
    invoke-direct {p4, p3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p4}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :goto_3
    iput-object p3, p0, Lh80;->j:Lb13;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p3, p1, Lh80;->k:Lrv2;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    new-instance p3, Lrv2;

    .line 118
    .line 119
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    const/16 p5, 0x1c

    .line 124
    .line 125
    invoke-direct {p3, p5}, Lrv2;-><init>(I)V

    .line 126
    .line 127
    .line 128
    const-string p5, "accessibility"

    .line 129
    .line 130
    invoke-virtual {p4, p5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    check-cast p4, Landroid/view/accessibility/AccessibilityManager;

    .line 138
    .line 139
    :goto_4
    iput-object p3, p0, Lh80;->k:Lrv2;

    .line 140
    .line 141
    if-eqz v1, :cond_7

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object p3, p1, Lh80;->l:Lpa;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_7
    new-instance p3, Lpa;

    .line 150
    .line 151
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    const/4 p4, 0x5

    .line 155
    invoke-direct {p3, p4}, Lpa;-><init>(I)V

    .line 156
    .line 157
    .line 158
    :goto_5
    iput-object p3, p0, Lh80;->l:Lpa;

    .line 159
    .line 160
    if-eqz v1, :cond_8

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object p3, p1, Lh80;->m:Lhd5;

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_8
    new-instance p3, Lhd5;

    .line 169
    .line 170
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object p4

    .line 174
    invoke-direct {p3, p4}, Lhd5;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    :goto_6
    iput-object p3, p0, Lh80;->m:Lhd5;

    .line 178
    .line 179
    if-eqz v1, :cond_9

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object p3, p1, Lh80;->n:Ly30;

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_9
    new-instance p3, Lrv2;

    .line 188
    .line 189
    const/16 p4, 0x1d

    .line 190
    .line 191
    invoke-direct {p3, p4}, Lrv2;-><init>(I)V

    .line 192
    .line 193
    .line 194
    :goto_7
    iput-object p3, p0, Lh80;->n:Ly30;

    .line 195
    .line 196
    const/4 p3, 0x2

    .line 197
    if-eqz v1, :cond_a

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object p4, p1, Lh80;->o:Lga1;

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_a
    new-instance p4, Lpa;

    .line 206
    .line 207
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    invoke-direct {p4, p3}, Lpa;-><init>(I)V

    .line 211
    .line 212
    .line 213
    :goto_8
    iput-object p4, p0, Lh80;->o:Lga1;

    .line 214
    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    iget-object p4, p1, Lh80;->p:Lb13;

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_b
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 224
    .line 225
    .line 226
    move-result-object p4

    .line 227
    invoke-static {p4}, Lgb;->o(Landroid/content/Context;)Lia1;

    .line 228
    .line 229
    .line 230
    move-result-object p4

    .line 231
    sget-object p5, Lrv2;->A:Lrv2;

    .line 232
    .line 233
    new-instance p6, Lzd3;

    .line 234
    .line 235
    invoke-direct {p6, p4, p5}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 236
    .line 237
    .line 238
    move-object p4, p6

    .line 239
    :goto_9
    iput-object p4, p0, Lh80;->p:Lb13;

    .line 240
    .line 241
    if-eqz p1, :cond_c

    .line 242
    .line 243
    iget-object v0, p1, Lh80;->a:Landroid/view/View;

    .line 244
    .line 245
    :cond_c
    if-ne p2, v0, :cond_d

    .line 246
    .line 247
    iget-object p4, p1, Lh80;->q:Lkl1;

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_d
    new-instance p4, Lsg3;

    .line 251
    .line 252
    invoke-direct {p4, p2}, Lsg3;-><init>(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    :goto_a
    iput-object p4, p0, Lh80;->q:Lkl1;

    .line 256
    .line 257
    if-eqz v1, :cond_e

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object p2, p1, Lh80;->r:Lgd;

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_e
    new-instance p4, Lgd;

    .line 266
    .line 267
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    invoke-direct {p4, p2}, Lgd;-><init>(Landroid/view/ViewConfiguration;)V

    .line 276
    .line 277
    .line 278
    move-object p2, p4

    .line 279
    :goto_b
    iput-object p2, p0, Lh80;->r:Lgd;

    .line 280
    .line 281
    if-eqz p1, :cond_f

    .line 282
    .line 283
    iget-object p2, p1, Lh80;->s:Le72;

    .line 284
    .line 285
    if-nez p2, :cond_10

    .line 286
    .line 287
    :cond_f
    new-instance p2, Le72;

    .line 288
    .line 289
    invoke-direct {p2}, Le72;-><init>()V

    .line 290
    .line 291
    .line 292
    :cond_10
    iput-object p2, p0, Lh80;->s:Le72;

    .line 293
    .line 294
    new-instance p2, Lom1;

    .line 295
    .line 296
    const/4 p4, 0x4

    .line 297
    const/4 p5, 0x0

    .line 298
    invoke-direct {p2, p4, p5}, Lom1;-><init>(IB)V

    .line 299
    .line 300
    .line 301
    iput-object p2, p0, Lh80;->t:Lom1;

    .line 302
    .line 303
    if-eqz p1, :cond_11

    .line 304
    .line 305
    iget-object p1, p1, Lh80;->u:Lnz;

    .line 306
    .line 307
    if-nez p1, :cond_12

    .line 308
    .line 309
    :cond_11
    new-instance p1, Lnz;

    .line 310
    .line 311
    invoke-direct {p1}, Lnz;-><init>()V

    .line 312
    .line 313
    .line 314
    :cond_12
    iput-object p1, p0, Lh80;->u:Lnz;

    .line 315
    .line 316
    new-instance p1, Lwc;

    .line 317
    .line 318
    invoke-direct {p1, p3, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    new-instance p1, Lg80;

    .line 322
    .line 323
    invoke-direct {p1, p0}, Lg80;-><init>(Lh80;)V

    .line 324
    .line 325
    .line 326
    iput-object p1, p0, Lh80;->x:Lg80;

    .line 327
    .line 328
    return-void
.end method


# virtual methods
.method public final a(Lra;Lr70;Lrg1;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x761ec9f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v5}, Lrg1;->S(I)Lrg1;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x2

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    const/4 v5, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v5, v6

    .line 27
    :goto_0
    or-int/2addr v5, v4

    .line 28
    invoke-virtual {v3, v2}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    const/16 v7, 0x20

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v7, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v5, v7

    .line 40
    invoke-virtual {v3, v0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    const/16 v7, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v7, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v5, v7

    .line 52
    and-int/lit16 v7, v5, 0x93

    .line 53
    .line 54
    const/16 v8, 0x92

    .line 55
    .line 56
    const/4 v9, 0x1

    .line 57
    if-eq v7, v8, :cond_3

    .line 58
    .line 59
    move v7, v9

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/4 v7, 0x0

    .line 62
    :goto_3
    and-int/2addr v5, v9

    .line 63
    invoke-virtual {v3, v5, v7}, Lrg1;->K(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_14

    .line 68
    .line 69
    const v5, 0x7f0a0311

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    instance-of v8, v7, Ljava/util/Set;

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    if-eqz v8, :cond_5

    .line 80
    .line 81
    instance-of v8, v7, Lx32;

    .line 82
    .line 83
    if-eqz v8, :cond_4

    .line 84
    .line 85
    instance-of v8, v7, Lb42;

    .line 86
    .line 87
    if-eqz v8, :cond_5

    .line 88
    .line 89
    :cond_4
    check-cast v7, Ljava/util/Set;

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    move-object v7, v10

    .line 93
    :goto_4
    if-nez v7, :cond_9

    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    instance-of v8, v7, Landroid/view/View;

    .line 100
    .line 101
    if-eqz v8, :cond_6

    .line 102
    .line 103
    check-cast v7, Landroid/view/View;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    move-object v7, v10

    .line 107
    :goto_5
    if-eqz v7, :cond_7

    .line 108
    .line 109
    invoke-virtual {v7, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    goto :goto_6

    .line 114
    :cond_7
    move-object v5, v10

    .line 115
    :goto_6
    instance-of v7, v5, Ljava/util/Set;

    .line 116
    .line 117
    if-eqz v7, :cond_a

    .line 118
    .line 119
    instance-of v7, v5, Lx32;

    .line 120
    .line 121
    if-eqz v7, :cond_8

    .line 122
    .line 123
    instance-of v7, v5, Lb42;

    .line 124
    .line 125
    if-eqz v7, :cond_a

    .line 126
    .line 127
    :cond_8
    move-object v10, v5

    .line 128
    check-cast v10, Ljava/util/Set;

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_9
    move-object v10, v7

    .line 132
    :cond_a
    :goto_7
    if-eqz v10, :cond_b

    .line 133
    .line 134
    invoke-virtual {v3}, Lrg1;->t()Lw80;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-interface {v10, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iput-boolean v9, v3, Lrg1;->q:Z

    .line 142
    .line 143
    iput-boolean v9, v3, Lrg1;->C:Z

    .line 144
    .line 145
    iget-object v5, v3, Lrg1;->c:Lig4;

    .line 146
    .line 147
    invoke-virtual {v5}, Lig4;->b()V

    .line 148
    .line 149
    .line 150
    iget-object v5, v3, Lrg1;->H:Lig4;

    .line 151
    .line 152
    invoke-virtual {v5}, Lig4;->b()V

    .line 153
    .line 154
    .line 155
    iget-object v5, v3, Lrg1;->I:Llg4;

    .line 156
    .line 157
    iget-object v7, v5, Llg4;->a:Lig4;

    .line 158
    .line 159
    iget-object v8, v7, Lig4;->w:Ljava/util/HashMap;

    .line 160
    .line 161
    iput-object v8, v5, Llg4;->e:Ljava/util/HashMap;

    .line 162
    .line 163
    iget-object v7, v7, Lig4;->x:Li03;

    .line 164
    .line 165
    iput-object v7, v5, Llg4;->f:Li03;

    .line 166
    .line 167
    :cond_b
    invoke-virtual {v1}, Lra;->getView()Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v3, v5}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-virtual {v3}, Lrg1;->H()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    sget-object v8, Lj80;->a:Li80;

    .line 180
    .line 181
    if-nez v5, :cond_c

    .line 182
    .line 183
    if-ne v7, v8, :cond_d

    .line 184
    .line 185
    :cond_c
    new-instance v7, Ly75;

    .line 186
    .line 187
    invoke-virtual {v1}, Lra;->getView()Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-direct {v7, v5}, Ly75;-><init>(Landroid/view/View;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v7}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_d
    check-cast v7, Ly75;

    .line 198
    .line 199
    sget-object v5, Lqd2;->a:Lwl4;

    .line 200
    .line 201
    invoke-virtual {v0}, Lh80;->d()Lba2;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-virtual {v5, v9}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    sget-object v5, Ltd2;->a:Lqr3;

    .line 210
    .line 211
    invoke-virtual {v0}, Lh80;->g()V

    .line 212
    .line 213
    .line 214
    iget-object v9, v0, Lh80;->e:Lj54;

    .line 215
    .line 216
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v9}, Lqr3;->a(Ljava/lang/Object;)Lrr3;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    sget-object v5, Lhb;->d:Lwl4;

    .line 224
    .line 225
    iget-object v9, v0, Lh80;->g:Liw1;

    .line 226
    .line 227
    invoke-virtual {v5, v9}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    sget-object v5, Lhb;->e:Lwl4;

    .line 232
    .line 233
    iget-object v9, v0, Lh80;->h:Lz04;

    .line 234
    .line 235
    invoke-virtual {v5, v9}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    sget-object v5, Lg90;->v:Lwl4;

    .line 240
    .line 241
    invoke-virtual {v3, v0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    invoke-virtual {v3}, Lrg1;->H()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    if-nez v9, :cond_e

    .line 250
    .line 251
    if-ne v15, v8, :cond_f

    .line 252
    .line 253
    :cond_e
    new-instance v15, Lx;

    .line 254
    .line 255
    const/16 v9, 0x8

    .line 256
    .line 257
    invoke-direct {v15, v9, v0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v15}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_f
    check-cast v15, Lif1;

    .line 264
    .line 265
    invoke-virtual {v5, v15}, Lqr3;->c(Lif1;)Lrr3;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    sget-object v5, Lhb;->b:Lwl4;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-virtual {v5, v9}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 276
    .line 277
    .line 278
    move-result-object v16

    .line 279
    sget-object v5, Lyz1;->a:Lwl4;

    .line 280
    .line 281
    invoke-virtual {v5, v10}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    sget-object v5, Lhb;->a:Ll90;

    .line 286
    .line 287
    invoke-virtual {v1}, Lra;->getConfiguration()Landroid/content/res/Configuration;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-virtual {v5, v9}, Ll90;->a(Ljava/lang/Object;)Lrr3;

    .line 292
    .line 293
    .line 294
    move-result-object v18

    .line 295
    sget-object v5, Lz44;->a:Lwl4;

    .line 296
    .line 297
    invoke-virtual {v3, v1}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    invoke-virtual {v3}, Lrg1;->H()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    if-nez v9, :cond_10

    .line 306
    .line 307
    if-ne v10, v8, :cond_11

    .line 308
    .line 309
    :cond_10
    new-instance v10, Lja;

    .line 310
    .line 311
    invoke-direct {v10, v1, v6}, Lja;-><init>(Lra;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v10}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_11
    check-cast v10, Lif1;

    .line 318
    .line 319
    invoke-virtual {v5, v10}, Lqr3;->c(Lif1;)Lrr3;

    .line 320
    .line 321
    .line 322
    move-result-object v19

    .line 323
    sget-object v5, Lhb;->f:Lwl4;

    .line 324
    .line 325
    invoke-virtual {v1}, Lra;->getView()Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-virtual {v5, v6}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 330
    .line 331
    .line 332
    move-result-object v20

    .line 333
    sget-object v5, Lg90;->x:Ll90;

    .line 334
    .line 335
    invoke-virtual {v3, v1}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    invoke-virtual {v3}, Lrg1;->H()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    if-nez v6, :cond_12

    .line 344
    .line 345
    if-ne v9, v8, :cond_13

    .line 346
    .line 347
    :cond_12
    new-instance v9, Lja;

    .line 348
    .line 349
    const/4 v6, 0x3

    .line 350
    invoke-direct {v9, v1, v6}, Lja;-><init>(Lra;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v9}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :cond_13
    check-cast v9, Lif1;

    .line 357
    .line 358
    invoke-virtual {v5, v9}, Lqr3;->c(Lif1;)Lrr3;

    .line 359
    .line 360
    .line 361
    move-result-object v21

    .line 362
    sget-object v5, Lg90;->t:Lwl4;

    .line 363
    .line 364
    invoke-virtual {v1}, Lra;->getViewConfiguration()Lm65;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v5, v6}, Lwl4;->a(Ljava/lang/Object;)Lrr3;

    .line 369
    .line 370
    .line 371
    move-result-object v22

    .line 372
    sget-object v5, Lvp1;->a:Ll90;

    .line 373
    .line 374
    invoke-virtual {v5, v7}, Ll90;->a(Ljava/lang/Object;)Lrr3;

    .line 375
    .line 376
    .line 377
    move-result-object v23

    .line 378
    filled-new-array/range {v11 .. v23}, [Lrr3;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    new-instance v6, Lf80;

    .line 383
    .line 384
    invoke-direct {v6, v1, v0, v2}, Lf80;-><init>(Lra;Lh80;Lr70;)V

    .line 385
    .line 386
    .line 387
    const v7, 0x4e86c15f

    .line 388
    .line 389
    .line 390
    invoke-static {v7, v6, v3}, Lfh0;->w(ILsf1;Lrg1;)Lr70;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    const/16 v7, 0x38

    .line 395
    .line 396
    invoke-static {v5, v6, v3, v7}, Lgi1;->b([Lrr3;Lr70;Lrg1;I)V

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_14
    invoke-virtual {v3}, Lrg1;->N()V

    .line 401
    .line 402
    .line 403
    :goto_8
    invoke-virtual {v3}, Lrg1;->p()Llv3;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    if-eqz v3, :cond_15

    .line 408
    .line 409
    new-instance v5, Lf80;

    .line 410
    .line 411
    invoke-direct {v5, v0, v1, v2, v4}, Lf80;-><init>(Lh80;Lra;Lr70;I)V

    .line 412
    .line 413
    .line 414
    iput-object v5, v3, Llv3;->d:Lwf1;

    .line 415
    .line 416
    :cond_15
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Lh80;->v:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lh80;->v:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "ComposeViewContext"

    .line 10
    .line 11
    const-string v1, "View count has dropped below 0"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lh80;->v:I

    .line 18
    .line 19
    :cond_0
    iget v0, p0, Lh80;->v:I

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lh80;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lh80;->x:Lg80;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lh80;->t:Lom1;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final c()Lu80;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh80;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lh80;->c:Lu80;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Lba2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh80;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lh80;->d:Lba2;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget v0, p0, Lh80;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lh80;->v:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lh80;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lh80;->x:Lg80;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, v1}, Lh80;->f(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object p0, p0, Lh80;->t:Lom1;

    .line 36
    .line 37
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lzd3;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final f(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh80;->i:Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v1, p0, Lh80;->g:Liw1;

    .line 10
    .line 11
    iget-object v1, v1, Liw1;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lgw1;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget v2, v2, Lgw1;->b:I

    .line 48
    .line 49
    invoke-static {v0, v2}, Landroid/content/res/Configuration;->needNewResources(II)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget-object v1, p0, Lh80;->j:Lb13;

    .line 60
    .line 61
    new-instance v2, Landroid/content/res/Configuration;

    .line 62
    .line 63
    invoke-direct {v2, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v2}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lh80;->h:Lz04;

    .line 70
    .line 71
    monitor-enter p1

    .line 72
    :try_start_0
    iget-object v1, p1, Lz04;->a:Li03;

    .line 73
    .line 74
    invoke-virtual {v1}, Li03;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    monitor-exit p1

    .line 78
    const/high16 p1, 0x10000000

    .line 79
    .line 80
    and-int/2addr p1, v0

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Lh80;->p:Lb13;

    .line 84
    .line 85
    iget-object v1, p0, Lh80;->a:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, Lgb;->o(Landroid/content/Context;)Lia1;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p1, v1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    const p1, 0x2fff1d80

    .line 99
    .line 100
    .line 101
    and-int/2addr p1, v0

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    iget-object p0, p0, Lh80;->t:Lom1;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    monitor-exit p1

    .line 112
    throw p0

    .line 113
    :cond_4
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lh80;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lh80;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Lh80;->c:Lu80;

    .line 9
    .line 10
    iget-object v1, p0, Lh80;->a:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    invoke-static {v1}, Lic5;->a(Landroid/view/View;)Lu80;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    instance-of v3, v2, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast v2, Landroid/view/View;

    .line 32
    .line 33
    invoke-static {v2}, Lic5;->a(Landroid/view/View;)Lu80;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v2}, Lau0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v1}, Lic5;->b(Landroid/view/View;)Ltv3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    iput-object v0, p0, Lh80;->c:Lu80;

    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Lh80;->d:Lba2;

    .line 51
    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    invoke-static {v1}, Lj51;->u(Landroid/view/View;)Lba2;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iput-object v0, p0, Lh80;->d:Lba2;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const-string p0, "Composed into a View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 64
    .line 65
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    :goto_2
    iget-object v0, p0, Lh80;->e:Lj54;

    .line 70
    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    invoke-static {v1}, Lkb4;->y(Landroid/view/View;)Lj54;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    iput-object v0, p0, Lh80;->e:Lj54;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    const-string p0, "Composed into a View which doesn\'t propagate ViewTreeSavedStateRegistryOwner!"

    .line 83
    .line 84
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_7
    :goto_3
    iget-object v0, p0, Lh80;->f:Lf75;

    .line 89
    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    invoke-static {v1}, Lgi1;->o(Landroid/view/View;)Lf75;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lh80;->f:Lf75;

    .line 97
    .line 98
    :cond_8
    return-void
.end method
