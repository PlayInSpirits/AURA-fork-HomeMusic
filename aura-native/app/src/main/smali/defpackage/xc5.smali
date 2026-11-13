.class public final Ldefpackage/xc5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xs;
.implements Lretrofit2/Callback;
.implements Ldefpackage/in4;
.implements Ldefpackage/ps;
.implements Ldefpackage/m54;
.implements Ldefpackage/g84;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldefpackage/xc5;->n:I

    sparse-switch p1, :sswitch_data_0

    .line 1464
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1465
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1466
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void

    .line 1467
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 1468
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    new-instance p1, Ljava/util/WeakHashMap;

    .line 1469
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 1470
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void

    .line 1471
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1472
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1473
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1455
    iput p1, p0, Ldefpackage/xc5;->n:I

    iput-object p2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1453
    iput p1, p0, Ldefpackage/xc5;->n:I

    iput-object p2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1454
    iput p1, p0, Ldefpackage/xc5;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1481
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1482
    iput-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1483
    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ldefpackage/qm;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1477
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 1478
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1479
    :goto_0
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1480
    iput-object p2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1508
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1509
    iput-object p2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1474
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1475
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1476
    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 4

    const/4 v0, 0x7

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1484
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1485
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1486
    new-instance v0, Ldefpackage/l01;

    invoke-direct {v0, p1}, Ldefpackage/l01;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1487
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1488
    sget-object p0, Ldefpackage/yz0;->b:Ldefpackage/yz0;

    if-nez p0, :cond_1

    .line 1489
    sget-object p0, Ldefpackage/yz0;->a:Ljava/lang/Object;

    monitor-enter p0

    .line 1490
    :try_start_0
    sget-object v0, Ldefpackage/yz0;->b:Ldefpackage/yz0;

    if-nez v0, :cond_0

    .line 1491
    new-instance v0, Ldefpackage/yz0;

    .line 1492
    invoke-direct {v0}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1493
    :try_start_1
    const-string v1, "android.text.DynamicLayout$ChangeWatcher"

    .line 1494
    const-class v2, Ldefpackage/yz0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Ldefpackage/yz0;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1495
    :catchall_0
    :try_start_2
    sput-object v0, Ldefpackage/yz0;->b:Ldefpackage/yz0;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 1496
    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 1497
    :cond_1
    :goto_2
    sget-object p0, Ldefpackage/yz0;->b:Ldefpackage/yz0;

    .line 1498
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1456
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1457
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1458
    new-instance v0, Ldefpackage/vo0;

    const/4 v1, 0x3

    .line 1459
    invoke-direct {v0, p1, v1}, Ldefpackage/vo0;-><init>(Ldefpackage/s24;I)V

    .line 1460
    iput-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/gy3;[I)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1499
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1500
    invoke-static {p1}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1501
    iput-object p2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/iu4;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1462
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1463
    new-instance p1, Ldefpackage/be3;

    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/mm3;Ldefpackage/hq1;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1502
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/pn4;I)V
    .locals 28

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
    iput v2, v0, Ldefpackage/xc5;->n:I

    .line 8
    .line 9
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-string v12, "https://localhost/rest/"

    .line 14
    .line 15
    const-string v13, ""

    .line 16
    .line 17
    const/4 v15, 0x2

    .line 18
    const/4 v3, 0x1

    .line 19
    const-class v4, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 20
    .line 21
    const-class v6, Ljava/util/Date;

    .line 22
    .line 23
    sparse-switch v2, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v2, Ldefpackage/ok1;

    .line 32
    .line 33
    invoke-direct {v2}, Ldefpackage/ok1;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v7, Ldefpackage/r01;

    .line 37
    .line 38
    invoke-direct {v7}, Ldefpackage/r01;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v6, v7}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Ldefpackage/lt;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v4, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v3, v2, Ldefpackage/ok1;->j:Z

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    iget-object v4, v2, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    iget-object v7, v2, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v16

    .line 68
    add-int v16, v16, v6

    .line 69
    .line 70
    add-int/lit8 v6, v16, 0x3

    .line 71
    .line 72
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    iget v6, v2, Ldefpackage/ok1;->g:I

    .line 93
    .line 94
    iget v9, v2, Ldefpackage/ok1;->h:I

    .line 95
    .line 96
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 97
    .line 98
    sget-boolean v16, Ldefpackage/gk4;->a:Z

    .line 99
    .line 100
    if-eq v6, v15, :cond_1

    .line 101
    .line 102
    if-eq v9, v15, :cond_1

    .line 103
    .line 104
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    if-eqz v16, :cond_0

    .line 109
    .line 110
    sget-object v15, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 111
    .line 112
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    sget-object v11, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 117
    .line 118
    invoke-virtual {v11, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v6, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    :goto_0
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    if-eqz v16, :cond_1

    .line 129
    .line 130
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_1
    new-instance v16, Ldefpackage/nk1;

    .line 137
    .line 138
    iget-object v6, v2, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 139
    .line 140
    iget v9, v2, Ldefpackage/ok1;->c:I

    .line 141
    .line 142
    new-instance v10, Ljava/util/HashMap;

    .line 143
    .line 144
    iget-object v11, v2, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    iget-boolean v11, v2, Ldefpackage/ok1;->i:Z

    .line 150
    .line 151
    iget-boolean v15, v2, Ldefpackage/ok1;->j:Z

    .line 152
    .line 153
    iget-boolean v14, v2, Ldefpackage/ok1;->k:Z

    .line 154
    .line 155
    move-object/from16 v24, v3

    .line 156
    .line 157
    iget v3, v2, Ldefpackage/ok1;->b:I

    .line 158
    .line 159
    move/from16 v23, v3

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    new-instance v3, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 169
    .line 170
    .line 171
    iget v3, v2, Ldefpackage/ok1;->l:I

    .line 172
    .line 173
    iget v4, v2, Ldefpackage/ok1;->m:I

    .line 174
    .line 175
    new-instance v7, Ljava/util/ArrayList;

    .line 176
    .line 177
    iget-object v2, v2, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 178
    .line 179
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 180
    .line 181
    .line 182
    move/from16 v25, v3

    .line 183
    .line 184
    move/from16 v26, v4

    .line 185
    .line 186
    move-object/from16 v17, v6

    .line 187
    .line 188
    move-object/from16 v27, v7

    .line 189
    .line 190
    move/from16 v18, v9

    .line 191
    .line 192
    move-object/from16 v19, v10

    .line 193
    .line 194
    move/from16 v20, v11

    .line 195
    .line 196
    move/from16 v22, v14

    .line 197
    .line 198
    move/from16 v21, v15

    .line 199
    .line 200
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 201
    .line 202
    .line 203
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 204
    .line 205
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-eqz v1, :cond_2

    .line 213
    .line 214
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    goto :goto_1

    .line 223
    :cond_2
    const/4 v1, 0x0

    .line 224
    :goto_1
    if-nez v1, :cond_3

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_3
    move-object v13, v1

    .line 228
    :goto_2
    :try_start_0
    new-instance v1, Ldefpackage/fr1;

    .line 229
    .line 230
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 231
    .line 232
    .line 233
    const/4 v3, 0x0

    .line 234
    invoke-virtual {v1, v3, v13}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 238
    .line 239
    .line 240
    move-result-object v14
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    goto :goto_3

    .line 242
    :catch_0
    const/4 v14, 0x0

    .line 243
    :goto_3
    if-eqz v14, :cond_4

    .line 244
    .line 245
    iget-object v1, v14, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-lez v1, :cond_4

    .line 252
    .line 253
    move-object v12, v13

    .line 254
    :cond_4
    invoke-virtual {v2, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    new-instance v2, Ldefpackage/cx;

    .line 267
    .line 268
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    new-instance v3, Ldefpackage/rx;

    .line 272
    .line 273
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 274
    .line 275
    .line 276
    const v4, 0x278d00

    .line 277
    .line 278
    .line 279
    iput v4, v2, Ldefpackage/cx;->a:I

    .line 280
    .line 281
    new-instance v2, Ldefpackage/n83;

    .line 282
    .line 283
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 284
    .line 285
    .line 286
    const-wide/16 v6, 0x2

    .line 287
    .line 288
    invoke-virtual {v2, v6, v7, v8}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 289
    .line 290
    .line 291
    const-wide/16 v6, 0x14

    .line 292
    .line 293
    invoke-virtual {v2, v6, v7, v5}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 294
    .line 295
    .line 296
    const-wide/16 v6, 0x1e

    .line 297
    .line 298
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    iput v4, v2, Ldefpackage/n83;->z:I

    .line 303
    .line 304
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 309
    .line 310
    new-instance v4, Ldefpackage/dr1;

    .line 311
    .line 312
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 313
    .line 314
    .line 315
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 316
    .line 317
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 318
    .line 319
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    new-instance v3, Ldefpackage/hx;

    .line 330
    .line 331
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 343
    .line 344
    .line 345
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 346
    .line 347
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 348
    .line 349
    if-eqz v3, :cond_5

    .line 350
    .line 351
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 352
    .line 353
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 354
    .line 355
    .line 356
    :cond_5
    new-instance v3, Ldefpackage/o83;

    .line 357
    .line 358
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const-class v2, Ldefpackage/w8;

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    check-cast v1, Ldefpackage/w8;

    .line 379
    .line 380
    iput-object v1, v0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 381
    .line 382
    return-void

    .line 383
    :sswitch_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 384
    .line 385
    .line 386
    iput-object v1, v0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 387
    .line 388
    new-instance v2, Ldefpackage/ok1;

    .line 389
    .line 390
    invoke-direct {v2}, Ldefpackage/ok1;-><init>()V

    .line 391
    .line 392
    .line 393
    new-instance v7, Ldefpackage/r01;

    .line 394
    .line 395
    invoke-direct {v7}, Ldefpackage/r01;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v6, v7}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 399
    .line 400
    .line 401
    new-instance v6, Ldefpackage/lt;

    .line 402
    .line 403
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 407
    .line 408
    .line 409
    iput-boolean v3, v2, Ldefpackage/ok1;->j:Z

    .line 410
    .line 411
    new-instance v3, Ljava/util/ArrayList;

    .line 412
    .line 413
    iget-object v4, v2, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    iget-object v7, v2, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    add-int/2addr v9, v6

    .line 426
    add-int/lit8 v9, v9, 0x3

    .line 427
    .line 428
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 432
    .line 433
    .line 434
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 435
    .line 436
    .line 437
    new-instance v6, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 446
    .line 447
    .line 448
    iget v6, v2, Ldefpackage/ok1;->g:I

    .line 449
    .line 450
    iget v9, v2, Ldefpackage/ok1;->h:I

    .line 451
    .line 452
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 453
    .line 454
    sget-boolean v11, Ldefpackage/gk4;->a:Z

    .line 455
    .line 456
    if-eq v6, v15, :cond_7

    .line 457
    .line 458
    if-eq v9, v15, :cond_7

    .line 459
    .line 460
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    if-eqz v11, :cond_6

    .line 465
    .line 466
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 467
    .line 468
    invoke-virtual {v14, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    sget-object v15, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 473
    .line 474
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    goto :goto_4

    .line 479
    :cond_6
    const/4 v6, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    :goto_4
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    if-eqz v11, :cond_7

    .line 485
    .line 486
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    :cond_7
    new-instance v16, Ldefpackage/nk1;

    .line 493
    .line 494
    iget-object v6, v2, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 495
    .line 496
    iget v9, v2, Ldefpackage/ok1;->c:I

    .line 497
    .line 498
    new-instance v10, Ljava/util/HashMap;

    .line 499
    .line 500
    iget-object v11, v2, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 501
    .line 502
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 503
    .line 504
    .line 505
    iget-boolean v11, v2, Ldefpackage/ok1;->i:Z

    .line 506
    .line 507
    iget-boolean v14, v2, Ldefpackage/ok1;->j:Z

    .line 508
    .line 509
    iget-boolean v15, v2, Ldefpackage/ok1;->k:Z

    .line 510
    .line 511
    move-object/from16 v24, v3

    .line 512
    .line 513
    iget v3, v2, Ldefpackage/ok1;->b:I

    .line 514
    .line 515
    move/from16 v23, v3

    .line 516
    .line 517
    new-instance v3, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 520
    .line 521
    .line 522
    new-instance v3, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 525
    .line 526
    .line 527
    iget v3, v2, Ldefpackage/ok1;->l:I

    .line 528
    .line 529
    iget v4, v2, Ldefpackage/ok1;->m:I

    .line 530
    .line 531
    new-instance v7, Ljava/util/ArrayList;

    .line 532
    .line 533
    iget-object v2, v2, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 534
    .line 535
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 536
    .line 537
    .line 538
    move/from16 v25, v3

    .line 539
    .line 540
    move/from16 v26, v4

    .line 541
    .line 542
    move-object/from16 v17, v6

    .line 543
    .line 544
    move-object/from16 v27, v7

    .line 545
    .line 546
    move/from16 v18, v9

    .line 547
    .line 548
    move-object/from16 v19, v10

    .line 549
    .line 550
    move/from16 v20, v11

    .line 551
    .line 552
    move/from16 v21, v14

    .line 553
    .line 554
    move/from16 v22, v15

    .line 555
    .line 556
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 557
    .line 558
    .line 559
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 560
    .line 561
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    if-eqz v1, :cond_8

    .line 569
    .line 570
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    goto :goto_5

    .line 579
    :cond_8
    const/4 v1, 0x0

    .line 580
    :goto_5
    if-nez v1, :cond_9

    .line 581
    .line 582
    goto :goto_6

    .line 583
    :cond_9
    move-object v13, v1

    .line 584
    :goto_6
    :try_start_1
    new-instance v1, Ldefpackage/fr1;

    .line 585
    .line 586
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 587
    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    invoke-virtual {v1, v3, v13}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 594
    .line 595
    .line 596
    move-result-object v14
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 597
    goto :goto_7

    .line 598
    :catch_1
    const/4 v14, 0x0

    .line 599
    :goto_7
    if-eqz v14, :cond_a

    .line 600
    .line 601
    iget-object v1, v14, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-lez v1, :cond_a

    .line 608
    .line 609
    move-object v12, v13

    .line 610
    :cond_a
    invoke-virtual {v2, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    new-instance v2, Ldefpackage/cx;

    .line 623
    .line 624
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 625
    .line 626
    .line 627
    new-instance v3, Ldefpackage/rx;

    .line 628
    .line 629
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 630
    .line 631
    .line 632
    const v4, 0x278d00

    .line 633
    .line 634
    .line 635
    iput v4, v2, Ldefpackage/cx;->a:I

    .line 636
    .line 637
    new-instance v2, Ldefpackage/n83;

    .line 638
    .line 639
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 640
    .line 641
    .line 642
    const-wide/16 v6, 0x2

    .line 643
    .line 644
    invoke-virtual {v2, v6, v7, v8}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 645
    .line 646
    .line 647
    const-wide/16 v6, 0x14

    .line 648
    .line 649
    invoke-virtual {v2, v6, v7, v5}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 650
    .line 651
    .line 652
    const-wide/16 v6, 0x1e

    .line 653
    .line 654
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    iput v4, v2, Ldefpackage/n83;->z:I

    .line 659
    .line 660
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 665
    .line 666
    new-instance v4, Ldefpackage/dr1;

    .line 667
    .line 668
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 669
    .line 670
    .line 671
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 672
    .line 673
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 674
    .line 675
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 681
    .line 682
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    new-instance v3, Ldefpackage/hx;

    .line 686
    .line 687
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 699
    .line 700
    .line 701
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 702
    .line 703
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 704
    .line 705
    if-eqz v3, :cond_b

    .line 706
    .line 707
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 708
    .line 709
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 710
    .line 711
    .line 712
    :cond_b
    new-instance v3, Ldefpackage/o83;

    .line 713
    .line 714
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    const-class v2, Ldefpackage/n93;

    .line 729
    .line 730
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    check-cast v1, Ldefpackage/n93;

    .line 735
    .line 736
    iput-object v1, v0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 737
    .line 738
    return-void

    .line 739
    :sswitch_1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 740
    .line 741
    .line 742
    iput-object v1, v0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 743
    .line 744
    new-instance v2, Ldefpackage/ok1;

    .line 745
    .line 746
    invoke-direct {v2}, Ldefpackage/ok1;-><init>()V

    .line 747
    .line 748
    .line 749
    new-instance v7, Ldefpackage/r01;

    .line 750
    .line 751
    invoke-direct {v7}, Ldefpackage/r01;-><init>()V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v6, v7}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 755
    .line 756
    .line 757
    new-instance v6, Ldefpackage/lt;

    .line 758
    .line 759
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v4, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 763
    .line 764
    .line 765
    iput-boolean v3, v2, Ldefpackage/ok1;->j:Z

    .line 766
    .line 767
    new-instance v3, Ljava/util/ArrayList;

    .line 768
    .line 769
    iget-object v4, v2, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 770
    .line 771
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    iget-object v7, v2, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 776
    .line 777
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 778
    .line 779
    .line 780
    move-result v9

    .line 781
    add-int/2addr v9, v6

    .line 782
    add-int/lit8 v9, v9, 0x3

    .line 783
    .line 784
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 788
    .line 789
    .line 790
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 791
    .line 792
    .line 793
    new-instance v6, Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 796
    .line 797
    .line 798
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 802
    .line 803
    .line 804
    iget v6, v2, Ldefpackage/ok1;->g:I

    .line 805
    .line 806
    iget v9, v2, Ldefpackage/ok1;->h:I

    .line 807
    .line 808
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 809
    .line 810
    sget-boolean v11, Ldefpackage/gk4;->a:Z

    .line 811
    .line 812
    if-eq v6, v15, :cond_d

    .line 813
    .line 814
    if-eq v9, v15, :cond_d

    .line 815
    .line 816
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 817
    .line 818
    .line 819
    move-result-object v10

    .line 820
    if-eqz v11, :cond_c

    .line 821
    .line 822
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 823
    .line 824
    invoke-virtual {v14, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 825
    .line 826
    .line 827
    move-result-object v14

    .line 828
    sget-object v15, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 829
    .line 830
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    goto :goto_8

    .line 835
    :cond_c
    const/4 v6, 0x0

    .line 836
    const/4 v14, 0x0

    .line 837
    :goto_8
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    if-eqz v11, :cond_d

    .line 841
    .line 842
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    :cond_d
    new-instance v16, Ldefpackage/nk1;

    .line 849
    .line 850
    iget-object v6, v2, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 851
    .line 852
    iget v9, v2, Ldefpackage/ok1;->c:I

    .line 853
    .line 854
    new-instance v10, Ljava/util/HashMap;

    .line 855
    .line 856
    iget-object v11, v2, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 857
    .line 858
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 859
    .line 860
    .line 861
    iget-boolean v11, v2, Ldefpackage/ok1;->i:Z

    .line 862
    .line 863
    iget-boolean v14, v2, Ldefpackage/ok1;->j:Z

    .line 864
    .line 865
    iget-boolean v15, v2, Ldefpackage/ok1;->k:Z

    .line 866
    .line 867
    move-object/from16 v24, v3

    .line 868
    .line 869
    iget v3, v2, Ldefpackage/ok1;->b:I

    .line 870
    .line 871
    move/from16 v23, v3

    .line 872
    .line 873
    new-instance v3, Ljava/util/ArrayList;

    .line 874
    .line 875
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 876
    .line 877
    .line 878
    new-instance v3, Ljava/util/ArrayList;

    .line 879
    .line 880
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 881
    .line 882
    .line 883
    iget v3, v2, Ldefpackage/ok1;->l:I

    .line 884
    .line 885
    iget v4, v2, Ldefpackage/ok1;->m:I

    .line 886
    .line 887
    new-instance v7, Ljava/util/ArrayList;

    .line 888
    .line 889
    iget-object v2, v2, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 890
    .line 891
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 892
    .line 893
    .line 894
    move/from16 v25, v3

    .line 895
    .line 896
    move/from16 v26, v4

    .line 897
    .line 898
    move-object/from16 v17, v6

    .line 899
    .line 900
    move-object/from16 v27, v7

    .line 901
    .line 902
    move/from16 v18, v9

    .line 903
    .line 904
    move-object/from16 v19, v10

    .line 905
    .line 906
    move/from16 v20, v11

    .line 907
    .line 908
    move/from16 v21, v14

    .line 909
    .line 910
    move/from16 v22, v15

    .line 911
    .line 912
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 913
    .line 914
    .line 915
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 916
    .line 917
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    if-eqz v1, :cond_e

    .line 925
    .line 926
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    goto :goto_9

    .line 935
    :cond_e
    const/4 v1, 0x0

    .line 936
    :goto_9
    if-nez v1, :cond_f

    .line 937
    .line 938
    goto :goto_a

    .line 939
    :cond_f
    move-object v13, v1

    .line 940
    :goto_a
    :try_start_2
    new-instance v1, Ldefpackage/fr1;

    .line 941
    .line 942
    invoke-direct {v1}, Ldefpackage/fr1;-><init>()V

    .line 943
    .line 944
    .line 945
    const/4 v3, 0x0

    .line 946
    invoke-virtual {v1, v3, v13}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 950
    .line 951
    .line 952
    move-result-object v14
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 953
    goto :goto_b

    .line 954
    :catch_2
    const/4 v14, 0x0

    .line 955
    :goto_b
    if-eqz v14, :cond_10

    .line 956
    .line 957
    iget-object v1, v14, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 958
    .line 959
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-lez v1, :cond_10

    .line 964
    .line 965
    move-object v12, v13

    .line 966
    :cond_10
    invoke-virtual {v2, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    new-instance v2, Ldefpackage/cx;

    .line 979
    .line 980
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 981
    .line 982
    .line 983
    new-instance v3, Ldefpackage/rx;

    .line 984
    .line 985
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 986
    .line 987
    .line 988
    const v4, 0x278d00

    .line 989
    .line 990
    .line 991
    iput v4, v2, Ldefpackage/cx;->a:I

    .line 992
    .line 993
    new-instance v2, Ldefpackage/n83;

    .line 994
    .line 995
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 996
    .line 997
    .line 998
    const-wide/16 v6, 0x2

    .line 999
    .line 1000
    invoke-virtual {v2, v6, v7, v8}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 1001
    .line 1002
    .line 1003
    const-wide/16 v6, 0x14

    .line 1004
    .line 1005
    invoke-virtual {v2, v6, v7, v5}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 1006
    .line 1007
    .line 1008
    const-wide/16 v6, 0x1e

    .line 1009
    .line 1010
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1011
    .line 1012
    .line 1013
    move-result v4

    .line 1014
    iput v4, v2, Ldefpackage/n83;->z:I

    .line 1015
    .line 1016
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 1021
    .line 1022
    new-instance v4, Ldefpackage/dr1;

    .line 1023
    .line 1024
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 1028
    .line 1029
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 1030
    .line 1031
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1032
    .line 1033
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1037
    .line 1038
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    new-instance v3, Ldefpackage/hx;

    .line 1042
    .line 1043
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v4

    .line 1051
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 1055
    .line 1056
    .line 1057
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 1058
    .line 1059
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 1060
    .line 1061
    if-eqz v3, :cond_11

    .line 1062
    .line 1063
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 1064
    .line 1065
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 1066
    .line 1067
    .line 1068
    :cond_11
    new-instance v3, Ldefpackage/o83;

    .line 1069
    .line 1070
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    const-class v2, Ldefpackage/so2;

    .line 1085
    .line 1086
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    check-cast v1, Ldefpackage/so2;

    .line 1091
    .line 1092
    iput-object v1, v0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1093
    .line 1094
    return-void

    .line 1095
    :sswitch_2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1096
    .line 1097
    .line 1098
    iput-object v1, v0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 1099
    .line 1100
    new-instance v2, Ldefpackage/ok1;

    .line 1101
    .line 1102
    invoke-direct {v2}, Ldefpackage/ok1;-><init>()V

    .line 1103
    .line 1104
    .line 1105
    new-instance v7, Ldefpackage/r01;

    .line 1106
    .line 1107
    invoke-direct {v7}, Ldefpackage/r01;-><init>()V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v2, v6, v7}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 1111
    .line 1112
    .line 1113
    new-instance v6, Ldefpackage/lt;

    .line 1114
    .line 1115
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v2, v4, v6}, Ldefpackage/ok1;->a(Ljava/lang/Class;Ldefpackage/g32;)V

    .line 1119
    .line 1120
    .line 1121
    iput-boolean v3, v2, Ldefpackage/ok1;->j:Z

    .line 1122
    .line 1123
    new-instance v3, Ljava/util/ArrayList;

    .line 1124
    .line 1125
    iget-object v4, v2, Ldefpackage/ok1;->e:Ljava/util/ArrayList;

    .line 1126
    .line 1127
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1128
    .line 1129
    .line 1130
    move-result v6

    .line 1131
    iget-object v7, v2, Ldefpackage/ok1;->f:Ljava/util/ArrayList;

    .line 1132
    .line 1133
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1134
    .line 1135
    .line 1136
    move-result v9

    .line 1137
    add-int/2addr v9, v6

    .line 1138
    add-int/lit8 v9, v9, 0x3

    .line 1139
    .line 1140
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1144
    .line 1145
    .line 1146
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1147
    .line 1148
    .line 1149
    new-instance v6, Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1158
    .line 1159
    .line 1160
    iget v6, v2, Ldefpackage/ok1;->g:I

    .line 1161
    .line 1162
    iget v9, v2, Ldefpackage/ok1;->h:I

    .line 1163
    .line 1164
    sget-object v10, Ldefpackage/bk0;->b:Ldefpackage/ak0;

    .line 1165
    .line 1166
    sget-boolean v11, Ldefpackage/gk4;->a:Z

    .line 1167
    .line 1168
    if-eq v6, v15, :cond_13

    .line 1169
    .line 1170
    if-eq v9, v15, :cond_13

    .line 1171
    .line 1172
    invoke-virtual {v10, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v10

    .line 1176
    if-eqz v11, :cond_12

    .line 1177
    .line 1178
    sget-object v14, Ldefpackage/gk4;->c:Ldefpackage/fk4;

    .line 1179
    .line 1180
    invoke-virtual {v14, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v14

    .line 1184
    sget-object v15, Ldefpackage/gk4;->b:Ldefpackage/fk4;

    .line 1185
    .line 1186
    invoke-virtual {v15, v6, v9}, Ldefpackage/bk0;->a(II)Ldefpackage/dz4;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    goto :goto_c

    .line 1191
    :cond_12
    const/4 v6, 0x0

    .line 1192
    const/4 v14, 0x0

    .line 1193
    :goto_c
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    if-eqz v11, :cond_13

    .line 1197
    .line 1198
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    :cond_13
    new-instance v16, Ldefpackage/nk1;

    .line 1205
    .line 1206
    iget-object v6, v2, Ldefpackage/ok1;->a:Ldefpackage/u21;

    .line 1207
    .line 1208
    iget v9, v2, Ldefpackage/ok1;->c:I

    .line 1209
    .line 1210
    new-instance v10, Ljava/util/HashMap;

    .line 1211
    .line 1212
    iget-object v11, v2, Ldefpackage/ok1;->d:Ljava/util/HashMap;

    .line 1213
    .line 1214
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 1215
    .line 1216
    .line 1217
    iget-boolean v11, v2, Ldefpackage/ok1;->i:Z

    .line 1218
    .line 1219
    iget-boolean v14, v2, Ldefpackage/ok1;->j:Z

    .line 1220
    .line 1221
    iget-boolean v15, v2, Ldefpackage/ok1;->k:Z

    .line 1222
    .line 1223
    iget v1, v2, Ldefpackage/ok1;->b:I

    .line 1224
    .line 1225
    move/from16 v23, v1

    .line 1226
    .line 1227
    new-instance v1, Ljava/util/ArrayList;

    .line 1228
    .line 1229
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1230
    .line 1231
    .line 1232
    new-instance v1, Ljava/util/ArrayList;

    .line 1233
    .line 1234
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1235
    .line 1236
    .line 1237
    iget v1, v2, Ldefpackage/ok1;->l:I

    .line 1238
    .line 1239
    iget v4, v2, Ldefpackage/ok1;->m:I

    .line 1240
    .line 1241
    new-instance v7, Ljava/util/ArrayList;

    .line 1242
    .line 1243
    iget-object v2, v2, Ldefpackage/ok1;->n:Ljava/util/LinkedList;

    .line 1244
    .line 1245
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1246
    .line 1247
    .line 1248
    move/from16 v25, v1

    .line 1249
    .line 1250
    move-object/from16 v24, v3

    .line 1251
    .line 1252
    move/from16 v26, v4

    .line 1253
    .line 1254
    move-object/from16 v17, v6

    .line 1255
    .line 1256
    move-object/from16 v27, v7

    .line 1257
    .line 1258
    move/from16 v18, v9

    .line 1259
    .line 1260
    move-object/from16 v19, v10

    .line 1261
    .line 1262
    move/from16 v20, v11

    .line 1263
    .line 1264
    move/from16 v21, v14

    .line 1265
    .line 1266
    move/from16 v22, v15

    .line 1267
    .line 1268
    invoke-direct/range {v16 .. v27}, Ldefpackage/nk1;-><init>(Ldefpackage/u21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 1269
    .line 1270
    .line 1271
    new-instance v1, Lretrofit2/Retrofit$Builder;

    .line 1272
    .line 1273
    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual/range {p1 .. p1}, Ldefpackage/pn4;->j()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    if-eqz v2, :cond_14

    .line 1281
    .line 1282
    invoke-static {v2}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v3

    .line 1290
    goto :goto_d

    .line 1291
    :cond_14
    const/4 v3, 0x0

    .line 1292
    :goto_d
    if-nez v3, :cond_15

    .line 1293
    .line 1294
    goto :goto_e

    .line 1295
    :cond_15
    move-object v13, v3

    .line 1296
    :goto_e
    :try_start_3
    new-instance v2, Ldefpackage/fr1;

    .line 1297
    .line 1298
    invoke-direct {v2}, Ldefpackage/fr1;-><init>()V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1299
    .line 1300
    .line 1301
    const/4 v3, 0x0

    .line 1302
    :try_start_4
    invoke-virtual {v2, v3, v13}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v2}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v14
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1309
    goto :goto_f

    .line 1310
    :catch_3
    const/4 v3, 0x0

    .line 1311
    :catch_4
    move-object v14, v3

    .line 1312
    :goto_f
    if-eqz v14, :cond_16

    .line 1313
    .line 1314
    iget-object v2, v14, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 1315
    .line 1316
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    if-lez v2, :cond_16

    .line 1321
    .line 1322
    move-object v12, v13

    .line 1323
    :cond_16
    invoke-virtual {v1, v12}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    invoke-static/range {v16 .. v16}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Ldefpackage/nk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    new-instance v2, Ldefpackage/cx;

    .line 1336
    .line 1337
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1338
    .line 1339
    .line 1340
    new-instance v3, Ldefpackage/rx;

    .line 1341
    .line 1342
    invoke-direct {v3, v2}, Ldefpackage/rx;-><init>(Ldefpackage/cx;)V

    .line 1343
    .line 1344
    .line 1345
    const v4, 0x278d00

    .line 1346
    .line 1347
    .line 1348
    iput v4, v2, Ldefpackage/cx;->a:I

    .line 1349
    .line 1350
    new-instance v2, Ldefpackage/n83;

    .line 1351
    .line 1352
    invoke-direct {v2}, Ldefpackage/n83;-><init>()V

    .line 1353
    .line 1354
    .line 1355
    const-wide/16 v6, 0x2

    .line 1356
    .line 1357
    invoke-virtual {v2, v6, v7, v8}, Ldefpackage/n83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 1358
    .line 1359
    .line 1360
    const-wide/16 v6, 0x14

    .line 1361
    .line 1362
    invoke-virtual {v2, v6, v7, v5}, Ldefpackage/n83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 1363
    .line 1364
    .line 1365
    const-wide/16 v6, 0x1e

    .line 1366
    .line 1367
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1368
    .line 1369
    .line 1370
    move-result v4

    .line 1371
    iput v4, v2, Ldefpackage/n83;->z:I

    .line 1372
    .line 1373
    invoke-static {v6, v7, v5}, Ldefpackage/ze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 1374
    .line 1375
    .line 1376
    move-result v4

    .line 1377
    iput v4, v2, Ldefpackage/n83;->A:I

    .line 1378
    .line 1379
    new-instance v4, Ldefpackage/dr1;

    .line 1380
    .line 1381
    invoke-direct {v4}, Ldefpackage/dr1;-><init>()V

    .line 1382
    .line 1383
    .line 1384
    sget-object v5, Ldefpackage/cr1;->n:Ldefpackage/cr1;

    .line 1385
    .line 1386
    iput-object v5, v4, Ldefpackage/dr1;->b:Ldefpackage/cr1;

    .line 1387
    .line 1388
    iget-object v5, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1389
    .line 1390
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1391
    .line 1392
    .line 1393
    iget-object v4, v2, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 1394
    .line 1395
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1396
    .line 1397
    .line 1398
    new-instance v3, Ldefpackage/hx;

    .line 1399
    .line 1400
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v4

    .line 1404
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v4

    .line 1408
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    invoke-direct {v3, v4}, Ldefpackage/hx;-><init>(Ljava/io/File;)V

    .line 1412
    .line 1413
    .line 1414
    iput-object v3, v2, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 1415
    .line 1416
    sget-object v3, Ldefpackage/x30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 1417
    .line 1418
    if-eqz v3, :cond_17

    .line 1419
    .line 1420
    sget-object v4, Ldefpackage/x30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 1421
    .line 1422
    invoke-virtual {v2, v3, v4}, Ldefpackage/n83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 1423
    .line 1424
    .line 1425
    :cond_17
    new-instance v3, Ldefpackage/o83;

    .line 1426
    .line 1427
    invoke-direct {v3, v2}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v1

    .line 1438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    const-class v2, Ldefpackage/x02;

    .line 1442
    .line 1443
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    check-cast v1, Ldefpackage/x02;

    .line 1448
    .line 1449
    iput-object v1, v0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1450
    .line 1451
    return-void

    .line 1452
    nop

    .line 1453
    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_2
        0xe -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Ldefpackage/qy4;)V
    .locals 2

    const/16 v0, 0x15

    iput v0, p0, Ldefpackage/xc5;->n:I

    .line 1503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1504
    new-instance p1, Ldefpackage/h00;

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 1505
    invoke-direct {p1, v0, v1}, Ldefpackage/h00;-><init>(I[B)V

    .line 1506
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    return-void
.end method

.method public static l(Ldefpackage/xc5;ZZ)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Landroid/os/PowerManager$WakeLock;

    .line 9
    .line 10
    if-nez v2, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/content/Context;

    .line 15
    .line 16
    const-string v3, "android.permission.WAKE_LOCK"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string p1, "WakeLockManager"

    .line 25
    .line 26
    const-string p2, "WAKE_LOCK permission not granted, can\'t acquire wake lock for playback"

    .line 27
    .line 28
    invoke-static {p1, p2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :try_start_1
    iget-object v2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Landroid/content/Context;

    .line 38
    .line 39
    const-string v3, "power"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/os/PowerManager;

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    const-string p1, "WakeLockManager"

    .line 50
    .line 51
    const-string p2, "PowerManager is null, therefore not creating the WakeLock."

    .line 52
    .line 53
    invoke-static {p1, p2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :cond_1
    :try_start_2
    const-string v3, "ExoPlayer:WakeLockManager"

    .line 59
    .line 60
    invoke-virtual {v2, v1, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroid/os/PowerManager$WakeLock;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    monitor-exit p0

    .line 76
    return-void

    .line 77
    :cond_3
    if-eqz p1, :cond_4

    .line 78
    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    move v0, v1

    .line 82
    :cond_4
    if-eqz v0, :cond_5

    .line 83
    .line 84
    :try_start_3
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    .line 90
    .line 91
    :goto_0
    monitor-exit p0

    .line 92
    return-void

    .line 93
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    throw p1
.end method

.method public static r(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public a(Ldefpackage/be3;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/qy4;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/qy4;->h:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/h00;

    .line 10
    .line 11
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    and-int/lit16 v2, v2, 0x80

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    const/4 v2, 0x6

    .line 28
    invoke-virtual {p1, v2}, Ldefpackage/be3;->O(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ldefpackage/be3;->a()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x4

    .line 36
    div-int/2addr v2, v3

    .line 37
    const/4 v4, 0x0

    .line 38
    move v5, v4

    .line 39
    :goto_0
    if-ge v5, v2, :cond_4

    .line 40
    .line 41
    iget-object v6, p0, Ldefpackage/h00;->b:[B

    .line 42
    .line 43
    invoke-virtual {p1, v6, v4, v3}, Ldefpackage/be3;->k([BII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v4}, Ldefpackage/h00;->q(I)V

    .line 47
    .line 48
    .line 49
    const/16 v6, 0x10

    .line 50
    .line 51
    invoke-virtual {p0, v6}, Ldefpackage/h00;->i(I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v7, 0x3

    .line 56
    invoke-virtual {p0, v7}, Ldefpackage/h00;->t(I)V

    .line 57
    .line 58
    .line 59
    const/16 v7, 0xd

    .line 60
    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0, v7}, Ldefpackage/h00;->t(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0, v7}, Ldefpackage/h00;->i(I)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    new-instance v7, Ldefpackage/h84;

    .line 78
    .line 79
    new-instance v8, Ldefpackage/ew4;

    .line 80
    .line 81
    invoke-direct {v8, v0, v6}, Ldefpackage/ew4;-><init>(Ldefpackage/qy4;I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, v8}, Ldefpackage/h84;-><init>(Ldefpackage/g84;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget v6, v0, Ldefpackage/qy4;->n:I

    .line 91
    .line 92
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    iput v6, v0, Ldefpackage/qy4;->n:I

    .line 95
    .line 96
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget p0, v0, Ldefpackage/qy4;->a:I

    .line 100
    .line 101
    const/4 p1, 0x2

    .line 102
    if-eq p0, p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_2
    return-void
.end method

.method public apply()Ldefpackage/jn4;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/o72;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ldefpackage/o72;->f(Ljava/lang/Object;)Ldefpackage/jn4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public b(Ldefpackage/iu4;Ldefpackage/m51;Ldefpackage/sy4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ldefpackage/l51;J)Ldefpackage/os;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ldefpackage/l51;->getPosition()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    invoke-interface/range {p1 .. p1}, Ldefpackage/l51;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, v4

    .line 12
    const-wide/16 v6, 0x4e20

    .line 13
    .line 14
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    long-to-int v1, v1

    .line 19
    iget-object v2, v0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ldefpackage/be3;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ldefpackage/be3;->K(I)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v2, Ldefpackage/be3;->a:[B

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move-object/from16 v7, p1

    .line 30
    .line 31
    invoke-interface {v7, v3, v6, v1}, Ldefpackage/l51;->n([BII)V

    .line 32
    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move v3, v1

    .line 41
    move-wide v10, v6

    .line 42
    :goto_0
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const/4 v9, 0x4

    .line 47
    if-lt v8, v9, :cond_d

    .line 48
    .line 49
    iget-object v8, v2, Ldefpackage/be3;->a:[B

    .line 50
    .line 51
    iget v12, v2, Ldefpackage/be3;->b:I

    .line 52
    .line 53
    invoke-static {v12, v8}, Ldefpackage/r71;->a(I[B)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const/4 v12, 0x1

    .line 58
    const/16 v13, 0x1ba

    .line 59
    .line 60
    if-eq v8, v13, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2, v12}, Ldefpackage/be3;->O(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v2, v9}, Ldefpackage/be3;->O(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Ldefpackage/sr3;->c(Ldefpackage/be3;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v14

    .line 73
    cmp-long v1, v14, v6

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-object v1, v0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Ldefpackage/iu4;

    .line 80
    .line 81
    invoke-virtual {v1, v14, v15}, Ldefpackage/iu4;->b(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    cmp-long v1, v14, p2

    .line 86
    .line 87
    if-lez v1, :cond_2

    .line 88
    .line 89
    cmp-long v0, v10, v6

    .line 90
    .line 91
    if-nez v0, :cond_1

    .line 92
    .line 93
    new-instance v0, Ldefpackage/os;

    .line 94
    .line 95
    const/4 v1, -0x1

    .line 96
    move-wide v2, v14

    .line 97
    invoke-direct/range {v0 .. v5}, Ldefpackage/os;-><init>(IJJ)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_1
    int-to-long v0, v3

    .line 102
    add-long v10, v4, v0

    .line 103
    .line 104
    new-instance v6, Ldefpackage/os;

    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-direct/range {v6 .. v11}, Ldefpackage/os;-><init>(IJJ)V

    .line 113
    .line 114
    .line 115
    return-object v6

    .line 116
    :cond_2
    move-wide v10, v14

    .line 117
    const-wide/32 v14, 0x186a0

    .line 118
    .line 119
    .line 120
    add-long/2addr v14, v10

    .line 121
    cmp-long v1, v14, p2

    .line 122
    .line 123
    iget v3, v2, Ldefpackage/be3;->b:I

    .line 124
    .line 125
    if-lez v1, :cond_3

    .line 126
    .line 127
    int-to-long v0, v3

    .line 128
    add-long v10, v4, v0

    .line 129
    .line 130
    new-instance v6, Ldefpackage/os;

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-direct/range {v6 .. v11}, Ldefpackage/os;-><init>(IJJ)V

    .line 139
    .line 140
    .line 141
    return-object v6

    .line 142
    :cond_3
    iget v1, v2, Ldefpackage/be3;->c:I

    .line 143
    .line 144
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    const/16 v14, 0xa

    .line 149
    .line 150
    if-ge v8, v14, :cond_4

    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :cond_4
    const/16 v8, 0x9

    .line 158
    .line 159
    invoke-virtual {v2, v8}, Ldefpackage/be3;->O(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    and-int/lit8 v8, v8, 0x7

    .line 167
    .line 168
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    if-ge v14, v8, :cond_5

    .line 173
    .line 174
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {v2, v8}, Ldefpackage/be3;->O(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-ge v8, v9, :cond_6

    .line 186
    .line 187
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    iget-object v8, v2, Ldefpackage/be3;->a:[B

    .line 192
    .line 193
    iget v14, v2, Ldefpackage/be3;->b:I

    .line 194
    .line 195
    invoke-static {v14, v8}, Ldefpackage/r71;->a(I[B)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    const/16 v14, 0x1bb

    .line 200
    .line 201
    if-ne v8, v14, :cond_8

    .line 202
    .line 203
    invoke-virtual {v2, v9}, Ldefpackage/be3;->O(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-ge v14, v8, :cond_7

    .line 215
    .line 216
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_7
    invoke-virtual {v2, v8}, Ldefpackage/be3;->O(I)V

    .line 221
    .line 222
    .line 223
    :cond_8
    :goto_1
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-lt v8, v9, :cond_c

    .line 228
    .line 229
    iget-object v8, v2, Ldefpackage/be3;->a:[B

    .line 230
    .line 231
    iget v14, v2, Ldefpackage/be3;->b:I

    .line 232
    .line 233
    invoke-static {v14, v8}, Ldefpackage/r71;->a(I[B)I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eq v8, v13, :cond_c

    .line 238
    .line 239
    const/16 v14, 0x1b9

    .line 240
    .line 241
    if-ne v8, v14, :cond_9

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_9
    ushr-int/lit8 v8, v8, 0x8

    .line 245
    .line 246
    if-eq v8, v12, :cond_a

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_a
    invoke-virtual {v2, v9}, Ldefpackage/be3;->O(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    const/4 v14, 0x2

    .line 257
    if-ge v8, v14, :cond_b

    .line 258
    .line 259
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_b
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    iget v14, v2, Ldefpackage/be3;->c:I

    .line 268
    .line 269
    iget v15, v2, Ldefpackage/be3;->b:I

    .line 270
    .line 271
    add-int/2addr v15, v8

    .line 272
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    invoke-virtual {v2, v8}, Ldefpackage/be3;->N(I)V

    .line 277
    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_c
    :goto_2
    iget v1, v2, Ldefpackage/be3;->b:I

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_d
    cmp-long v0, v10, v6

    .line 285
    .line 286
    if-eqz v0, :cond_e

    .line 287
    .line 288
    int-to-long v0, v1

    .line 289
    add-long v12, v4, v0

    .line 290
    .line 291
    new-instance v8, Ldefpackage/os;

    .line 292
    .line 293
    const/4 v9, -0x2

    .line 294
    invoke-direct/range {v8 .. v13}, Ldefpackage/os;-><init>(IJJ)V

    .line 295
    .line 296
    .line 297
    return-object v8

    .line 298
    :cond_e
    sget-object v0, Ldefpackage/os;->e:Ldefpackage/os;

    .line 299
    .line 300
    return-object v0
.end method

.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public e(Ldefpackage/bt2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/if1;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public g(Landroid/net/Uri;)Ldefpackage/ic2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/r20;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/r20;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ldefpackage/r20;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ldefpackage/ic2;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ldefpackage/xs;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ldefpackage/xs;->g(Landroid/net/Uri;)Ldefpackage/ic2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ldefpackage/r20;

    .line 40
    .line 41
    invoke-direct {v1, p1, v0}, Ldefpackage/r20;-><init>(Landroid/net/Uri;Ldefpackage/ic2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 45
    .line 46
    return-object v0
.end method

.method public h(Ldefpackage/t44;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/wf1;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public i(Ldefpackage/do2;)Ldefpackage/ic2;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/r20;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/r20;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p1, Ldefpackage/do2;->m:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, v0, Ldefpackage/r20;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, [B

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v1, p1, Ldefpackage/do2;->k:[B

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    :cond_1
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/r20;

    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ldefpackage/ic2;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ldefpackage/xs;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Ldefpackage/xs;->i(Ldefpackage/do2;)Ldefpackage/ic2;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_3
    new-instance v1, Ldefpackage/r20;

    .line 60
    .line 61
    invoke-direct {v1, p1, v0}, Ldefpackage/r20;-><init>(Ldefpackage/do2;Ldefpackage/ic2;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 65
    .line 66
    return-object v0
.end method

.method public j([B)Ldefpackage/ic2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/r20;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/r20;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, [B

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ldefpackage/r20;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ldefpackage/ic2;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ldefpackage/xs;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ldefpackage/xs;->j([B)Ldefpackage/ic2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ldefpackage/r20;

    .line 40
    .line 41
    invoke-direct {v1, p1, v0}, Ldefpackage/r20;-><init>([BLdefpackage/ic2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 45
    .line 46
    return-object v0
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/be3;

    .line 4
    .line 5
    sget-object v0, Ldefpackage/f35;->b:[B

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    invoke-virtual {p0, v1, v0}, Ldefpackage/be3;->L(I[B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public m(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public o(Ldefpackage/bj0;)V
    .locals 3

    .line 1
    monitor-enter p1

    .line 2
    monitor-exit p1

    .line 3
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Ldefpackage/km;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/km;-><init>(Ldefpackage/xc5;Ldefpackage/bj0;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Ldefpackage/xc5;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/hq1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/hq1;->l()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ldefpackage/l61;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lcom/eddyizm/tempus/interfaces/StarCallback;

    .line 21
    .line 22
    invoke-static {p1, p0}, Ldefpackage/d34;->r(Ldefpackage/l61;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 11

    .line 1
    iget p1, p0, Ldefpackage/xc5;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ldefpackage/hq1;

    .line 9
    .line 10
    invoke-static {p2}, Ldefpackage/mm3;->f(Lretrofit2/Response;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/mm3;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/mm3;->g()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p2}, Ldefpackage/mm3;->f(Lretrofit2/Response;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_8

    .line 28
    .line 29
    iget-object p0, p1, Ldefpackage/hq1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    iget-object p2, p1, Ldefpackage/hq1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Ldefpackage/im3;

    .line 36
    .line 37
    iget-object v0, p2, Ldefpackage/im3;->j:Ldefpackage/k03;

    .line 38
    .line 39
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    iget-object v2, p1, Ldefpackage/hq1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    if-eq v1, v2, :cond_6

    .line 52
    .line 53
    iget-object v2, p2, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 54
    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    iget-object v2, p1, Ldefpackage/hq1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Ljava/util/List;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eq v6, v7, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move v6, v3

    .line 87
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-ge v6, v7, :cond_4

    .line 92
    .line 93
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 98
    .line 99
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 108
    .line 109
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-nez v7, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    iput-object v4, p2, Ldefpackage/im3;->f:Ljava/lang/String;

    .line 124
    .line 125
    iget p0, p2, Ldefpackage/im3;->h:I

    .line 126
    .line 127
    add-int/2addr p0, v5

    .line 128
    iput p0, p2, Ldefpackage/im3;->h:I

    .line 129
    .line 130
    iput p0, p2, Ldefpackage/im3;->i:I

    .line 131
    .line 132
    new-instance p0, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    .line 136
    .line 137
    iget p2, p1, Ldefpackage/hq1;->a:I

    .line 138
    .line 139
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    :goto_1
    invoke-static {p2, p0, v5}, Ldefpackage/im3;->c(Ldefpackage/im3;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    :goto_2
    iput-object v4, p2, Ldefpackage/im3;->f:Ljava/lang/String;

    .line 151
    .line 152
    :goto_3
    iget-object p0, p1, Ldefpackage/hq1;->e:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v5, p0

    .line 155
    check-cast v5, Ldefpackage/ew4;

    .line 156
    .line 157
    iget-object p0, v5, Ldefpackage/ew4;->p:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v10, p0

    .line 160
    check-cast v10, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 161
    .line 162
    iget-object p0, v10, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Ldefpackage/qp4;

    .line 163
    .line 164
    if-nez p0, :cond_7

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Landroid/widget/FrameLayout;

    .line 170
    .line 171
    sget-object p1, Ldefpackage/qg4;->E:[I

    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const p2, 0x7f1303ea

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p0, p1, v3}, Ldefpackage/qg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {v10}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p1}, Ldefpackage/fr;->e(Landroid/widget/FrameLayout;)V

    .line 193
    .line 194
    .line 195
    iget-object p1, v5, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v6, p1

    .line 198
    check-cast v6, Ldefpackage/im3;

    .line 199
    .line 200
    iget-object p1, v5, Ldefpackage/ew4;->r:Ljava/lang/Object;

    .line 201
    .line 202
    move-object v7, p1

    .line 203
    check-cast v7, Ljava/lang/String;

    .line 204
    .line 205
    iget-object p1, v5, Ldefpackage/ew4;->s:Ljava/lang/Object;

    .line 206
    .line 207
    move-object v8, p1

    .line 208
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 209
    .line 210
    iget v9, v5, Ldefpackage/ew4;->o:I

    .line 211
    .line 212
    new-instance v4, Ldefpackage/gi4;

    .line 213
    .line 214
    invoke-direct/range {v4 .. v10}, Ldefpackage/gi4;-><init>(Ldefpackage/ew4;Ldefpackage/im3;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;ILcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 215
    .line 216
    .line 217
    const p1, 0x7f130544

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1, v4}, Ldefpackage/qg4;->i(ILandroid/view/View$OnClickListener;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Ldefpackage/qg4;->j()V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    invoke-virtual {p1}, Ldefpackage/hq1;->l()V

    .line 228
    .line 229
    .line 230
    :goto_4
    return-void

    .line 231
    :pswitch_0
    iget-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p1, Ldefpackage/l61;

    .line 234
    .line 235
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Lcom/eddyizm/tempus/interfaces/StarCallback;

    .line 238
    .line 239
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    invoke-static {p2}, Ldefpackage/d34;->w(Lretrofit2/Response;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_9

    .line 250
    .line 251
    invoke-static {p1}, Ldefpackage/n61;->a(Ldefpackage/l61;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {p0}, Lcom/eddyizm/tempus/interfaces/StarCallback;->onSuccess()V

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_9
    invoke-static {p2}, Ldefpackage/d34;->w(Lretrofit2/Response;)Z

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    if-eqz p2, :cond_a

    .line 263
    .line 264
    invoke-static {p1}, Ldefpackage/n61;->j(Ldefpackage/l61;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {p0}, Lcom/eddyizm/tempus/interfaces/StarCallback;->onRefused()V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_a
    invoke-static {p1, p0}, Ldefpackage/d34;->r(Ldefpackage/l61;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 272
    .line 273
    .line 274
    :goto_5
    return-void

    .line 275
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public p(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    new-array p1, p1, [I

    .line 17
    .line 18
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    array-length v2, v0

    .line 25
    if-lt p1, v2, :cond_2

    .line 26
    .line 27
    array-length v2, v0

    .line 28
    :goto_0
    if-gt v2, p1, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-array p1, v2, [I

    .line 34
    .line 35
    iput-object p1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 36
    .line 37
    array-length v2, v0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, [I

    .line 45
    .line 46
    array-length p1, v0

    .line 47
    array-length v0, p0

    .line 48
    invoke-static {p0, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public q(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)Lretrofit2/Call;
    .locals 9

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getAlbumList2()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Ldefpackage/w8;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ldefpackage/pn4;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    move-object v3, p1

    .line 26
    move v4, p2

    .line 27
    move v5, p3

    .line 28
    move-object v6, p4

    .line 29
    move-object v7, p5

    .line 30
    invoke-interface/range {v1 .. v8}, Ldefpackage/w8;->b(Ljava/util/Map;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public s()Lretrofit2/Call;
    .locals 2

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "getStarred2()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/w8;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/pn4;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0}, Ldefpackage/w8;->d(Ljava/util/Map;)Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public t()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public u(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/xc5;->p(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/lit8 v0, v0, -0x1

    .line 46
    .line 47
    :goto_0
    if-ltz v0, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ldefpackage/pk4;

    .line 58
    .line 59
    iget v2, v1, Ldefpackage/pk4;->n:I

    .line 60
    .line 61
    if-ge v2, p1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    add-int/2addr v2, p2

    .line 65
    iput v2, v1, Ldefpackage/pk4;->n:I

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_2
    return-void
.end method

.method public v(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/xc5;->p(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    array-length v2, v1

    .line 31
    sub-int/2addr v2, p2

    .line 32
    array-length v3, v1

    .line 33
    const/4 v4, -0x1

    .line 34
    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :goto_0
    if-ltz v1, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ldefpackage/pk4;

    .line 61
    .line 62
    iget v3, v2, Ldefpackage/pk4;->n:I

    .line 63
    .line 64
    if-ge v3, p1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    if-ge v3, v0, :cond_3

    .line 68
    .line 69
    iget-object v2, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sub-int/2addr v3, p2

    .line 78
    iput v3, v2, Ldefpackage/pk4;->n:I

    .line 79
    .line 80
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_2
    return-void
.end method

.method public w(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput p1, v0, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object p3, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroid/os/Messenger;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public x(ZLcom/google/android/gms/common/api/Status;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v2, p0, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    iget-object v0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, Ljava/util/Map;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/Map$Entry;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 71
    .line 72
    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/util/Map$Entry;

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ldefpackage/cr4;

    .line 115
    .line 116
    new-instance v1, Lcom/google/android/gms/common/api/ApiException;

    .line 117
    .line 118
    invoke-direct {v1, p2}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ldefpackage/cr4;->c(Ljava/lang/Exception;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    return-void

    .line 126
    :catchall_0
    move-exception p0

    .line 127
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    throw p0

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 131
    throw p0
.end method
