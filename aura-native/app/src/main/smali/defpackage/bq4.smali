.class public Ldefpackage/bq4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qd3;
.implements Ldefpackage/zn4;


# static fields
.field public static final r:Ldefpackage/md3;


# instance fields
.field public final n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/md3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/bq4;->r:Ldefpackage/md3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 818
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 819
    new-instance p1, Ldefpackage/be3;

    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 820
    new-instance p1, Ldefpackage/be3;

    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 821
    new-instance p1, Ldefpackage/bg3;

    invoke-direct {p1}, Ldefpackage/bg3;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    return-void

    .line 822
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 823
    new-instance p1, Ldefpackage/oi;

    const/4 v0, 0x0

    .line 824
    invoke-direct {p1, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 825
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 826
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 827
    new-instance p1, Ldefpackage/xe2;

    const/4 v1, 0x0

    .line 828
    invoke-direct {p1, v1}, Ldefpackage/xe2;-><init>(Ljava/lang/Object;)V

    .line 829
    iput-object p1, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 830
    new-instance p1, Ldefpackage/oi;

    .line 831
    invoke-direct {p1, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 832
    iput-object p1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 839
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 840
    iput-object p1, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 841
    iput-object p2, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 842
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 843
    new-instance p1, Ldefpackage/yd4;

    const/4 p2, 0x0

    .line 844
    invoke-direct {p1, p2}, Ldefpackage/yd4;-><init>(I)V

    .line 845
    iput-object p1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Ldefpackage/zh0;)V
    .locals 1

    .line 858
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 859
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 860
    iput-object p2, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 861
    invoke-static {p2}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    move-result-object p2

    .line 862
    iput-object p2, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 863
    new-instance v0, Ldefpackage/wm;

    invoke-direct {v0, p0}, Ldefpackage/wm;-><init>(Ldefpackage/bq4;)V

    iput-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 864
    invoke-virtual {p1, v0, p2}, Landroid/media/AudioTrack;->addOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 817
    iput-object p2, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    iput-object p5, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 793
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    .line 794
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 795
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 796
    new-instance v0, Ldefpackage/vo0;

    const/4 v1, 0x2

    .line 797
    invoke-direct {v0, p1, v1}, Ldefpackage/vo0;-><init>(Ldefpackage/s24;I)V

    .line 798
    iput-object v0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 799
    new-instance v0, Ldefpackage/aq4;

    const/4 v1, 0x0

    .line 800
    invoke-direct {v0, p1, v1}, Ldefpackage/aq4;-><init>(Ldefpackage/s24;I)V

    .line 801
    iput-object v0, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 802
    new-instance v0, Ldefpackage/aq4;

    const/4 v1, 0x1

    .line 803
    invoke-direct {v0, p1, v1}, Ldefpackage/aq4;-><init>(Ldefpackage/s24;I)V

    .line 804
    iput-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 806
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 807
    iput-object p2, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 808
    iput-object p3, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 809
    new-instance p1, Ldefpackage/xi4;

    const/16 p2, 0xd

    .line 810
    invoke-direct {p1, p2}, Ldefpackage/xi4;-><init>(I)V

    .line 811
    iput-object p1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/he;Ldefpackage/zs4;Ljava/util/List;Ldefpackage/oo0;Ldefpackage/ha1;Z)V
    .locals 40

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
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    iput-object v3, v0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v3, Ldefpackage/dz2;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, v0, v4}, Ldefpackage/dz2;-><init>(Ldefpackage/bq4;I)V

    .line 20
    .line 21
    .line 22
    sget-object v5, Ldefpackage/b92;->n:Ldefpackage/b92;

    .line 23
    .line 24
    invoke-static {v5, v3}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 25
    .line 26
    .line 27
    new-instance v3, Ldefpackage/dz2;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    invoke-direct {v3, v0, v6}, Ldefpackage/dz2;-><init>(Ldefpackage/bq4;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v5, v3}, Ldefpackage/rr2;->K(Ldefpackage/b92;Ldefpackage/gf1;)Ldefpackage/r72;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iput-object v3, v0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, v2, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 40
    .line 41
    sget v5, Ldefpackage/ie;->a:I

    .line 42
    .line 43
    iget-object v5, v1, Ldefpackage/he;->q:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v6, v1, Ldefpackage/he;->o:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v7, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    new-instance v8, Ldefpackage/ca1;

    .line 52
    .line 53
    const/16 v9, 0xb

    .line 54
    .line 55
    invoke-direct {v8, v9}, Ldefpackage/ca1;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v8}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v5, v7

    .line 64
    :goto_0
    new-instance v8, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v9, Ldefpackage/ii;

    .line 70
    .line 71
    invoke-direct {v9}, Ldefpackage/ii;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    move v11, v4

    .line 79
    move v12, v11

    .line 80
    :goto_1
    if-ge v11, v10, :cond_a

    .line 81
    .line 82
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    check-cast v14, Ldefpackage/ge;

    .line 87
    .line 88
    iget-object v15, v14, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v15, Ldefpackage/sd3;

    .line 91
    .line 92
    invoke-virtual {v3, v15}, Ldefpackage/sd3;->a(Ldefpackage/sd3;)Ldefpackage/sd3;

    .line 93
    .line 94
    .line 95
    move-result-object v15

    .line 96
    const/16 p3, 0x0

    .line 97
    .line 98
    iget v13, v14, Ldefpackage/ge;->b:I

    .line 99
    .line 100
    iget v14, v14, Ldefpackage/ge;->c:I

    .line 101
    .line 102
    if-gt v13, v14, :cond_1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    const-string v16, "Reversed range is not supported"

    .line 106
    .line 107
    invoke-static/range {v16 .. v16}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_2
    if-ge v12, v13, :cond_4

    .line 111
    .line 112
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    if-nez v16, :cond_4

    .line 117
    .line 118
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    move-object/from16 v4, v16

    .line 123
    .line 124
    check-cast v4, Ldefpackage/ge;

    .line 125
    .line 126
    move-object/from16 v16, v5

    .line 127
    .line 128
    iget v5, v4, Ldefpackage/ge;->c:I

    .line 129
    .line 130
    move-object/from16 v17, v7

    .line 131
    .line 132
    iget-object v7, v4, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 133
    .line 134
    if-ge v13, v5, :cond_2

    .line 135
    .line 136
    new-instance v4, Ldefpackage/ge;

    .line 137
    .line 138
    invoke-direct {v4, v12, v13, v7}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move v12, v13

    .line 145
    move-object/from16 v5, v16

    .line 146
    .line 147
    move-object/from16 v7, v17

    .line 148
    .line 149
    :goto_3
    const/4 v4, 0x0

    .line 150
    goto :goto_2

    .line 151
    :cond_2
    move/from16 v18, v10

    .line 152
    .line 153
    new-instance v10, Ldefpackage/ge;

    .line 154
    .line 155
    invoke-direct {v10, v12, v5, v7}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    iget v12, v4, Ldefpackage/ge;->c:I

    .line 162
    .line 163
    :goto_4
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_3

    .line 168
    .line 169
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ldefpackage/ge;

    .line 174
    .line 175
    iget v4, v4, Ldefpackage/ge;->c:I

    .line 176
    .line 177
    if-ne v12, v4, :cond_3

    .line 178
    .line 179
    invoke-virtual {v9}, Ldefpackage/ii;->removeLast()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_3
    move-object/from16 v5, v16

    .line 184
    .line 185
    move-object/from16 v7, v17

    .line 186
    .line 187
    move/from16 v10, v18

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    move-object/from16 v16, v5

    .line 191
    .line 192
    move-object/from16 v17, v7

    .line 193
    .line 194
    move/from16 v18, v10

    .line 195
    .line 196
    if-ge v12, v13, :cond_5

    .line 197
    .line 198
    new-instance v4, Ldefpackage/ge;

    .line 199
    .line 200
    invoke-direct {v4, v12, v13, v3}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move v12, v13

    .line 207
    :cond_5
    invoke-virtual {v9}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Ldefpackage/ge;

    .line 212
    .line 213
    if-eqz v4, :cond_9

    .line 214
    .line 215
    iget v5, v4, Ldefpackage/ge;->c:I

    .line 216
    .line 217
    iget-object v7, v4, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 218
    .line 219
    iget v4, v4, Ldefpackage/ge;->b:I

    .line 220
    .line 221
    if-ne v4, v13, :cond_6

    .line 222
    .line 223
    if-ne v5, v14, :cond_6

    .line 224
    .line 225
    invoke-virtual {v9}, Ldefpackage/ii;->removeLast()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    new-instance v4, Ldefpackage/ge;

    .line 229
    .line 230
    check-cast v7, Ldefpackage/sd3;

    .line 231
    .line 232
    invoke-virtual {v7, v15}, Ldefpackage/sd3;->a(Ldefpackage/sd3;)Ldefpackage/sd3;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-direct {v4, v13, v14, v5}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9, v4}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_6
    if-ne v4, v5, :cond_7

    .line 244
    .line 245
    new-instance v10, Ldefpackage/ge;

    .line 246
    .line 247
    invoke-direct {v10, v4, v5, v7}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    invoke-virtual {v9}, Ldefpackage/ii;->removeLast()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    new-instance v4, Ldefpackage/ge;

    .line 257
    .line 258
    invoke-direct {v4, v13, v14, v15}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v4}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_7
    if-lt v5, v14, :cond_8

    .line 266
    .line 267
    new-instance v4, Ldefpackage/ge;

    .line 268
    .line 269
    check-cast v7, Ldefpackage/sd3;

    .line 270
    .line 271
    invoke-virtual {v7, v15}, Ldefpackage/sd3;->a(Ldefpackage/sd3;)Ldefpackage/sd3;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-direct {v4, v13, v14, v5}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v4}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_8
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 283
    .line 284
    .line 285
    throw p3

    .line 286
    :cond_9
    new-instance v4, Ldefpackage/ge;

    .line 287
    .line 288
    invoke-direct {v4, v13, v14, v15}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v9, v4}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 295
    .line 296
    move-object/from16 v5, v16

    .line 297
    .line 298
    move-object/from16 v7, v17

    .line 299
    .line 300
    move/from16 v10, v18

    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_a
    move-object/from16 v17, v7

    .line 306
    .line 307
    const/16 p3, 0x0

    .line 308
    .line 309
    :goto_6
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-gt v12, v4, :cond_c

    .line 314
    .line 315
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_c

    .line 320
    .line 321
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    check-cast v4, Ldefpackage/ge;

    .line 326
    .line 327
    new-instance v5, Ldefpackage/ge;

    .line 328
    .line 329
    iget-object v7, v4, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 330
    .line 331
    iget v4, v4, Ldefpackage/ge;->c:I

    .line 332
    .line 333
    invoke-direct {v5, v12, v4, v7}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    :goto_7
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-nez v5, :cond_b

    .line 344
    .line 345
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    check-cast v5, Ldefpackage/ge;

    .line 350
    .line 351
    iget v5, v5, Ldefpackage/ge;->c:I

    .line 352
    .line 353
    if-ne v4, v5, :cond_b

    .line 354
    .line 355
    invoke-virtual {v9}, Ldefpackage/ii;->removeLast()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_b
    move v12, v4

    .line 360
    goto :goto_6

    .line 361
    :cond_c
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-ge v12, v4, :cond_d

    .line 366
    .line 367
    new-instance v4, Ldefpackage/ge;

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    invoke-direct {v4, v12, v5, v3}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_e

    .line 384
    .line 385
    new-instance v4, Ldefpackage/ge;

    .line 386
    .line 387
    const/4 v5, 0x0

    .line 388
    invoke-direct {v4, v5, v5, v3}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_e
    const/4 v5, 0x0

    .line 396
    :goto_8
    new-instance v4, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    move v9, v5

    .line 410
    :goto_9
    if-ge v9, v7, :cond_1c

    .line 411
    .line 412
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    check-cast v10, Ldefpackage/ge;

    .line 417
    .line 418
    iget v11, v10, Ldefpackage/ge;->b:I

    .line 419
    .line 420
    iget v12, v10, Ldefpackage/ge;->c:I

    .line 421
    .line 422
    new-instance v13, Ldefpackage/he;

    .line 423
    .line 424
    if-eq v11, v12, :cond_f

    .line 425
    .line 426
    invoke-virtual {v6, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v14

    .line 430
    goto :goto_a

    .line 431
    :cond_f
    const-string v14, ""

    .line 432
    .line 433
    :goto_a
    if-ne v11, v12, :cond_11

    .line 434
    .line 435
    :goto_b
    move-object/from16 v5, p3

    .line 436
    .line 437
    move-object/from16 v16, v6

    .line 438
    .line 439
    :cond_10
    move/from16 v26, v7

    .line 440
    .line 441
    move-object/from16 v27, v8

    .line 442
    .line 443
    move/from16 v28, v9

    .line 444
    .line 445
    goto/16 :goto_f

    .line 446
    .line 447
    :cond_11
    iget-object v15, v1, Ldefpackage/he;->n:Ljava/util/List;

    .line 448
    .line 449
    if-nez v15, :cond_12

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_12
    if-nez v11, :cond_14

    .line 453
    .line 454
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    if-lt v12, v5, :cond_14

    .line 459
    .line 460
    new-instance v5, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    move-object/from16 v16, v6

    .line 474
    .line 475
    const/4 v6, 0x0

    .line 476
    :goto_c
    if-ge v6, v1, :cond_10

    .line 477
    .line 478
    move/from16 v18, v1

    .line 479
    .line 480
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    move/from16 v19, v6

    .line 485
    .line 486
    move-object v6, v1

    .line 487
    check-cast v6, Ldefpackage/ge;

    .line 488
    .line 489
    iget-object v6, v6, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v6, Ldefpackage/fe;

    .line 492
    .line 493
    instance-of v6, v6, Ldefpackage/sd3;

    .line 494
    .line 495
    if-nez v6, :cond_13

    .line 496
    .line 497
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    :cond_13
    add-int/lit8 v6, v19, 0x1

    .line 501
    .line 502
    move/from16 v1, v18

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :cond_14
    move-object/from16 v16, v6

    .line 506
    .line 507
    new-instance v5, Ljava/util/ArrayList;

    .line 508
    .line 509
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    const/4 v6, 0x0

    .line 521
    :goto_d
    if-ge v6, v1, :cond_10

    .line 522
    .line 523
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v18

    .line 527
    move/from16 v19, v1

    .line 528
    .line 529
    move-object/from16 v1, v18

    .line 530
    .line 531
    check-cast v1, Ldefpackage/ge;

    .line 532
    .line 533
    move/from16 v18, v6

    .line 534
    .line 535
    iget-object v6, v1, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 536
    .line 537
    move-object/from16 v20, v6

    .line 538
    .line 539
    iget v6, v1, Ldefpackage/ge;->b:I

    .line 540
    .line 541
    move/from16 v26, v7

    .line 542
    .line 543
    move-object/from16 v7, v20

    .line 544
    .line 545
    check-cast v7, Ldefpackage/fe;

    .line 546
    .line 547
    instance-of v7, v7, Ldefpackage/sd3;

    .line 548
    .line 549
    if-nez v7, :cond_15

    .line 550
    .line 551
    iget v7, v1, Ldefpackage/ge;->c:I

    .line 552
    .line 553
    invoke-static {v11, v12, v6, v7}, Ldefpackage/ie;->a(IIII)Z

    .line 554
    .line 555
    .line 556
    move-result v20

    .line 557
    if-eqz v20, :cond_15

    .line 558
    .line 559
    move-object/from16 v27, v8

    .line 560
    .line 561
    iget-object v8, v1, Ldefpackage/ge;->d:Ljava/lang/String;

    .line 562
    .line 563
    iget-object v1, v1, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v1, Ldefpackage/fe;

    .line 566
    .line 567
    invoke-static {v6, v11, v12}, Ldefpackage/gb;->m(III)I

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    sub-int/2addr v6, v11

    .line 572
    invoke-static {v7, v11, v12}, Ldefpackage/gb;->m(III)I

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    sub-int/2addr v7, v11

    .line 577
    move/from16 v28, v9

    .line 578
    .line 579
    new-instance v9, Ldefpackage/ge;

    .line 580
    .line 581
    invoke-direct {v9, v6, v7, v1, v8}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    goto :goto_e

    .line 588
    :cond_15
    move-object/from16 v27, v8

    .line 589
    .line 590
    move/from16 v28, v9

    .line 591
    .line 592
    :goto_e
    add-int/lit8 v6, v18, 0x1

    .line 593
    .line 594
    move/from16 v1, v19

    .line 595
    .line 596
    move/from16 v7, v26

    .line 597
    .line 598
    move-object/from16 v8, v27

    .line 599
    .line 600
    move/from16 v9, v28

    .line 601
    .line 602
    goto :goto_d

    .line 603
    :goto_f
    if-nez v5, :cond_16

    .line 604
    .line 605
    move-object/from16 v5, v17

    .line 606
    .line 607
    :cond_16
    invoke-direct {v13, v14, v5}, Ldefpackage/he;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 608
    .line 609
    .line 610
    iget-object v1, v10, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, Ldefpackage/sd3;

    .line 613
    .line 614
    iget v5, v1, Ldefpackage/sd3;->b:I

    .line 615
    .line 616
    if-nez v5, :cond_17

    .line 617
    .line 618
    iget v5, v3, Ldefpackage/sd3;->b:I

    .line 619
    .line 620
    iget v6, v1, Ldefpackage/sd3;->a:I

    .line 621
    .line 622
    iget-wide v7, v1, Ldefpackage/sd3;->c:J

    .line 623
    .line 624
    iget-object v9, v1, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    .line 625
    .line 626
    iget-object v10, v1, Ldefpackage/sd3;->e:Ldefpackage/zg3;

    .line 627
    .line 628
    iget-object v15, v1, Ldefpackage/sd3;->f:Ldefpackage/ra2;

    .line 629
    .line 630
    move/from16 v31, v5

    .line 631
    .line 632
    iget v5, v1, Ldefpackage/sd3;->g:I

    .line 633
    .line 634
    move/from16 v37, v5

    .line 635
    .line 636
    iget v5, v1, Ldefpackage/sd3;->h:I

    .line 637
    .line 638
    iget-object v1, v1, Ldefpackage/sd3;->i:Ldefpackage/qs4;

    .line 639
    .line 640
    new-instance v29, Ldefpackage/sd3;

    .line 641
    .line 642
    move-object/from16 v39, v1

    .line 643
    .line 644
    move/from16 v38, v5

    .line 645
    .line 646
    move/from16 v30, v6

    .line 647
    .line 648
    move-wide/from16 v32, v7

    .line 649
    .line 650
    move-object/from16 v34, v9

    .line 651
    .line 652
    move-object/from16 v35, v10

    .line 653
    .line 654
    move-object/from16 v36, v15

    .line 655
    .line 656
    invoke-direct/range {v29 .. v39}, Ldefpackage/sd3;-><init>(IIJLdefpackage/cs4;Ldefpackage/zg3;Ldefpackage/ra2;IILdefpackage/qs4;)V

    .line 657
    .line 658
    .line 659
    move-object/from16 v1, v29

    .line 660
    .line 661
    :cond_17
    new-instance v5, Ldefpackage/pd3;

    .line 662
    .line 663
    new-instance v6, Ldefpackage/zs4;

    .line 664
    .line 665
    iget-object v7, v2, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 666
    .line 667
    invoke-virtual {v3, v1}, Ldefpackage/sd3;->a(Ldefpackage/sd3;)Ldefpackage/sd3;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-direct {v6, v7, v1}, Ldefpackage/zs4;-><init>(Ldefpackage/ij4;Ldefpackage/sd3;)V

    .line 672
    .line 673
    .line 674
    iget-object v1, v13, Ldefpackage/he;->n:Ljava/util/List;

    .line 675
    .line 676
    if-nez v1, :cond_18

    .line 677
    .line 678
    move-object/from16 v21, v17

    .line 679
    .line 680
    goto :goto_10

    .line 681
    :cond_18
    move-object/from16 v21, v1

    .line 682
    .line 683
    :goto_10
    iget-object v1, v0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v1, Ljava/util/List;

    .line 686
    .line 687
    new-instance v7, Ljava/util/ArrayList;

    .line 688
    .line 689
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 690
    .line 691
    .line 692
    move-result v8

    .line 693
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 694
    .line 695
    .line 696
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 697
    .line 698
    .line 699
    move-result v8

    .line 700
    const/4 v9, 0x0

    .line 701
    :goto_11
    if-ge v9, v8, :cond_1b

    .line 702
    .line 703
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v10

    .line 707
    check-cast v10, Ldefpackage/ge;

    .line 708
    .line 709
    iget v13, v10, Ldefpackage/ge;->b:I

    .line 710
    .line 711
    iget v15, v10, Ldefpackage/ge;->c:I

    .line 712
    .line 713
    invoke-static {v11, v12, v13, v15}, Ldefpackage/ie;->a(IIII)Z

    .line 714
    .line 715
    .line 716
    move-result v18

    .line 717
    if-eqz v18, :cond_1a

    .line 718
    .line 719
    if-gt v11, v13, :cond_19

    .line 720
    .line 721
    if-gt v15, v12, :cond_19

    .line 722
    .line 723
    :goto_12
    move-object/from16 v18, v1

    .line 724
    .line 725
    goto :goto_13

    .line 726
    :cond_19
    const-string v18, "placeholder can not overlap with paragraph."

    .line 727
    .line 728
    invoke-static/range {v18 .. v18}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    goto :goto_12

    .line 732
    :goto_13
    new-instance v1, Ldefpackage/ge;

    .line 733
    .line 734
    iget-object v10, v10, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 735
    .line 736
    sub-int/2addr v13, v11

    .line 737
    sub-int/2addr v15, v11

    .line 738
    invoke-direct {v1, v13, v15, v10}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    goto :goto_14

    .line 745
    :cond_1a
    move-object/from16 v18, v1

    .line 746
    .line 747
    :goto_14
    add-int/lit8 v9, v9, 0x1

    .line 748
    .line 749
    move-object/from16 v1, v18

    .line 750
    .line 751
    goto :goto_11

    .line 752
    :cond_1b
    new-instance v18, Ldefpackage/mc;

    .line 753
    .line 754
    move-object/from16 v24, p4

    .line 755
    .line 756
    move-object/from16 v23, p5

    .line 757
    .line 758
    move/from16 v25, p6

    .line 759
    .line 760
    move-object/from16 v20, v6

    .line 761
    .line 762
    move-object/from16 v22, v7

    .line 763
    .line 764
    move-object/from16 v19, v14

    .line 765
    .line 766
    invoke-direct/range {v18 .. v25}, Ldefpackage/mc;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ljava/util/List;Ljava/util/List;Ldefpackage/ha1;Ldefpackage/oo0;Z)V

    .line 767
    .line 768
    .line 769
    move-object/from16 v1, v18

    .line 770
    .line 771
    invoke-direct {v5, v1, v11, v12}, Ldefpackage/pd3;-><init>(Ldefpackage/mc;II)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    add-int/lit8 v9, v28, 0x1

    .line 778
    .line 779
    move-object/from16 v1, p1

    .line 780
    .line 781
    move-object/from16 v6, v16

    .line 782
    .line 783
    move/from16 v7, v26

    .line 784
    .line 785
    move-object/from16 v8, v27

    .line 786
    .line 787
    const/4 v5, 0x0

    .line 788
    goto/16 :goto_9

    .line 789
    .line 790
    :cond_1c
    iput-object v4, v0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 791
    .line 792
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 5

    .line 846
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 847
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 848
    new-instance p2, Landroid/util/SparseBooleanArray;

    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p2, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 849
    new-instance p2, Ldefpackage/oi;

    const/4 v0, 0x0

    .line 850
    invoke-direct {p2, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 851
    iput-object p2, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 852
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 853
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldefpackage/nd3;

    .line 854
    iget v4, v3, Ldefpackage/nd3;->e:I

    if-le v4, v1, :cond_0

    move-object v2, v3

    move v1, v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 855
    :cond_1
    iput-object v2, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 812
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 813
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 814
    new-instance v0, Ldefpackage/vc5;

    invoke-direct {v0, p0}, Ldefpackage/vc5;-><init>(Ldefpackage/bq4;)V

    iput-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 815
    new-instance v0, Ldefpackage/ia4;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldefpackage/ia4;-><init>(Ljava/util/concurrent/Executor;I)V

    iput-object v0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 816
    invoke-static {v0}, Ldefpackage/kb4;->w(Ljava/util/concurrent/Executor;)Ldefpackage/pe0;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/pn2;)V
    .locals 0

    .line 856
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 857
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ss2;)V
    .locals 0

    .line 833
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 834
    iput-object p1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 835
    new-instance p1, Ldefpackage/w33;

    invoke-direct {p1}, Ldefpackage/w33;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 836
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 837
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 838
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    return-void
.end method

.method public static m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldefpackage/bq4;
    .locals 3

    .line 1
    const v0, 0x7f0d00a8

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const p1, 0x7f0a00a9

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/ImageView;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const p1, 0x7f0a00b4

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const p1, 0x7f0a00ef

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    new-instance p1, Ldefpackage/bq4;

    .line 43
    .line 44
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, v1, v2}, Ldefpackage/bq4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "Missing required view with ID: "

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ldefpackage/pd3;

    .line 18
    .line 19
    iget-object v3, v3, Ldefpackage/pd3;->a:Ldefpackage/mc;

    .line 20
    .line 21
    invoke-virtual {v3}, Ldefpackage/mc;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
.end method

.method public c([BIILdefpackage/yn4;Ldefpackage/wc0;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/bg3;

    .line 8
    .line 9
    iget-object v3, v0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ldefpackage/be3;

    .line 12
    .line 13
    iget-object v4, v0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ldefpackage/be3;

    .line 16
    .line 17
    add-int v5, v1, p3

    .line 18
    .line 19
    move-object/from16 v6, p1

    .line 20
    .line 21
    invoke-virtual {v4, v5, v6}, Ldefpackage/be3;->L(I[B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v1}, Ldefpackage/be3;->N(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/util/zip/Inflater;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance v1, Ljava/util/zip/Inflater;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/zip/Inflater;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    iget-object v0, v0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/zip/Inflater;

    .line 43
    .line 44
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v4}, Ldefpackage/be3;->a()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-lez v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4}, Ldefpackage/be3;->j()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/16 v5, 0x78

    .line 57
    .line 58
    if-ne v1, v5, :cond_1

    .line 59
    .line 60
    invoke-static {v4, v3, v0}, Ldefpackage/f35;->K(Ldefpackage/be3;Ldefpackage/be3;Ljava/util/zip/Inflater;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, v3, Ldefpackage/be3;->a:[B

    .line 67
    .line 68
    iget v1, v3, Ldefpackage/be3;->c:I

    .line 69
    .line 70
    invoke-virtual {v4, v1, v0}, Ldefpackage/be3;->L(I[B)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 v0, 0x0

    .line 74
    iput v0, v2, Ldefpackage/bg3;->d:I

    .line 75
    .line 76
    iget-object v1, v2, Ldefpackage/bg3;->b:[I

    .line 77
    .line 78
    iget-object v3, v2, Ldefpackage/bg3;->a:Ldefpackage/be3;

    .line 79
    .line 80
    iput v0, v2, Ldefpackage/bg3;->e:I

    .line 81
    .line 82
    iput v0, v2, Ldefpackage/bg3;->f:I

    .line 83
    .line 84
    iput v0, v2, Ldefpackage/bg3;->g:I

    .line 85
    .line 86
    iput v0, v2, Ldefpackage/bg3;->h:I

    .line 87
    .line 88
    iput v0, v2, Ldefpackage/bg3;->i:I

    .line 89
    .line 90
    invoke-virtual {v3, v0}, Ldefpackage/be3;->K(I)V

    .line 91
    .line 92
    .line 93
    iput-boolean v0, v2, Ldefpackage/bg3;->c:Z

    .line 94
    .line 95
    new-instance v10, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-virtual {v4}, Ldefpackage/be3;->a()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x3

    .line 105
    if-lt v5, v6, :cond_15

    .line 106
    .line 107
    iget v5, v4, Ldefpackage/be3;->c:I

    .line 108
    .line 109
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    iget v9, v4, Ldefpackage/be3;->b:I

    .line 118
    .line 119
    add-int/2addr v9, v8

    .line 120
    if-le v9, v5, :cond_2

    .line 121
    .line 122
    invoke-virtual {v4, v5}, Ldefpackage/be3;->N(I)V

    .line 123
    .line 124
    .line 125
    move v6, v0

    .line 126
    move-object v12, v1

    .line 127
    const/4 v11, 0x0

    .line 128
    goto/16 :goto_d

    .line 129
    .line 130
    :cond_2
    const/16 v5, 0x80

    .line 131
    .line 132
    if-eq v7, v5, :cond_c

    .line 133
    .line 134
    packed-switch v7, :pswitch_data_0

    .line 135
    .line 136
    .line 137
    :cond_3
    :goto_1
    move-object v12, v1

    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :pswitch_0
    const/16 v5, 0x13

    .line 141
    .line 142
    if-ge v8, v5, :cond_4

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    iput v5, v2, Ldefpackage/bg3;->d:I

    .line 150
    .line 151
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    iput v5, v2, Ldefpackage/bg3;->e:I

    .line 156
    .line 157
    const/16 v5, 0xb

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ldefpackage/be3;->O(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    iput v5, v2, Ldefpackage/bg3;->f:I

    .line 167
    .line 168
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    iput v5, v2, Ldefpackage/bg3;->g:I

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_1
    const/4 v7, 0x4

    .line 176
    if-ge v8, v7, :cond_5

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    invoke-virtual {v4, v6}, Ldefpackage/be3;->O(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    and-int/2addr v5, v6

    .line 187
    if-eqz v5, :cond_6

    .line 188
    .line 189
    const/4 v12, 0x1

    .line 190
    goto :goto_2

    .line 191
    :cond_6
    move v12, v0

    .line 192
    :goto_2
    add-int/lit8 v5, v8, -0x4

    .line 193
    .line 194
    if-eqz v12, :cond_9

    .line 195
    .line 196
    const/4 v6, 0x7

    .line 197
    if-ge v5, v6, :cond_7

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_7
    invoke-virtual {v4}, Ldefpackage/be3;->D()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-ge v5, v7, :cond_8

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    iput v6, v2, Ldefpackage/bg3;->h:I

    .line 212
    .line 213
    invoke-virtual {v4}, Ldefpackage/be3;->H()I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    iput v6, v2, Ldefpackage/bg3;->i:I

    .line 218
    .line 219
    add-int/lit8 v5, v5, -0x4

    .line 220
    .line 221
    invoke-virtual {v3, v5}, Ldefpackage/be3;->K(I)V

    .line 222
    .line 223
    .line 224
    add-int/lit8 v5, v8, -0xb

    .line 225
    .line 226
    :cond_9
    iget v6, v3, Ldefpackage/be3;->b:I

    .line 227
    .line 228
    iget v7, v3, Ldefpackage/be3;->c:I

    .line 229
    .line 230
    if-ge v6, v7, :cond_3

    .line 231
    .line 232
    if-lez v5, :cond_3

    .line 233
    .line 234
    sub-int/2addr v7, v6

    .line 235
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    iget-object v7, v3, Ldefpackage/be3;->a:[B

    .line 240
    .line 241
    invoke-virtual {v4, v7, v6, v5}, Ldefpackage/be3;->k([BII)V

    .line 242
    .line 243
    .line 244
    add-int/2addr v6, v5

    .line 245
    invoke-virtual {v3, v6}, Ldefpackage/be3;->N(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :pswitch_2
    rem-int/lit8 v6, v8, 0x5

    .line 250
    .line 251
    const/4 v7, 0x2

    .line 252
    if-eq v6, v7, :cond_a

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_a
    invoke-virtual {v4, v7}, Ldefpackage/be3;->O(I)V

    .line 256
    .line 257
    .line 258
    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    .line 259
    .line 260
    .line 261
    div-int/lit8 v8, v8, 0x5

    .line 262
    .line 263
    move v6, v0

    .line 264
    :goto_3
    if-ge v6, v8, :cond_b

    .line 265
    .line 266
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 279
    .line 280
    .line 281
    move-result v15

    .line 282
    invoke-virtual {v4}, Ldefpackage/be3;->A()I

    .line 283
    .line 284
    .line 285
    move-result v16

    .line 286
    move/from16 p0, v5

    .line 287
    .line 288
    move/from16 p1, v6

    .line 289
    .line 290
    int-to-double v5, v13

    .line 291
    add-int/lit8 v14, v14, -0x80

    .line 292
    .line 293
    int-to-double v13, v14

    .line 294
    const-wide v17, 0x3ff66e978d4fdf3bL    # 1.402

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    mul-double v17, v17, v13

    .line 300
    .line 301
    add-double v11, v17, v5

    .line 302
    .line 303
    double-to-int v11, v11

    .line 304
    add-int/lit8 v15, v15, -0x80

    .line 305
    .line 306
    move-object v12, v1

    .line 307
    int-to-double v0, v15

    .line 308
    const-wide v17, 0x3fd60663c74fb54aL    # 0.34414

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    mul-double v17, v17, v0

    .line 314
    .line 315
    sub-double v17, v5, v17

    .line 316
    .line 317
    const-wide v19, 0x3fe6da3c21187e7cL    # 0.71414

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    mul-double v13, v13, v19

    .line 323
    .line 324
    sub-double v13, v17, v13

    .line 325
    .line 326
    double-to-int v13, v13

    .line 327
    const-wide v14, 0x3ffc5a1cac083127L    # 1.772

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    mul-double/2addr v0, v14

    .line 333
    add-double/2addr v0, v5

    .line 334
    double-to-int v0, v0

    .line 335
    shl-int/lit8 v1, v16, 0x18

    .line 336
    .line 337
    const/16 v5, 0xff

    .line 338
    .line 339
    const/4 v6, 0x0

    .line 340
    invoke-static {v11, v6, v5}, Ldefpackage/f35;->j(III)I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    shl-int/lit8 v11, v11, 0x10

    .line 345
    .line 346
    or-int/2addr v1, v11

    .line 347
    invoke-static {v13, v6, v5}, Ldefpackage/f35;->j(III)I

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    shl-int/lit8 v11, v11, 0x8

    .line 352
    .line 353
    or-int/2addr v1, v11

    .line 354
    invoke-static {v0, v6, v5}, Ldefpackage/f35;->j(III)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    or-int/2addr v0, v1

    .line 359
    aput v0, v12, v7

    .line 360
    .line 361
    add-int/lit8 v6, p1, 0x1

    .line 362
    .line 363
    move/from16 v5, p0

    .line 364
    .line 365
    move-object v1, v12

    .line 366
    const/4 v0, 0x0

    .line 367
    goto :goto_3

    .line 368
    :cond_b
    move-object v12, v1

    .line 369
    const/4 v0, 0x1

    .line 370
    iput-boolean v0, v2, Ldefpackage/bg3;->c:Z

    .line 371
    .line 372
    :goto_4
    const/4 v6, 0x0

    .line 373
    const/4 v11, 0x0

    .line 374
    goto/16 :goto_c

    .line 375
    .line 376
    :cond_c
    move-object v12, v1

    .line 377
    iget v0, v2, Ldefpackage/bg3;->d:I

    .line 378
    .line 379
    if-eqz v0, :cond_13

    .line 380
    .line 381
    iget v0, v2, Ldefpackage/bg3;->e:I

    .line 382
    .line 383
    if-eqz v0, :cond_13

    .line 384
    .line 385
    iget v0, v2, Ldefpackage/bg3;->h:I

    .line 386
    .line 387
    if-eqz v0, :cond_13

    .line 388
    .line 389
    iget v0, v2, Ldefpackage/bg3;->i:I

    .line 390
    .line 391
    if-eqz v0, :cond_13

    .line 392
    .line 393
    iget v0, v3, Ldefpackage/be3;->c:I

    .line 394
    .line 395
    if-eqz v0, :cond_13

    .line 396
    .line 397
    iget v1, v3, Ldefpackage/be3;->b:I

    .line 398
    .line 399
    if-ne v1, v0, :cond_13

    .line 400
    .line 401
    iget-boolean v0, v2, Ldefpackage/bg3;->c:Z

    .line 402
    .line 403
    if-nez v0, :cond_d

    .line 404
    .line 405
    goto/16 :goto_a

    .line 406
    .line 407
    :cond_d
    const/4 v6, 0x0

    .line 408
    invoke-virtual {v3, v6}, Ldefpackage/be3;->N(I)V

    .line 409
    .line 410
    .line 411
    iget v0, v2, Ldefpackage/bg3;->h:I

    .line 412
    .line 413
    iget v1, v2, Ldefpackage/bg3;->i:I

    .line 414
    .line 415
    mul-int/2addr v0, v1

    .line 416
    new-array v1, v0, [I

    .line 417
    .line 418
    const/4 v6, 0x0

    .line 419
    :cond_e
    :goto_5
    if-ge v6, v0, :cond_12

    .line 420
    .line 421
    invoke-virtual {v3}, Ldefpackage/be3;->A()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_f

    .line 426
    .line 427
    add-int/lit8 v7, v6, 0x1

    .line 428
    .line 429
    aget v5, v12, v5

    .line 430
    .line 431
    aput v5, v1, v6

    .line 432
    .line 433
    :goto_6
    move v6, v7

    .line 434
    goto :goto_5

    .line 435
    :cond_f
    invoke-virtual {v3}, Ldefpackage/be3;->A()I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_e

    .line 440
    .line 441
    and-int/lit8 v7, v5, 0x40

    .line 442
    .line 443
    if-nez v7, :cond_10

    .line 444
    .line 445
    and-int/lit8 v7, v5, 0x3f

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_10
    and-int/lit8 v7, v5, 0x3f

    .line 449
    .line 450
    shl-int/lit8 v7, v7, 0x8

    .line 451
    .line 452
    invoke-virtual {v3}, Ldefpackage/be3;->A()I

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    or-int/2addr v7, v8

    .line 457
    :goto_7
    and-int/lit16 v5, v5, 0x80

    .line 458
    .line 459
    if-nez v5, :cond_11

    .line 460
    .line 461
    const/4 v5, 0x0

    .line 462
    aget v8, v12, v5

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_11
    invoke-virtual {v3}, Ldefpackage/be3;->A()I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    aget v8, v12, v5

    .line 470
    .line 471
    :goto_8
    add-int/2addr v7, v6

    .line 472
    invoke-static {v1, v6, v7, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 473
    .line 474
    .line 475
    goto :goto_6

    .line 476
    :cond_12
    iget v0, v2, Ldefpackage/bg3;->h:I

    .line 477
    .line 478
    iget v5, v2, Ldefpackage/bg3;->i:I

    .line 479
    .line 480
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 481
    .line 482
    invoke-static {v1, v0, v5, v6}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 483
    .line 484
    .line 485
    move-result-object v17

    .line 486
    iget v0, v2, Ldefpackage/bg3;->f:I

    .line 487
    .line 488
    int-to-float v0, v0

    .line 489
    iget v1, v2, Ldefpackage/bg3;->d:I

    .line 490
    .line 491
    int-to-float v1, v1

    .line 492
    div-float v21, v0, v1

    .line 493
    .line 494
    iget v0, v2, Ldefpackage/bg3;->g:I

    .line 495
    .line 496
    int-to-float v0, v0

    .line 497
    iget v5, v2, Ldefpackage/bg3;->e:I

    .line 498
    .line 499
    int-to-float v5, v5

    .line 500
    div-float v18, v0, v5

    .line 501
    .line 502
    iget v0, v2, Ldefpackage/bg3;->h:I

    .line 503
    .line 504
    int-to-float v0, v0

    .line 505
    div-float v25, v0, v1

    .line 506
    .line 507
    iget v0, v2, Ldefpackage/bg3;->i:I

    .line 508
    .line 509
    int-to-float v0, v0

    .line 510
    div-float v26, v0, v5

    .line 511
    .line 512
    new-instance v13, Ldefpackage/ig0;

    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const/16 v19, 0x0

    .line 517
    .line 518
    const/16 v20, 0x0

    .line 519
    .line 520
    const/16 v22, 0x0

    .line 521
    .line 522
    const/high16 v23, -0x80000000

    .line 523
    .line 524
    const v24, -0x800001

    .line 525
    .line 526
    .line 527
    const/16 v27, 0x0

    .line 528
    .line 529
    const/high16 v28, -0x1000000

    .line 530
    .line 531
    const/16 v30, 0x0

    .line 532
    .line 533
    const/16 v31, 0x0

    .line 534
    .line 535
    move-object/from16 v16, v15

    .line 536
    .line 537
    move/from16 v29, v23

    .line 538
    .line 539
    invoke-direct/range {v13 .. v31}, Ldefpackage/ig0;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 540
    .line 541
    .line 542
    move-object v11, v13

    .line 543
    :goto_9
    const/4 v6, 0x0

    .line 544
    goto :goto_b

    .line 545
    :cond_13
    :goto_a
    const/4 v11, 0x0

    .line 546
    goto :goto_9

    .line 547
    :goto_b
    iput v6, v2, Ldefpackage/bg3;->d:I

    .line 548
    .line 549
    iput v6, v2, Ldefpackage/bg3;->e:I

    .line 550
    .line 551
    iput v6, v2, Ldefpackage/bg3;->f:I

    .line 552
    .line 553
    iput v6, v2, Ldefpackage/bg3;->g:I

    .line 554
    .line 555
    iput v6, v2, Ldefpackage/bg3;->h:I

    .line 556
    .line 557
    iput v6, v2, Ldefpackage/bg3;->i:I

    .line 558
    .line 559
    invoke-virtual {v3, v6}, Ldefpackage/be3;->K(I)V

    .line 560
    .line 561
    .line 562
    iput-boolean v6, v2, Ldefpackage/bg3;->c:Z

    .line 563
    .line 564
    :goto_c
    invoke-virtual {v4, v9}, Ldefpackage/be3;->N(I)V

    .line 565
    .line 566
    .line 567
    :goto_d
    if-eqz v11, :cond_14

    .line 568
    .line 569
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    :cond_14
    move v0, v6

    .line 573
    move-object v1, v12

    .line 574
    goto/16 :goto_0

    .line 575
    .line 576
    :cond_15
    new-instance v5, Ldefpackage/lg0;

    .line 577
    .line 578
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    invoke-direct/range {v5 .. v10}, Ldefpackage/lg0;-><init>(JJLjava/util/List;)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v0, p5

    .line 592
    .line 593
    invoke-interface {v0, v5}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/r72;

    .line 4
    .line 5
    invoke-interface {p0}, Ldefpackage/r72;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public e(Ldefpackage/v33;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/w33;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-virtual {v0, p0, p1, v1}, Ldefpackage/w33;->a(Ldefpackage/bq4;Ldefpackage/v33;I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public f(Ldefpackage/s83;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p2, v0, :cond_1

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p0, "Unsupported priority value: "

    .line 8
    .line 9
    invoke-static {p2, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    iget-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ldefpackage/w33;

    .line 30
    .line 31
    invoke-virtual {v0, p0, p1, p2}, Ldefpackage/w33;->a(Ldefpackage/bq4;Ldefpackage/v33;I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public g(Ldefpackage/v33;Ldefpackage/t33;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/w33;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Ldefpackage/w33;->g:I

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, v0}, Ldefpackage/w33;->c(I)Ldefpackage/u83;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Ldefpackage/w33;->f:Ldefpackage/u83;

    .line 19
    .line 20
    iput v0, p0, Ldefpackage/w33;->g:I

    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/w33;->h:Ldefpackage/v33;

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object p1, v1, Ldefpackage/u83;->d:Ldefpackage/v83;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p0, p0, Ldefpackage/w33;->a:Ldefpackage/nl4;

    .line 34
    .line 35
    new-instance p1, Ldefpackage/y33;

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ldefpackage/y33;-><init>(Ldefpackage/t33;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-virtual {p0, p2, p1}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/ia4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/ia4;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(Ldefpackage/d5;)Ldefpackage/jo4;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ldefpackage/jo4;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Ldefpackage/jo4;->b:Ldefpackage/d5;

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Ldefpackage/jo4;

    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Ldefpackage/jo4;-><init>(Landroid/content/Context;Ldefpackage/d5;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public j()Ldefpackage/ms2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/pn2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/pn2;->s:Ldefpackage/oj2;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/oj2;->d:Ldefpackage/ms2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public k(Ldefpackage/rc5;)Ldefpackage/zp4;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/rc5;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget p1, p1, Ldefpackage/rc5;->b:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const-string v2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 10
    .line 11
    invoke-static {v1, v2}, Ldefpackage/w24;->b(ILjava/lang/String;)Ldefpackage/w24;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3, v0}, Ldefpackage/w24;->h(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    int-to-long v3, p1

    .line 20
    invoke-virtual {v2, v1, v3, v4}, Ldefpackage/w24;->c(IJ)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/s24;->b()V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v2}, Ldefpackage/xl;->H(Ldefpackage/s24;Ldefpackage/wo4;)Landroid/database/Cursor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :try_start_0
    const-string p1, "work_spec_id"

    .line 35
    .line 36
    invoke-static {p0, p1}, Ldefpackage/e35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const-string v0, "generation"

    .line 41
    .line 42
    invoke-static {p0, v0}, Ldefpackage/e35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v1, "system_id"

    .line 47
    .line 48
    invoke-static {p0, v1}, Ldefpackage/e35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v3, Ldefpackage/zp4;

    .line 71
    .line 72
    invoke-direct {v3, p1, v0, v1}, Ldefpackage/zp4;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    const/4 v3, 0x0

    .line 79
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ldefpackage/w24;->j()V

    .line 83
    .line 84
    .line 85
    return-object v3

    .line 86
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ldefpackage/w24;->j()V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/xi4;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ldefpackage/e75;

    .line 9
    .line 10
    iget-object v1, v1, Ldefpackage/e75;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ldefpackage/x65;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ldefpackage/i30;->d(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ldefpackage/b75;

    .line 27
    .line 28
    instance-of p1, p0, Ldefpackage/k54;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    check-cast p0, Ldefpackage/k54;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ldefpackage/k54;->d:Ldefpackage/ea2;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p0, p0, Ldefpackage/k54;->e:Ldefpackage/rm3;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v1, p0, p1}, Ldefpackage/te5;->c(Ldefpackage/x65;Ldefpackage/rm3;Ldefpackage/ea2;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_4

    .line 52
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    new-instance v1, Ldefpackage/f03;

    .line 57
    .line 58
    iget-object v2, p0, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ldefpackage/tf0;

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ldefpackage/f03;-><init>(Ldefpackage/tf0;)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Ldefpackage/d75;->a:Ldefpackage/z45;

    .line 66
    .line 67
    iget-object v3, v1, Ldefpackage/tf0;->a:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ldefpackage/b75;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :try_start_1
    invoke-interface {v2, p1, v1}, Ldefpackage/b75;->c(Ldefpackage/i30;Ldefpackage/f03;)Ldefpackage/x65;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :goto_1
    move-object v1, p1

    .line 84
    goto :goto_2

    .line 85
    :catch_0
    :try_start_2
    iget-object v3, p1, Ldefpackage/i30;->n:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-interface {v2, v3, v1}, Ldefpackage/b75;->b(Ljava/lang/Class;Ldefpackage/f03;)Ldefpackage/x65;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    goto :goto_1

    .line 95
    :catch_1
    :try_start_3
    iget-object p1, p1, Ldefpackage/i30;->n:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {v2, p1}, Ldefpackage/b75;->a(Ljava/lang/Class;)Ldefpackage/x65;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_1

    .line 105
    :goto_2
    iget-object p0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Ldefpackage/e75;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, Ldefpackage/e75;->a:Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ldefpackage/x65;

    .line 122
    .line 123
    if-eqz p0, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0}, Ldefpackage/x65;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 126
    .line 127
    .line 128
    :cond_2
    :goto_3
    monitor-exit v0

    .line 129
    return-object v1

    .line 130
    :goto_4
    monitor-exit v0

    .line 131
    throw p0
.end method

.method public n(Ldefpackage/zp4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/s24;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ldefpackage/s24;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/vo0;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ldefpackage/vo0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/s24;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/s24;->o()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    invoke-virtual {v0}, Ldefpackage/s24;->o()V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public o(Ldefpackage/oj2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    iget-object v0, p1, Ldefpackage/oj2;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_9

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ldefpackage/ld3;

    .line 26
    .line 27
    iget-object v2, v1, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroid/os/Bundle;

    .line 30
    .line 31
    const-string v3, "android.media.browse.extra.PAGE"

    .line 32
    .line 33
    const/4 v4, -0x1

    .line 34
    if-nez p3, :cond_1

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p3, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    :goto_1
    if-nez v2, :cond_2

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_2
    const-string v6, "android.media.browse.extra.PAGE_SIZE"

    .line 51
    .line 52
    if-nez p3, :cond_3

    .line 53
    .line 54
    move v7, v4

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    invoke-virtual {p3, v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    :goto_3
    if-nez v2, :cond_4

    .line 61
    .line 62
    move v2, v4

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    invoke-virtual {v2, v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :goto_4
    const v6, 0x7fffffff

    .line 69
    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    if-eq v5, v4, :cond_6

    .line 73
    .line 74
    if-ne v7, v4, :cond_5

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_5
    mul-int/2addr v5, v7

    .line 78
    add-int/2addr v7, v5

    .line 79
    add-int/lit8 v7, v7, -0x1

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_6
    :goto_5
    move v7, v6

    .line 83
    move v5, v8

    .line 84
    :goto_6
    if-eq v3, v4, :cond_8

    .line 85
    .line 86
    if-ne v2, v4, :cond_7

    .line 87
    .line 88
    goto :goto_7

    .line 89
    :cond_7
    mul-int v8, v2, v3

    .line 90
    .line 91
    add-int/2addr v2, v8

    .line 92
    add-int/lit8 v6, v2, -0x1

    .line 93
    .line 94
    :cond_8
    :goto_7
    if-lt v7, v8, :cond_0

    .line 95
    .line 96
    if-lt v6, v5, :cond_0

    .line 97
    .line 98
    iget-object v2, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ldefpackage/pn2;

    .line 101
    .line 102
    iget-object v1, v1, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-virtual {v2, p2, p1, v1, p3}, Ldefpackage/pn2;->g(Ljava/lang/String;Ldefpackage/oj2;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_9
    return-void
.end method

.method public p(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/qj2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/service/media/MediaBrowserService;->notifyChildrenChanged(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q(Ldefpackage/d5;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/bq4;->i(Ldefpackage/d5;)Ldefpackage/jo4;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Ldefpackage/xu2;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/content/Context;

    .line 14
    .line 15
    check-cast p2, Ldefpackage/oo4;

    .line 16
    .line 17
    invoke-direct {v1, p0, p2}, Ldefpackage/xu2;-><init>(Landroid/content/Context;Ldefpackage/oo4;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public r()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/qj2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/pn2;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Ldefpackage/qj2;-><init>(Ldefpackage/bq4;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public s(Ldefpackage/d5;Landroid/view/Menu;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/bq4;->i(Ldefpackage/d5;)Ldefpackage/jo4;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/yd4;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/Menu;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ldefpackage/jv2;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Landroid/content/Context;

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    check-cast v3, Ldefpackage/qu2;

    .line 29
    .line 30
    invoke-direct {v2, p0, v3}, Ldefpackage/jv2;-><init>(Landroid/content/Context;Ldefpackage/qu2;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2, v2}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method
