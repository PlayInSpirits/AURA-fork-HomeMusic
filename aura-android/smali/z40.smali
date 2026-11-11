.class public final Lz40;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Lqn4;


# static fields
.field public static final s:Lca1;


# instance fields
.field public final n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lca1;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lz40;->s:Lca1;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 536
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 537
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 538
    iput-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 539
    new-instance v0, Lfl;

    const/4 v1, 0x0

    .line 540
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 541
    iput-object v0, p0, Lz40;->p:Ljava/lang/Object;

    .line 542
    new-instance v0, Lq03;

    invoke-direct {v0}, Lq03;-><init>()V

    .line 543
    iput-object v0, p0, Lz40;->q:Ljava/lang/Object;

    .line 544
    new-instance v0, Lq03;

    invoke-direct {v0}, Lq03;-><init>()V

    .line 545
    iput-object v0, p0, Lz40;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 5

    .line 546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz40;->n:Ljava/lang/Object;

    .line 547
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    .line 548
    :cond_0
    iget-object v2, p0, Lz40;->n:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v4}, Lqm4;->r0(Ljava/lang/CharSequence;CII)I

    move-result v1

    if-gez v1, :cond_1

    .line 549
    iget-object v1, p0, Lz40;->n:Ljava/lang/Object;

    check-cast v1, Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 550
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    iget-object v2, p0, Lz40;->n:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 552
    iput-object p1, p0, Lz40;->p:Ljava/lang/Object;

    .line 553
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lz40;->o:Ljava/lang/Object;

    .line 554
    iget-object p1, p0, Lz40;->p:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lz40;->q:Ljava/lang/Object;

    .line 555
    iget-object p0, p0, Lz40;->p:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 567
    iput-object p2, p0, Lz40;->n:Ljava/lang/Object;

    iput-object p3, p0, Lz40;->o:Ljava/lang/Object;

    iput-object p4, p0, Lz40;->p:Ljava/lang/Object;

    iput-object p5, p0, Lz40;->q:Ljava/lang/Object;

    iput-object p6, p0, Lz40;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V
    .locals 0

    .line 514
    iput-object p1, p0, Lz40;->n:Ljava/lang/Object;

    iput-object p2, p0, Lz40;->o:Ljava/lang/Object;

    iput-object p3, p0, Lz40;->p:Ljava/lang/Object;

    iput-object p4, p0, Lz40;->q:Ljava/lang/Object;

    iput-object p5, p0, Lz40;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbq4;Landroid/content/Context;)V
    .locals 6

    .line 522
    new-instance v0, Lsr;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 523
    invoke-direct {v0, v1, p1, v2}, Lsr;-><init>(Landroid/content/Context;Lbq4;I)V

    .line 524
    new-instance v1, Lsr;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x1

    .line 525
    invoke-direct {v1, v2, p1, v3}, Lsr;-><init>(Landroid/content/Context;Lbq4;I)V

    .line 526
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Ls53;->a:Ljava/lang/String;

    .line 527
    new-instance v3, Lr53;

    invoke-direct {v3, p1, v2}, Lr53;-><init>(Lbq4;Landroid/content/Context;)V

    .line 528
    new-instance v2, Lsr;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x2

    .line 529
    invoke-direct {v2, v4, p1, v5}, Lsr;-><init>(Landroid/content/Context;Lbq4;I)V

    .line 530
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 531
    iput-object p2, p0, Lz40;->n:Ljava/lang/Object;

    .line 532
    iput-object v0, p0, Lz40;->o:Ljava/lang/Object;

    .line 533
    iput-object v1, p0, Lz40;->p:Ljava/lang/Object;

    .line 534
    iput-object v3, p0, Lz40;->q:Ljava/lang/Object;

    .line 535
    iput-object v2, p0, Lz40;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 516
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 517
    iput-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 518
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lz40;->o:Ljava/lang/Object;

    .line 519
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lz40;->p:Ljava/lang/Object;

    .line 520
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lz40;->q:Ljava/lang/Object;

    .line 521
    new-instance p1, Lcs0;

    const/4 v0, 0x4

    invoke-direct {p1, v0, p0}, Lcs0;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lz40;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmm3;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llm3;)V
    .locals 0

    .line 568
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz40;->r:Ljava/lang/Object;

    iput-object p2, p0, Lz40;->n:Ljava/lang/Object;

    iput-object p3, p0, Lz40;->o:Ljava/lang/Object;

    iput-object p4, p0, Lz40;->p:Ljava/lang/Object;

    iput-object p5, p0, Lz40;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luy4;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 557
    iput-object p1, p0, Lz40;->n:Ljava/lang/Object;

    .line 558
    iput-object p3, p0, Lz40;->q:Ljava/lang/Object;

    .line 559
    iput-object p4, p0, Lz40;->r:Ljava/lang/Object;

    .line 560
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lz40;->p:Ljava/lang/Object;

    .line 561
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 562
    invoke-virtual {p1, p2, p3}, Luy4;->d(Ljava/util/TreeSet;Z)V

    .line 563
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 564
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 565
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 566
    :cond_0
    iput-object p1, p0, Lz40;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([II[Lmd3;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x3

    .line 11
    new-array v3, v3, [F

    .line 12
    .line 13
    iput-object v3, v0, Lz40;->r:Ljava/lang/Object;

    .line 14
    .line 15
    move-object/from16 v3, p3

    .line 16
    .line 17
    iput-object v3, v0, Lz40;->q:Ljava/lang/Object;

    .line 18
    .line 19
    const v3, 0x8000

    .line 20
    .line 21
    .line 22
    new-array v4, v3, [I

    .line 23
    .line 24
    iput-object v4, v0, Lz40;->o:Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    move v6, v5

    .line 28
    :goto_0
    array-length v7, v1

    .line 29
    const/16 v8, 0x8

    .line 30
    .line 31
    const/4 v9, 0x5

    .line 32
    const/4 v10, 0x1

    .line 33
    if-ge v6, v7, :cond_0

    .line 34
    .line 35
    aget v7, v1, v6

    .line 36
    .line 37
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    invoke-static {v11, v8, v9}, Lz40;->h(III)I

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    invoke-static {v12, v8, v9}, Lz40;->h(III)I

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-static {v7, v8, v9}, Lz40;->h(III)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    shl-int/lit8 v8, v11, 0xa

    .line 62
    .line 63
    shl-int/lit8 v9, v12, 0x5

    .line 64
    .line 65
    or-int/2addr v8, v9

    .line 66
    or-int/2addr v7, v8

    .line 67
    aput v7, v1, v6

    .line 68
    .line 69
    aget v8, v4, v7

    .line 70
    .line 71
    add-int/2addr v8, v10

    .line 72
    aput v8, v4, v7

    .line 73
    .line 74
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v1, v5

    .line 78
    move v6, v1

    .line 79
    :goto_1
    if-ge v1, v3, :cond_3

    .line 80
    .line 81
    aget v7, v4, v1

    .line 82
    .line 83
    if-lez v7, :cond_1

    .line 84
    .line 85
    shr-int/lit8 v7, v1, 0xa

    .line 86
    .line 87
    and-int/lit8 v7, v7, 0x1f

    .line 88
    .line 89
    shr-int/lit8 v11, v1, 0x5

    .line 90
    .line 91
    and-int/lit8 v11, v11, 0x1f

    .line 92
    .line 93
    and-int/lit8 v12, v1, 0x1f

    .line 94
    .line 95
    invoke-static {v7, v9, v8}, Lz40;->h(III)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-static {v11, v9, v8}, Lz40;->h(III)I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    invoke-static {v12, v9, v8}, Lz40;->h(III)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    invoke-static {v7, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    iget-object v11, v0, Lz40;->r:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v11, [F

    .line 114
    .line 115
    sget-object v12, Lv50;->a:Ljava/lang/ThreadLocal;

    .line 116
    .line 117
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-static {v12, v13, v7, v11}, Lv50;->a(III[F)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v11}, Lz40;->j([F)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_1

    .line 137
    .line 138
    aput v5, v4, v1

    .line 139
    .line 140
    :cond_1
    aget v7, v4, v1

    .line 141
    .line 142
    if-lez v7, :cond_2

    .line 143
    .line 144
    add-int/lit8 v6, v6, 0x1

    .line 145
    .line 146
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    new-array v1, v6, [I

    .line 150
    .line 151
    iput-object v1, v0, Lz40;->n:Ljava/lang/Object;

    .line 152
    .line 153
    move v7, v5

    .line 154
    move v11, v7

    .line 155
    :goto_2
    if-ge v7, v3, :cond_5

    .line 156
    .line 157
    aget v12, v4, v7

    .line 158
    .line 159
    if-lez v12, :cond_4

    .line 160
    .line 161
    add-int/lit8 v12, v11, 0x1

    .line 162
    .line 163
    aput v7, v1, v11

    .line 164
    .line 165
    move v11, v12

    .line 166
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    if-gt v6, v2, :cond_7

    .line 170
    .line 171
    new-instance v2, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object v2, v0, Lz40;->p:Ljava/lang/Object;

    .line 177
    .line 178
    :goto_3
    if-ge v5, v6, :cond_6

    .line 179
    .line 180
    aget v2, v1, v5

    .line 181
    .line 182
    iget-object v3, v0, Lz40;->p:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Ljava/util/ArrayList;

    .line 185
    .line 186
    new-instance v7, Lnd3;

    .line 187
    .line 188
    shr-int/lit8 v10, v2, 0xa

    .line 189
    .line 190
    and-int/lit8 v10, v10, 0x1f

    .line 191
    .line 192
    shr-int/lit8 v11, v2, 0x5

    .line 193
    .line 194
    and-int/lit8 v11, v11, 0x1f

    .line 195
    .line 196
    and-int/lit8 v12, v2, 0x1f

    .line 197
    .line 198
    invoke-static {v10, v9, v8}, Lz40;->h(III)I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-static {v11, v9, v8}, Lz40;->h(III)I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    invoke-static {v12, v9, v8}, Lz40;->h(III)I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    invoke-static {v10, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    aget v2, v4, v2

    .line 215
    .line 216
    invoke-direct {v7, v10, v2}, Lnd3;-><init>(II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    add-int/lit8 v5, v5, 0x1

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    return-void

    .line 226
    :cond_7
    new-instance v1, Ljava/util/PriorityQueue;

    .line 227
    .line 228
    sget-object v3, Lz40;->s:Lca1;

    .line 229
    .line 230
    invoke-direct {v1, v2, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 231
    .line 232
    .line 233
    new-instance v3, Ly40;

    .line 234
    .line 235
    iget-object v4, v0, Lz40;->n:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v4, [I

    .line 238
    .line 239
    array-length v4, v4

    .line 240
    sub-int/2addr v4, v10

    .line 241
    invoke-direct {v3, v0, v5, v4}, Ly40;-><init>(Lz40;II)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v3}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :goto_4
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->size()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-ge v3, v2, :cond_d

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Ly40;

    .line 258
    .line 259
    if-eqz v3, :cond_d

    .line 260
    .line 261
    iget v4, v3, Ly40;->b:I

    .line 262
    .line 263
    add-int/lit8 v6, v4, 0x1

    .line 264
    .line 265
    iget v7, v3, Ly40;->a:I

    .line 266
    .line 267
    sub-int/2addr v6, v7

    .line 268
    if-le v6, v10, :cond_d

    .line 269
    .line 270
    iget-object v6, v3, Ly40;->j:Lz40;

    .line 271
    .line 272
    add-int/lit8 v11, v4, 0x1

    .line 273
    .line 274
    sub-int/2addr v11, v7

    .line 275
    if-le v11, v10, :cond_c

    .line 276
    .line 277
    iget v11, v3, Ly40;->e:I

    .line 278
    .line 279
    iget v12, v3, Ly40;->d:I

    .line 280
    .line 281
    sub-int/2addr v11, v12

    .line 282
    iget v12, v3, Ly40;->g:I

    .line 283
    .line 284
    iget v13, v3, Ly40;->f:I

    .line 285
    .line 286
    sub-int/2addr v12, v13

    .line 287
    iget v13, v3, Ly40;->i:I

    .line 288
    .line 289
    iget v14, v3, Ly40;->h:I

    .line 290
    .line 291
    sub-int/2addr v13, v14

    .line 292
    if-lt v11, v12, :cond_8

    .line 293
    .line 294
    if-lt v11, v13, :cond_8

    .line 295
    .line 296
    const/4 v11, -0x3

    .line 297
    goto :goto_5

    .line 298
    :cond_8
    if-lt v12, v11, :cond_9

    .line 299
    .line 300
    if-lt v12, v13, :cond_9

    .line 301
    .line 302
    const/4 v11, -0x2

    .line 303
    goto :goto_5

    .line 304
    :cond_9
    const/4 v11, -0x1

    .line 305
    :goto_5
    iget-object v12, v6, Lz40;->n:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v12, [I

    .line 308
    .line 309
    iget-object v13, v6, Lz40;->o:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v13, [I

    .line 312
    .line 313
    invoke-static {v12, v11, v7, v4}, Lz40;->g([IIII)V

    .line 314
    .line 315
    .line 316
    iget v4, v3, Ly40;->b:I

    .line 317
    .line 318
    add-int/2addr v4, v10

    .line 319
    invoke-static {v12, v7, v4}, Ljava/util/Arrays;->sort([III)V

    .line 320
    .line 321
    .line 322
    iget v4, v3, Ly40;->b:I

    .line 323
    .line 324
    invoke-static {v12, v11, v7, v4}, Lz40;->g([IIII)V

    .line 325
    .line 326
    .line 327
    iget v4, v3, Ly40;->c:I

    .line 328
    .line 329
    div-int/lit8 v4, v4, 0x2

    .line 330
    .line 331
    move v14, v5

    .line 332
    move v11, v7

    .line 333
    :goto_6
    iget v15, v3, Ly40;->b:I

    .line 334
    .line 335
    if-gt v11, v15, :cond_b

    .line 336
    .line 337
    aget v16, v12, v11

    .line 338
    .line 339
    aget v16, v13, v16

    .line 340
    .line 341
    add-int v14, v14, v16

    .line 342
    .line 343
    if-lt v14, v4, :cond_a

    .line 344
    .line 345
    add-int/lit8 v15, v15, -0x1

    .line 346
    .line 347
    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    goto :goto_7

    .line 352
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_b
    :goto_7
    new-instance v4, Ly40;

    .line 356
    .line 357
    add-int/lit8 v11, v7, 0x1

    .line 358
    .line 359
    iget v12, v3, Ly40;->b:I

    .line 360
    .line 361
    invoke-direct {v4, v6, v11, v12}, Ly40;-><init>(Lz40;II)V

    .line 362
    .line 363
    .line 364
    iput v7, v3, Ly40;->b:I

    .line 365
    .line 366
    invoke-virtual {v3}, Ly40;->a()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v4}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v3}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    goto/16 :goto_4

    .line 376
    .line 377
    :cond_c
    const-string v0, "Can not split a box with only 1 color"

    .line 378
    .line 379
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    throw v0

    .line 384
    :cond_d
    new-instance v2, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->size()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-eqz v3, :cond_10

    .line 402
    .line 403
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Ly40;

    .line 408
    .line 409
    iget-object v4, v3, Ly40;->j:Lz40;

    .line 410
    .line 411
    iget-object v6, v4, Lz40;->n:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v6, [I

    .line 414
    .line 415
    iget-object v4, v4, Lz40;->o:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v4, [I

    .line 418
    .line 419
    iget v7, v3, Ly40;->a:I

    .line 420
    .line 421
    move v10, v5

    .line 422
    move v11, v10

    .line 423
    move v12, v11

    .line 424
    move v13, v12

    .line 425
    :goto_9
    iget v14, v3, Ly40;->b:I

    .line 426
    .line 427
    if-gt v7, v14, :cond_f

    .line 428
    .line 429
    aget v14, v6, v7

    .line 430
    .line 431
    aget v15, v4, v14

    .line 432
    .line 433
    add-int/2addr v11, v15

    .line 434
    shr-int/lit8 v16, v14, 0xa

    .line 435
    .line 436
    and-int/lit8 v16, v16, 0x1f

    .line 437
    .line 438
    mul-int v16, v16, v15

    .line 439
    .line 440
    add-int v10, v16, v10

    .line 441
    .line 442
    shr-int/lit8 v16, v14, 0x5

    .line 443
    .line 444
    and-int/lit8 v16, v16, 0x1f

    .line 445
    .line 446
    mul-int v16, v16, v15

    .line 447
    .line 448
    add-int v12, v16, v12

    .line 449
    .line 450
    and-int/lit8 v14, v14, 0x1f

    .line 451
    .line 452
    mul-int/2addr v15, v14

    .line 453
    add-int/2addr v13, v15

    .line 454
    add-int/lit8 v7, v7, 0x1

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_f
    int-to-float v3, v10

    .line 458
    int-to-float v4, v11

    .line 459
    div-float/2addr v3, v4

    .line 460
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    int-to-float v6, v12

    .line 465
    div-float/2addr v6, v4

    .line 466
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    int-to-float v7, v13

    .line 471
    div-float/2addr v7, v4

    .line 472
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    new-instance v7, Lnd3;

    .line 477
    .line 478
    invoke-static {v3, v9, v8}, Lz40;->h(III)I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    invoke-static {v6, v9, v8}, Lz40;->h(III)I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    invoke-static {v4, v9, v8}, Lz40;->h(III)I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    invoke-static {v3, v6, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    invoke-direct {v7, v3, v11}, Lnd3;-><init>(II)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v7}, Lnd3;->b()[F

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {v0, v3}, Lz40;->j([F)Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    if-nez v3, :cond_e

    .line 506
    .line 507
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto :goto_8

    .line 511
    :cond_10
    iput-object v2, v0, Lz40;->p:Ljava/lang/Object;

    .line 512
    .line 513
    return-void
.end method

.method public static g([IIII)V
    .locals 2

    .line 1
    const/4 v0, -0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    :goto_0
    if-gt p2, p3, :cond_2

    .line 9
    .line 10
    aget p1, p0, p2

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1f

    .line 13
    .line 14
    shl-int/lit8 v0, v0, 0xa

    .line 15
    .line 16
    shr-int/lit8 v1, p1, 0x5

    .line 17
    .line 18
    and-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    shl-int/lit8 v1, v1, 0x5

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    shr-int/lit8 p1, p1, 0xa

    .line 24
    .line 25
    and-int/lit8 p1, p1, 0x1f

    .line 26
    .line 27
    or-int/2addr p1, v0

    .line 28
    aput p1, p0, p2

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    if-gt p2, p3, :cond_2

    .line 34
    .line 35
    aget p1, p0, p2

    .line 36
    .line 37
    shr-int/lit8 v0, p1, 0x5

    .line 38
    .line 39
    and-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    shl-int/lit8 v0, v0, 0xa

    .line 42
    .line 43
    shr-int/lit8 v1, p1, 0xa

    .line 44
    .line 45
    and-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    shl-int/lit8 v1, v1, 0x5

    .line 48
    .line 49
    or-int/2addr v0, v1

    .line 50
    and-int/lit8 p1, p1, 0x1f

    .line 51
    .line 52
    or-int/2addr p1, v0

    .line 53
    aput p1, p0, p2

    .line 54
    .line 55
    add-int/lit8 p2, p2, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_2
    return-void
.end method

.method public static h(III)I
    .locals 0

    .line 1
    if-le p2, p1, :cond_0

    .line 2
    .line 3
    sub-int p1, p2, p1

    .line 4
    .line 5
    shl-int/2addr p0, p1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sub-int/2addr p1, p2

    .line 8
    shr-int/2addr p0, p1

    .line 9
    :goto_0
    const/4 p1, 0x1

    .line 10
    shl-int p2, p1, p2

    .line 11
    .line 12
    sub-int/2addr p2, p1

    .line 13
    and-int/2addr p0, p2

    .line 14
    return p0
.end method


# virtual methods
.method public a(Lko;Lgf1;)Lez;
    .locals 8

    .line 1
    new-instance v0, Lhx3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lhx3;->n:I

    .line 8
    .line 9
    iget-object v1, p0, Lz40;->n:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, p0, Lz40;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Throwable;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Lko;->b(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lfz0;->E:Lkf2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v1

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    :try_start_1
    iget-object v2, p0, Lz40;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lfl;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/lit8 v4, v3, 0x1

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v2, 0x7ffffff

    .line 45
    .line 46
    .line 47
    and-int/2addr v2, v4

    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v2, v5

    .line 55
    :goto_0
    ushr-int/lit8 v4, v4, 0x1b

    .line 56
    .line 57
    and-int/lit8 v4, v4, 0xf

    .line 58
    .line 59
    iput v4, v0, Lhx3;->n:I

    .line 60
    .line 61
    iget-object v4, p0, Lz40;->q:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Lq03;

    .line 64
    .line 65
    invoke-virtual {v4, p1}, Lq03;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v1

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    if-eqz p2, :cond_6

    .line 72
    .line 73
    :try_start_2
    invoke-interface {p2}, Lgf1;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :catchall_1
    move-exception p2

    .line 78
    iget-object v1, p0, Lz40;->n:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_3
    iget-object v2, p0, Lz40;->o:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    :goto_1
    monitor-exit v1

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    :try_start_4
    iput-object p2, p0, Lz40;->o:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v2, p0, Lz40;->q:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lq03;

    .line 94
    .line 95
    iget-object v4, v2, Lq03;->a:[Ljava/lang/Object;

    .line 96
    .line 97
    iget v2, v2, Lq03;->b:I

    .line 98
    .line 99
    move v6, v5

    .line 100
    :goto_2
    if-ge v6, v2, :cond_4

    .line 101
    .line 102
    aget-object v7, v4, v6

    .line 103
    .line 104
    check-cast v7, Lko;

    .line 105
    .line 106
    invoke-virtual {v7, p2}, Lko;->b(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_2
    move-exception p0

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    iget-object p2, p0, Lz40;->q:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p2, Lq03;

    .line 117
    .line 118
    invoke-virtual {p2}, Lq03;->d()V

    .line 119
    .line 120
    .line 121
    iget-object p2, p0, Lz40;->p:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p2, Lfl;

    .line 124
    .line 125
    :cond_5
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    ushr-int/lit8 v4, v2, 0x1b

    .line 130
    .line 131
    and-int/lit8 v4, v4, 0xf

    .line 132
    .line 133
    add-int/2addr v4, v3

    .line 134
    and-int/lit8 v4, v4, 0xf

    .line 135
    .line 136
    shl-int/lit8 v4, v4, 0x1b

    .line 137
    .line 138
    invoke-virtual {p2, v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 139
    .line 140
    .line 141
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :goto_3
    monitor-exit v1

    .line 146
    throw p0

    .line 147
    :cond_6
    :goto_4
    new-instance p2, Lgp3;

    .line 148
    .line 149
    new-instance v1, Ljo;

    .line 150
    .line 151
    invoke-direct {v1, p1, p0, v0, v5}, Ljo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    invoke-direct {p2, v1}, Lgp3;-><init>(Ljo;)V

    .line 155
    .line 156
    .line 157
    return-object p2

    .line 158
    :goto_5
    monitor-exit v1

    .line 159
    throw p0
.end method

.method public b(Lif1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lz40;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lq03;

    .line 7
    .line 8
    iget-object v2, p0, Lz40;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lq03;

    .line 11
    .line 12
    iput-object v2, p0, Lz40;->q:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, p0, Lz40;->r:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p0, p0, Lz40;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lfl;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    ushr-int/lit8 v3, v2, 0x1b

    .line 25
    .line 26
    and-int/lit8 v3, v3, 0xf

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    and-int/lit8 v3, v3, 0xf

    .line 31
    .line 32
    shl-int/lit8 v3, v3, 0x1b

    .line 33
    .line 34
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget p0, v1, Lq03;->b:I

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    if-ge v2, p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lq03;->f(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p1, v3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v1}, Lq03;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0

    .line 63
    throw p0
.end method

.method public c(IZ)F
    .locals 1

    .line 1
    iget-object p0, p0, Lz40;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineEnd(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-le p1, v0, :cond_0

    .line 14
    .line 15
    move p1, v0

    .line 16
    :cond_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public d(IZZ)F
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lz40;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v4, v0, Lz40;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Landroid/text/Layout;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p2}, Lz40;->c(IZ)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    invoke-static {v4, v1, v2}, Lvr1;->w(Landroid/text/Layout;IZ)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineStart(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineEnd(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eq v1, v6, :cond_1

    .line 35
    .line 36
    if-eq v1, v7, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p2}, Lz40;->c(IZ)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :cond_1
    if-eqz v1, :cond_30

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-ne v1, v8, :cond_2

    .line 54
    .line 55
    goto/16 :goto_1b

    .line 56
    .line 57
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-static {v3, v8}, Lgb;->e(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    const/4 v9, 0x1

    .line 66
    if-gez v8, :cond_3

    .line 67
    .line 68
    add-int/2addr v8, v9

    .line 69
    neg-int v8, v8

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    add-int/2addr v8, v9

    .line 72
    :goto_0
    if-eqz v2, :cond_4

    .line 73
    .line 74
    if-lez v8, :cond_4

    .line 75
    .line 76
    add-int/lit8 v2, v8, -0x1

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    check-cast v10, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-ne v1, v10, :cond_4

    .line 89
    .line 90
    move v8, v2

    .line 91
    :cond_4
    if-nez v8, :cond_5

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    goto :goto_1

    .line 95
    :cond_5
    add-int/lit8 v10, v8, -0x1

    .line 96
    .line 97
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    check-cast v10, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    :goto_1
    invoke-virtual {v4, v10}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    invoke-virtual {v4, v10}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    const/4 v11, -0x1

    .line 116
    if-ne v10, v11, :cond_6

    .line 117
    .line 118
    move v10, v9

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    const/4 v10, 0x0

    .line 121
    :goto_2
    invoke-virtual {v0, v7, v6}, Lz40;->f(II)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-nez v8, :cond_7

    .line 126
    .line 127
    const/4 v12, 0x0

    .line 128
    goto :goto_3

    .line 129
    :cond_7
    add-int/lit8 v12, v8, -0x1

    .line 130
    .line 131
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    :goto_3
    sub-int v13, v6, v12

    .line 142
    .line 143
    sub-int v12, v7, v12

    .line 144
    .line 145
    iget-object v14, v0, Lz40;->o:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v14, Ljava/util/ArrayList;

    .line 148
    .line 149
    iget-object v15, v0, Lz40;->q:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v15, [Z

    .line 152
    .line 153
    aget-boolean v16, v15, v8

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    if-eqz v16, :cond_8

    .line 158
    .line 159
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Ljava/text/Bidi;

    .line 164
    .line 165
    move/from16 v27, v5

    .line 166
    .line 167
    move/from16 v26, v7

    .line 168
    .line 169
    move v5, v11

    .line 170
    goto/16 :goto_a

    .line 171
    .line 172
    :cond_8
    if-nez v8, :cond_9

    .line 173
    .line 174
    const/4 v9, 0x0

    .line 175
    goto :goto_4

    .line 176
    :cond_9
    add-int/lit8 v9, v8, -0x1

    .line 177
    .line 178
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    check-cast v9, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    :goto_4
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v18

    .line 192
    check-cast v18, Ljava/lang/Number;

    .line 193
    .line 194
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    sub-int v2, v11, v9

    .line 199
    .line 200
    move-object/from16 v25, v15

    .line 201
    .line 202
    iget-object v15, v0, Lz40;->r:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v15, [C

    .line 205
    .line 206
    move/from16 v26, v7

    .line 207
    .line 208
    if-eqz v15, :cond_a

    .line 209
    .line 210
    array-length v7, v15

    .line 211
    if-ge v7, v2, :cond_b

    .line 212
    .line 213
    :cond_a
    new-array v15, v2, [C

    .line 214
    .line 215
    :cond_b
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    move/from16 v27, v5

    .line 220
    .line 221
    const/4 v5, 0x0

    .line 222
    invoke-static {v7, v9, v11, v15, v5}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 223
    .line 224
    .line 225
    invoke-static {v15, v5, v2}, Ljava/text/Bidi;->requiresBidi([CII)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-eqz v7, :cond_f

    .line 230
    .line 231
    if-nez v8, :cond_c

    .line 232
    .line 233
    const/4 v5, 0x0

    .line 234
    goto :goto_5

    .line 235
    :cond_c
    add-int/lit8 v5, v8, -0x1

    .line 236
    .line 237
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Ljava/lang/Number;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    :goto_5
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    const/4 v5, -0x1

    .line 256
    if-ne v3, v5, :cond_d

    .line 257
    .line 258
    const/16 v24, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_d
    const/16 v24, 0x0

    .line 262
    .line 263
    :goto_6
    new-instance v18, Ljava/text/Bidi;

    .line 264
    .line 265
    const/16 v21, 0x0

    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const/16 v20, 0x0

    .line 270
    .line 271
    move/from16 v23, v2

    .line 272
    .line 273
    move-object/from16 v19, v15

    .line 274
    .line 275
    invoke-direct/range {v18 .. v24}, Ljava/text/Bidi;-><init>([CI[BIII)V

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v18 .. v18}, Ljava/text/Bidi;->getRunCount()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    const/4 v3, 0x1

    .line 283
    if-ne v2, v3, :cond_e

    .line 284
    .line 285
    :goto_7
    move-object/from16 v2, v17

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_e
    move-object/from16 v2, v18

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_f
    const/4 v3, 0x1

    .line 292
    const/4 v5, -0x1

    .line 293
    goto :goto_7

    .line 294
    :goto_8
    invoke-virtual {v14, v8, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    aput-boolean v3, v25, v8

    .line 298
    .line 299
    if-eqz v2, :cond_11

    .line 300
    .line 301
    iget-object v3, v0, Lz40;->r:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v3, [C

    .line 304
    .line 305
    if-ne v15, v3, :cond_10

    .line 306
    .line 307
    move-object/from16 v15, v17

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_10
    move-object v15, v3

    .line 311
    :cond_11
    :goto_9
    iput-object v15, v0, Lz40;->r:Ljava/lang/Object;

    .line 312
    .line 313
    move-object v3, v2

    .line 314
    :goto_a
    if-eqz v3, :cond_12

    .line 315
    .line 316
    invoke-virtual {v3, v13, v12}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 317
    .line 318
    .line 319
    move-result-object v17

    .line 320
    :cond_12
    move-object/from16 v2, v17

    .line 321
    .line 322
    if-eqz v2, :cond_29

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    const/4 v7, 0x1

    .line 329
    if-ne v3, v7, :cond_13

    .line 330
    .line 331
    move/from16 v16, v7

    .line 332
    .line 333
    :goto_b
    move/from16 v8, v27

    .line 334
    .line 335
    const/4 v11, 0x0

    .line 336
    goto/16 :goto_18

    .line 337
    .line 338
    :cond_13
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    new-array v7, v3, [Ls62;

    .line 343
    .line 344
    const/4 v8, 0x0

    .line 345
    :goto_c
    if-ge v8, v3, :cond_15

    .line 346
    .line 347
    new-instance v9, Ls62;

    .line 348
    .line 349
    invoke-virtual {v2, v8}, Ljava/text/Bidi;->getRunStart(I)I

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    add-int/2addr v11, v6

    .line 354
    invoke-virtual {v2, v8}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    add-int/2addr v12, v6

    .line 359
    invoke-virtual {v2, v8}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    rem-int/lit8 v13, v13, 0x2

    .line 364
    .line 365
    const/4 v14, 0x1

    .line 366
    if-ne v13, v14, :cond_14

    .line 367
    .line 368
    const/4 v13, 0x1

    .line 369
    goto :goto_d

    .line 370
    :cond_14
    const/4 v13, 0x0

    .line 371
    :goto_d
    invoke-direct {v9, v11, v12, v13}, Ls62;-><init>(IIZ)V

    .line 372
    .line 373
    .line 374
    aput-object v9, v7, v8

    .line 375
    .line 376
    add-int/lit8 v8, v8, 0x1

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_15
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    new-array v9, v8, [B

    .line 384
    .line 385
    const/4 v11, 0x0

    .line 386
    :goto_e
    if-ge v11, v8, :cond_16

    .line 387
    .line 388
    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 389
    .line 390
    .line 391
    move-result v12

    .line 392
    int-to-byte v12, v12

    .line 393
    aput-byte v12, v9, v11

    .line 394
    .line 395
    add-int/lit8 v11, v11, 0x1

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_16
    const/4 v11, 0x0

    .line 399
    invoke-static {v9, v11, v7, v11, v3}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 400
    .line 401
    .line 402
    if-ne v1, v6, :cond_1f

    .line 403
    .line 404
    move v0, v11

    .line 405
    :goto_f
    if-ge v0, v3, :cond_18

    .line 406
    .line 407
    aget-object v2, v7, v0

    .line 408
    .line 409
    iget v2, v2, Ls62;->a:I

    .line 410
    .line 411
    if-ne v2, v1, :cond_17

    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_17
    add-int/lit8 v0, v0, 0x1

    .line 415
    .line 416
    goto :goto_f

    .line 417
    :cond_18
    move v0, v5

    .line 418
    :goto_10
    aget-object v1, v7, v0

    .line 419
    .line 420
    if-nez p2, :cond_1a

    .line 421
    .line 422
    iget-boolean v1, v1, Ls62;->c:Z

    .line 423
    .line 424
    if-ne v10, v1, :cond_19

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_19
    move v2, v10

    .line 428
    goto :goto_12

    .line 429
    :cond_1a
    :goto_11
    if-nez v10, :cond_1b

    .line 430
    .line 431
    const/4 v2, 0x1

    .line 432
    goto :goto_12

    .line 433
    :cond_1b
    move v2, v11

    .line 434
    :goto_12
    if-nez v0, :cond_1c

    .line 435
    .line 436
    if-eqz v2, :cond_1c

    .line 437
    .line 438
    move/from16 v8, v27

    .line 439
    .line 440
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineLeft(I)F

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    return v0

    .line 445
    :cond_1c
    move/from16 v8, v27

    .line 446
    .line 447
    const/16 v16, 0x1

    .line 448
    .line 449
    add-int/lit8 v3, v3, -0x1

    .line 450
    .line 451
    if-ne v0, v3, :cond_1d

    .line 452
    .line 453
    if-nez v2, :cond_1d

    .line 454
    .line 455
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineRight(I)F

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    return v0

    .line 460
    :cond_1d
    if-eqz v2, :cond_1e

    .line 461
    .line 462
    add-int/lit8 v0, v0, -0x1

    .line 463
    .line 464
    aget-object v0, v7, v0

    .line 465
    .line 466
    iget v0, v0, Ls62;->a:I

    .line 467
    .line 468
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    return v0

    .line 473
    :cond_1e
    add-int/lit8 v0, v0, 0x1

    .line 474
    .line 475
    aget-object v0, v7, v0

    .line 476
    .line 477
    iget v0, v0, Ls62;->a:I

    .line 478
    .line 479
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    return v0

    .line 484
    :cond_1f
    move/from16 v2, v26

    .line 485
    .line 486
    move/from16 v8, v27

    .line 487
    .line 488
    if-le v1, v2, :cond_20

    .line 489
    .line 490
    invoke-virtual {v0, v1, v6}, Lz40;->f(II)I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    goto :goto_13

    .line 495
    :cond_20
    move v0, v1

    .line 496
    :goto_13
    move v1, v11

    .line 497
    :goto_14
    if-ge v1, v3, :cond_22

    .line 498
    .line 499
    aget-object v2, v7, v1

    .line 500
    .line 501
    iget v2, v2, Ls62;->b:I

    .line 502
    .line 503
    if-ne v2, v0, :cond_21

    .line 504
    .line 505
    goto :goto_15

    .line 506
    :cond_21
    add-int/lit8 v1, v1, 0x1

    .line 507
    .line 508
    goto :goto_14

    .line 509
    :cond_22
    move v1, v5

    .line 510
    :goto_15
    aget-object v0, v7, v1

    .line 511
    .line 512
    if-nez p2, :cond_25

    .line 513
    .line 514
    iget-boolean v0, v0, Ls62;->c:Z

    .line 515
    .line 516
    if-ne v10, v0, :cond_23

    .line 517
    .line 518
    goto :goto_16

    .line 519
    :cond_23
    if-nez v10, :cond_24

    .line 520
    .line 521
    const/4 v2, 0x1

    .line 522
    goto :goto_17

    .line 523
    :cond_24
    move v2, v11

    .line 524
    goto :goto_17

    .line 525
    :cond_25
    :goto_16
    move v2, v10

    .line 526
    :goto_17
    if-nez v1, :cond_26

    .line 527
    .line 528
    if-eqz v2, :cond_26

    .line 529
    .line 530
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineLeft(I)F

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    return v0

    .line 535
    :cond_26
    const/16 v16, 0x1

    .line 536
    .line 537
    add-int/lit8 v3, v3, -0x1

    .line 538
    .line 539
    if-ne v1, v3, :cond_27

    .line 540
    .line 541
    if-nez v2, :cond_27

    .line 542
    .line 543
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineRight(I)F

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    return v0

    .line 548
    :cond_27
    if-eqz v2, :cond_28

    .line 549
    .line 550
    add-int/lit8 v1, v1, -0x1

    .line 551
    .line 552
    aget-object v0, v7, v1

    .line 553
    .line 554
    iget v0, v0, Ls62;->b:I

    .line 555
    .line 556
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    return v0

    .line 561
    :cond_28
    add-int/lit8 v1, v1, 0x1

    .line 562
    .line 563
    aget-object v0, v7, v1

    .line 564
    .line 565
    iget v0, v0, Ls62;->b:I

    .line 566
    .line 567
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    return v0

    .line 572
    :cond_29
    const/16 v16, 0x1

    .line 573
    .line 574
    goto/16 :goto_b

    .line 575
    .line 576
    :goto_18
    invoke-virtual {v4, v6}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez p2, :cond_2a

    .line 581
    .line 582
    if-ne v10, v0, :cond_2c

    .line 583
    .line 584
    :cond_2a
    if-nez v10, :cond_2b

    .line 585
    .line 586
    move/from16 v10, v16

    .line 587
    .line 588
    goto :goto_19

    .line 589
    :cond_2b
    move v10, v11

    .line 590
    :cond_2c
    :goto_19
    if-ne v1, v6, :cond_2d

    .line 591
    .line 592
    move v9, v10

    .line 593
    goto :goto_1a

    .line 594
    :cond_2d
    if-nez v10, :cond_2e

    .line 595
    .line 596
    move/from16 v9, v16

    .line 597
    .line 598
    goto :goto_1a

    .line 599
    :cond_2e
    move v9, v11

    .line 600
    :goto_1a
    if-eqz v9, :cond_2f

    .line 601
    .line 602
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineLeft(I)F

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    return v0

    .line 607
    :cond_2f
    invoke-virtual {v4, v8}, Landroid/text/Layout;->getLineRight(I)F

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    return v0

    .line 612
    :cond_30
    :goto_1b
    invoke-virtual/range {p0 .. p2}, Lz40;->c(IZ)F

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    return v0
.end method

.method public e(J)I
    .locals 1

    .line 1
    iget-object p0, p0, Lz40;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Lf35;->b([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p0, p0

    .line 11
    if-ge p1, p0, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public f(II)I
    .locals 2

    .line 1
    :goto_0
    if-le p1, p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/text/Layout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/16 v1, 0xa

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x1680

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x2000

    .line 30
    .line 31
    invoke-static {v0, v1}, Lh12;->j(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ltz v1, :cond_0

    .line 36
    .line 37
    const/16 v1, 0x200a

    .line 38
    .line 39
    invoke-static {v0, v1}, Lh12;->j(II)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-gtz v1, :cond_0

    .line 44
    .line 45
    const/16 v1, 0x2007

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    :cond_0
    const/16 v1, 0x205f

    .line 50
    .line 51
    if-eq v0, v1, :cond_2

    .line 52
    .line 53
    const/16 v1, 0x3000

    .line 54
    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    return p1

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return p1
.end method

.method public i(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lz40;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lnl4;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lnl4;->i(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lz40;->q:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lnl4;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lnl4;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public j([F)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lz40;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [Lmd3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_3

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    if-lez v1, :cond_3

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    move v2, v0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_3

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    aget v3, p1, v3

    .line 22
    .line 23
    const v4, 0x3f733333    # 0.95f

    .line 24
    .line 25
    .line 26
    cmpl-float v4, v3, v4

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-ltz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const v4, 0x3d4ccccd    # 0.05f

    .line 33
    .line 34
    .line 35
    cmpg-float v3, v3, v4

    .line 36
    .line 37
    if-gtz v3, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    aget v3, p1, v0

    .line 41
    .line 42
    const/high16 v4, 0x41200000    # 10.0f

    .line 43
    .line 44
    cmpl-float v4, v3, v4

    .line 45
    .line 46
    if-ltz v4, :cond_2

    .line 47
    .line 48
    const/high16 v4, 0x42140000    # 37.0f

    .line 49
    .line 50
    cmpg-float v3, v3, v4

    .line 51
    .line 52
    if-gtz v3, :cond_2

    .line 53
    .line 54
    aget v3, p1, v5

    .line 55
    .line 56
    const v4, 0x3f51eb85    # 0.82f

    .line 57
    .line 58
    .line 59
    cmpg-float v3, v3, v4

    .line 60
    .line 61
    if-gtz v3, :cond_2

    .line 62
    .line 63
    :goto_1
    return v5

    .line 64
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    return v0
.end method

.method public k(I)J
    .locals 2

    .line 1
    iget-object p0, p0, Lz40;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    aget-wide v0, p0, p1

    .line 6
    .line 7
    return-wide v0
.end method

.method public m(J)Ljava/util/List;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lz40;->n:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Luy4;

    .line 7
    .line 8
    iget-object v1, v0, Lz40;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/Map;

    .line 11
    .line 12
    iget-object v3, v0, Lz40;->q:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v8, v3

    .line 15
    check-cast v8, Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v0, v0, Lz40;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/HashMap;

    .line 20
    .line 21
    new-instance v9, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v3, v2, Luy4;->h:Ljava/lang/String;

    .line 27
    .line 28
    move-wide/from16 v4, p1

    .line 29
    .line 30
    invoke-virtual {v2, v4, v5, v3, v9}, Luy4;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Ljava/util/TreeMap;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    iget-object v6, v2, Luy4;->h:Ljava/lang/String;

    .line 40
    .line 41
    move-wide/from16 v3, p1

    .line 42
    .line 43
    invoke-virtual/range {v2 .. v7}, Luy4;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, Luy4;->h:Ljava/lang/String;

    .line 47
    .line 48
    move-object v5, v1

    .line 49
    move-object v6, v8

    .line 50
    move-object v8, v7

    .line 51
    move-object v7, v3

    .line 52
    move-wide/from16 v3, p1

    .line 53
    .line 54
    invoke-virtual/range {v2 .. v8}, Luy4;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 55
    .line 56
    .line 57
    move-object v7, v8

    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v3, 0x0

    .line 68
    move v4, v3

    .line 69
    :goto_0
    if-ge v4, v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    check-cast v5, Landroid/util/Pair;

    .line 78
    .line 79
    iget-object v8, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    check-cast v8, Ljava/lang/String;

    .line 86
    .line 87
    if-nez v8, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-static {v8, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    array-length v10, v8

    .line 95
    invoke-static {v8, v3, v10}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lwy4;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget v8, v5, Lwy4;->b:F

    .line 111
    .line 112
    iget v10, v5, Lwy4;->c:F

    .line 113
    .line 114
    iget v11, v5, Lwy4;->e:I

    .line 115
    .line 116
    iget v12, v5, Lwy4;->f:F

    .line 117
    .line 118
    iget v13, v5, Lwy4;->g:F

    .line 119
    .line 120
    iget v5, v5, Lwy4;->j:I

    .line 121
    .line 122
    move/from16 v18, v11

    .line 123
    .line 124
    new-instance v11, Lig0;

    .line 125
    .line 126
    move/from16 v23, v12

    .line 127
    .line 128
    const/4 v12, 0x0

    .line 129
    move/from16 v24, v13

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/high16 v21, -0x80000000

    .line 137
    .line 138
    const v22, -0x800001

    .line 139
    .line 140
    .line 141
    const/16 v25, 0x0

    .line 142
    .line 143
    const/high16 v26, -0x1000000

    .line 144
    .line 145
    const/16 v28, 0x0

    .line 146
    .line 147
    const/16 v29, 0x0

    .line 148
    .line 149
    move-object v14, v13

    .line 150
    move/from16 v27, v5

    .line 151
    .line 152
    move/from16 v19, v8

    .line 153
    .line 154
    move/from16 v16, v10

    .line 155
    .line 156
    invoke-direct/range {v11 .. v29}, Lig0;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_1
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ljava/util/Map$Entry;

    .line 182
    .line 183
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, Lwy4;

    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lhg0;

    .line 201
    .line 202
    iget-object v5, v2, Lhg0;->a:Ljava/lang/CharSequence;

    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast v5, Landroid/text/SpannableStringBuilder;

    .line 208
    .line 209
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    const-class v8, Lko0;

    .line 214
    .line 215
    invoke-virtual {v5, v3, v7, v8}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, [Lko0;

    .line 220
    .line 221
    array-length v8, v7

    .line 222
    move v9, v3

    .line 223
    :goto_2
    if-ge v9, v8, :cond_2

    .line 224
    .line 225
    aget-object v10, v7, v9

    .line 226
    .line 227
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    const-string v12, ""

    .line 236
    .line 237
    invoke-virtual {v5, v11, v10, v12}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 238
    .line 239
    .line 240
    add-int/lit8 v9, v9, 0x1

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_2
    move v7, v3

    .line 244
    :goto_3
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    const/16 v9, 0x20

    .line 249
    .line 250
    if-ge v7, v8, :cond_5

    .line 251
    .line 252
    invoke-virtual {v5, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    if-ne v8, v9, :cond_4

    .line 257
    .line 258
    add-int/lit8 v8, v7, 0x1

    .line 259
    .line 260
    move v10, v8

    .line 261
    :goto_4
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    if-ge v10, v11, :cond_3

    .line 266
    .line 267
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    if-ne v11, v9, :cond_3

    .line 272
    .line 273
    add-int/lit8 v10, v10, 0x1

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_3
    sub-int/2addr v10, v8

    .line 277
    if-lez v10, :cond_4

    .line 278
    .line 279
    add-int/2addr v10, v7

    .line 280
    invoke-virtual {v5, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 281
    .line 282
    .line 283
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_5
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    const/4 v8, 0x1

    .line 291
    if-lez v7, :cond_6

    .line 292
    .line 293
    invoke-virtual {v5, v3}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-ne v7, v9, :cond_6

    .line 298
    .line 299
    invoke-virtual {v5, v3, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 300
    .line 301
    .line 302
    :cond_6
    move v7, v3

    .line 303
    :goto_5
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    sub-int/2addr v10, v8

    .line 308
    const/16 v11, 0xa

    .line 309
    .line 310
    if-ge v7, v10, :cond_8

    .line 311
    .line 312
    invoke-virtual {v5, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    if-ne v10, v11, :cond_7

    .line 317
    .line 318
    add-int/lit8 v10, v7, 0x1

    .line 319
    .line 320
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    if-ne v11, v9, :cond_7

    .line 325
    .line 326
    add-int/lit8 v11, v7, 0x2

    .line 327
    .line 328
    invoke-virtual {v5, v10, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 329
    .line 330
    .line 331
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_8
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-lez v7, :cond_9

    .line 339
    .line 340
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    sub-int/2addr v7, v8

    .line 345
    invoke-virtual {v5, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    if-ne v7, v9, :cond_9

    .line 350
    .line 351
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 352
    .line 353
    .line 354
    move-result v7

    .line 355
    sub-int/2addr v7, v8

    .line 356
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    invoke-virtual {v5, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 361
    .line 362
    .line 363
    :cond_9
    move v7, v3

    .line 364
    :goto_6
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    sub-int/2addr v10, v8

    .line 369
    if-ge v7, v10, :cond_b

    .line 370
    .line 371
    invoke-virtual {v5, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    if-ne v10, v9, :cond_a

    .line 376
    .line 377
    add-int/lit8 v10, v7, 0x1

    .line 378
    .line 379
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    if-ne v12, v11, :cond_a

    .line 384
    .line 385
    invoke-virtual {v5, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 386
    .line 387
    .line 388
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_b
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-lez v7, :cond_c

    .line 396
    .line 397
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    sub-int/2addr v7, v8

    .line 402
    invoke-virtual {v5, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-ne v7, v11, :cond_c

    .line 407
    .line 408
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    sub-int/2addr v7, v8

    .line 413
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    invoke-virtual {v5, v7, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 418
    .line 419
    .line 420
    :cond_c
    iget v5, v4, Lwy4;->c:F

    .line 421
    .line 422
    iget v7, v4, Lwy4;->d:I

    .line 423
    .line 424
    iput v5, v2, Lhg0;->e:F

    .line 425
    .line 426
    iput v7, v2, Lhg0;->f:I

    .line 427
    .line 428
    iget v5, v4, Lwy4;->e:I

    .line 429
    .line 430
    iput v5, v2, Lhg0;->g:I

    .line 431
    .line 432
    iget v5, v4, Lwy4;->b:F

    .line 433
    .line 434
    iput v5, v2, Lhg0;->h:F

    .line 435
    .line 436
    iget v5, v4, Lwy4;->f:F

    .line 437
    .line 438
    iput v5, v2, Lhg0;->l:F

    .line 439
    .line 440
    iget v5, v4, Lwy4;->i:F

    .line 441
    .line 442
    iget v7, v4, Lwy4;->h:I

    .line 443
    .line 444
    iput v5, v2, Lhg0;->k:F

    .line 445
    .line 446
    iput v7, v2, Lhg0;->j:I

    .line 447
    .line 448
    iget v4, v4, Lwy4;->j:I

    .line 449
    .line 450
    iput v4, v2, Lhg0;->p:I

    .line 451
    .line 452
    invoke-virtual {v2}, Lhg0;->a()Lig0;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto/16 :goto_1

    .line 460
    .line 461
    :cond_d
    return-object v1
.end method

.method public n()I
    .locals 0

    .line 1
    iget-object p0, p0, Lz40;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    return p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lz40;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Llm3;

    .line 4
    .line 5
    invoke-interface {p0}, Llm3;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lz40;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Llm3;

    .line 4
    .line 5
    iget-object v0, p0, Lz40;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lz40;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lmm3;

    .line 12
    .line 13
    invoke-static {p2}, Lmm3;->f(Lretrofit2/Response;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    iget-object p2, p0, Lz40;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/Thread;

    .line 24
    .line 25
    new-instance v3, Lqo2;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, v1, v0, p2, v4}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lz40;->p:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p2, 0x0

    .line 52
    invoke-static {p2}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Lpn4;->g()Lrm3;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v3, "BrowsingClient"

    .line 64
    .line 65
    const-string v4, "createPlaylist()"

    .line 66
    .line 67
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    iget-object v3, v2, Lrm3;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Lqm3;

    .line 73
    .line 74
    iget-object v2, v2, Lrm3;->n:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lpn4;

    .line 77
    .line 78
    invoke-virtual {v2}, Lpn4;->f()Ljava/util/HashMap;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-interface {v3, v2, v0, v4, p0}, Lqm3;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance v0, Lhd5;

    .line 88
    .line 89
    const/16 v2, 0x11

    .line 90
    .line 91
    invoke-direct {v0, v1, p1, p2, v2}, Lhd5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lmm3;->g()V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Llm3;->onSuccess()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_2
    invoke-interface {p1}, Llm3;->g()V

    .line 106
    .line 107
    .line 108
    return-void
.end method
