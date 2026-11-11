.class public abstract Lld1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:Ly41;

.field public B:Lw5;

.field public C:Lw5;

.field public D:Lw5;

.field public E:Ljava/util/ArrayDeque;

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Ljava/util/ArrayList;

.field public L:Ljava/util/ArrayList;

.field public M:Ljava/util/ArrayList;

.field public N:Lod1;

.field public final O:Lg5;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lss0;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lwc1;

.field public g:La93;

.field public final h:Lbd1;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Ljava/util/Map;

.field public m:Ljava/util/ArrayList;

.field public final n:Lwo0;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final p:Lad1;

.field public final q:Lad1;

.field public final r:Lad1;

.field public final s:Lad1;

.field public final t:Lcd1;

.field public u:I

.field public v:Lmc1;

.field public w:Lfu;

.field public x:Lkc1;

.field public y:Lkc1;

.field public final z:Ldd1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lss0;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1}, Lss0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lld1;->c:Lss0;

    .line 18
    .line 19
    new-instance v0, Lwc1;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lwc1;-><init>(Lld1;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lld1;->f:Lwc1;

    .line 25
    .line 26
    new-instance v0, Lbd1;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1, p0}, Lbd1;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lld1;->h:Lbd1;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lld1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lld1;->j:Ljava/util/Map;

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lld1;->k:Ljava/util/Map;

    .line 62
    .line 63
    new-instance v0, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lld1;->l:Ljava/util/Map;

    .line 73
    .line 74
    new-instance v0, Lwo0;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, v0, Lwo0;->n:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object p0, v0, Lwo0;->o:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v0, p0, Lld1;->n:Lwo0;

    .line 89
    .line 90
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lld1;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 96
    .line 97
    new-instance v0, Lad1;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-direct {v0, p0, v1}, Lad1;-><init>(Lld1;I)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lld1;->p:Lad1;

    .line 104
    .line 105
    new-instance v0, Lad1;

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    invoke-direct {v0, p0, v1}, Lad1;-><init>(Lld1;I)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lld1;->q:Lad1;

    .line 112
    .line 113
    new-instance v0, Lad1;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-direct {v0, p0, v1}, Lad1;-><init>(Lld1;I)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lld1;->r:Lad1;

    .line 120
    .line 121
    new-instance v0, Lad1;

    .line 122
    .line 123
    const/4 v1, 0x3

    .line 124
    invoke-direct {v0, p0, v1}, Lad1;-><init>(Lld1;I)V

    .line 125
    .line 126
    .line 127
    iput-object v0, p0, Lld1;->s:Lad1;

    .line 128
    .line 129
    new-instance v0, Lcd1;

    .line 130
    .line 131
    invoke-direct {v0, p0}, Lcd1;-><init>(Lld1;)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Lld1;->t:Lcd1;

    .line 135
    .line 136
    const/4 v0, -0x1

    .line 137
    iput v0, p0, Lld1;->u:I

    .line 138
    .line 139
    new-instance v0, Ldd1;

    .line 140
    .line 141
    invoke-direct {v0, p0}, Ldd1;-><init>(Lld1;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lld1;->z:Ldd1;

    .line 145
    .line 146
    new-instance v0, Ly41;

    .line 147
    .line 148
    const/16 v1, 0xe

    .line 149
    .line 150
    invoke-direct {v0, v1}, Ly41;-><init>(I)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, Lld1;->A:Ly41;

    .line 154
    .line 155
    new-instance v0, Ljava/util/ArrayDeque;

    .line 156
    .line 157
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, Lld1;->E:Ljava/util/ArrayDeque;

    .line 161
    .line 162
    new-instance v0, Lg5;

    .line 163
    .line 164
    const/16 v1, 0xd

    .line 165
    .line 166
    invoke-direct {v0, v1, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iput-object v0, p0, Lld1;->O:Lg5;

    .line 170
    .line 171
    return-void
.end method

.method public static I(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static J(Lkc1;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lkc1;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lkc1;->Q:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lkc1;->H:Lmd1;

    .line 10
    .line 11
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 12
    .line 13
    invoke-virtual {p0}, Lss0;->w()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    move v3, v2

    .line 24
    :cond_1
    if-ge v3, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    check-cast v4, Lkc1;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    invoke-static {v4}, Lld1;->J(Lkc1;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :cond_2
    if-eqz v2, :cond_1

    .line 41
    .line 42
    :cond_3
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_4
    return v1
.end method

.method public static L(Lkc1;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lkc1;->Q:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lkc1;->F:Lld1;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lkc1;->I:Lkc1;

    .line 13
    .line 14
    invoke-static {p0}, Lld1;->L(Lkc1;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static M(Lkc1;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lkc1;->F:Lld1;

    .line 5
    .line 6
    iget-object v1, v0, Lld1;->y:Lkc1;

    .line 7
    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    iget-object p0, v0, Lld1;->x:Lkc1;

    .line 12
    .line 13
    invoke-static {p0}, Lld1;->M(Lkc1;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static e0(Lkc1;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lld1;->I(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Lkc1;->M:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lkc1;->M:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Lkc1;->X:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Lkc1;->X:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 29

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
    move/from16 v3, p4

    .line 8
    .line 9
    const-string v4, " associated with entry "

    .line 10
    .line 11
    const-string v5, "FragmentNavigator"

    .line 12
    .line 13
    iget-object v6, v0, Lld1;->c:Lss0;

    .line 14
    .line 15
    move/from16 v7, p3

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    check-cast v8, Lpo;

    .line 22
    .line 23
    iget-boolean v8, v8, Lpo;->p:Z

    .line 24
    .line 25
    iget-object v9, v0, Lld1;->M:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-nez v9, :cond_0

    .line 28
    .line 29
    new-instance v9, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v9, v0, Lld1;->M:Ljava/util/ArrayList;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v9, v0, Lld1;->M:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v6}, Lss0;->x()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    iget-object v9, v0, Lld1;->y:Lkc1;

    .line 50
    .line 51
    move v11, v7

    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v11, v3, :cond_13

    .line 54
    .line 55
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v16

    .line 59
    move-object/from16 v13, v16

    .line 60
    .line 61
    check-cast v13, Lpo;

    .line 62
    .line 63
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    check-cast v16, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v16

    .line 73
    iget-object v14, v0, Lld1;->M:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-nez v16, :cond_d

    .line 76
    .line 77
    iget-object v15, v13, Lpo;->a:Ljava/util/ArrayList;

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    :goto_2
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-ge v10, v7, :cond_c

    .line 85
    .line 86
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Lje1;

    .line 91
    .line 92
    move/from16 v18, v8

    .line 93
    .line 94
    iget v8, v7, Lje1;->a:I

    .line 95
    .line 96
    move/from16 v19, v11

    .line 97
    .line 98
    const/4 v11, 0x1

    .line 99
    if-eq v8, v11, :cond_b

    .line 100
    .line 101
    const/4 v11, 0x2

    .line 102
    if-eq v8, v11, :cond_5

    .line 103
    .line 104
    const/4 v11, 0x3

    .line 105
    if-eq v8, v11, :cond_3

    .line 106
    .line 107
    const/4 v11, 0x6

    .line 108
    if-eq v8, v11, :cond_3

    .line 109
    .line 110
    const/4 v11, 0x7

    .line 111
    if-eq v8, v11, :cond_2

    .line 112
    .line 113
    const/16 v11, 0x8

    .line 114
    .line 115
    if-eq v8, v11, :cond_1

    .line 116
    .line 117
    move-object/from16 v23, v5

    .line 118
    .line 119
    move/from16 v21, v12

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_1
    new-instance v8, Lje1;

    .line 123
    .line 124
    move/from16 v21, v12

    .line 125
    .line 126
    const/4 v11, 0x0

    .line 127
    const/16 v12, 0x9

    .line 128
    .line 129
    invoke-direct {v8, v12, v9, v11}, Lje1;-><init>(ILkc1;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v15, v10, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    const/4 v11, 0x1

    .line 136
    iput-boolean v11, v7, Lje1;->c:Z

    .line 137
    .line 138
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    iget-object v7, v7, Lje1;->b:Lkc1;

    .line 141
    .line 142
    move-object/from16 v23, v5

    .line 143
    .line 144
    move-object v9, v7

    .line 145
    :goto_3
    const/4 v11, 0x1

    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_2
    const/4 v11, 0x1

    .line 149
    move/from16 v21, v12

    .line 150
    .line 151
    move-object/from16 v23, v5

    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_3
    move/from16 v21, v12

    .line 156
    .line 157
    iget-object v8, v7, Lje1;->b:Lkc1;

    .line 158
    .line 159
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    iget-object v7, v7, Lje1;->b:Lkc1;

    .line 163
    .line 164
    if-ne v7, v9, :cond_4

    .line 165
    .line 166
    new-instance v8, Lje1;

    .line 167
    .line 168
    const/16 v12, 0x9

    .line 169
    .line 170
    invoke-direct {v8, v12, v7}, Lje1;-><init>(ILkc1;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v15, v10, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    add-int/lit8 v10, v10, 0x1

    .line 177
    .line 178
    move-object/from16 v23, v5

    .line 179
    .line 180
    const/4 v9, 0x0

    .line 181
    goto :goto_3

    .line 182
    :cond_4
    move-object/from16 v23, v5

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    move/from16 v21, v12

    .line 186
    .line 187
    iget-object v8, v7, Lje1;->b:Lkc1;

    .line 188
    .line 189
    iget v11, v8, Lkc1;->K:I

    .line 190
    .line 191
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    const/16 v17, 0x1

    .line 196
    .line 197
    add-int/lit8 v12, v12, -0x1

    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    :goto_4
    if-ltz v12, :cond_9

    .line 202
    .line 203
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v23

    .line 207
    move/from16 v24, v12

    .line 208
    .line 209
    move-object/from16 v12, v23

    .line 210
    .line 211
    check-cast v12, Lkc1;

    .line 212
    .line 213
    move-object/from16 v23, v5

    .line 214
    .line 215
    iget v5, v12, Lkc1;->K:I

    .line 216
    .line 217
    if-ne v5, v11, :cond_8

    .line 218
    .line 219
    if-ne v12, v8, :cond_6

    .line 220
    .line 221
    move/from16 v20, v11

    .line 222
    .line 223
    const/4 v11, 0x1

    .line 224
    const/16 v22, 0x1

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_6
    if-ne v12, v9, :cond_7

    .line 228
    .line 229
    new-instance v5, Lje1;

    .line 230
    .line 231
    move/from16 v20, v11

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/16 v11, 0x9

    .line 235
    .line 236
    invoke-direct {v5, v11, v12, v9}, Lje1;-><init>(ILkc1;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v15, v10, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    add-int/lit8 v10, v10, 0x1

    .line 243
    .line 244
    move v5, v9

    .line 245
    const/4 v9, 0x0

    .line 246
    goto :goto_5

    .line 247
    :cond_7
    move/from16 v20, v11

    .line 248
    .line 249
    const/4 v5, 0x0

    .line 250
    const/16 v11, 0x9

    .line 251
    .line 252
    :goto_5
    new-instance v11, Lje1;

    .line 253
    .line 254
    move-object/from16 v26, v9

    .line 255
    .line 256
    const/4 v9, 0x3

    .line 257
    invoke-direct {v11, v9, v12, v5}, Lje1;-><init>(ILkc1;I)V

    .line 258
    .line 259
    .line 260
    iget v5, v7, Lje1;->d:I

    .line 261
    .line 262
    iput v5, v11, Lje1;->d:I

    .line 263
    .line 264
    iget v5, v7, Lje1;->f:I

    .line 265
    .line 266
    iput v5, v11, Lje1;->f:I

    .line 267
    .line 268
    iget v5, v7, Lje1;->e:I

    .line 269
    .line 270
    iput v5, v11, Lje1;->e:I

    .line 271
    .line 272
    iget v5, v7, Lje1;->g:I

    .line 273
    .line 274
    iput v5, v11, Lje1;->g:I

    .line 275
    .line 276
    invoke-virtual {v15, v10, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    const/4 v11, 0x1

    .line 283
    add-int/2addr v10, v11

    .line 284
    move-object/from16 v9, v26

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_8
    move/from16 v20, v11

    .line 288
    .line 289
    const/4 v11, 0x1

    .line 290
    :goto_6
    add-int/lit8 v12, v24, -0x1

    .line 291
    .line 292
    move/from16 v11, v20

    .line 293
    .line 294
    move-object/from16 v5, v23

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    move-object/from16 v23, v5

    .line 298
    .line 299
    const/4 v11, 0x1

    .line 300
    if-eqz v22, :cond_a

    .line 301
    .line 302
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    add-int/lit8 v10, v10, -0x1

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_a
    iput v11, v7, Lje1;->a:I

    .line 309
    .line 310
    iput-boolean v11, v7, Lje1;->c:Z

    .line 311
    .line 312
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_b
    move-object/from16 v23, v5

    .line 317
    .line 318
    move/from16 v21, v12

    .line 319
    .line 320
    :goto_7
    iget-object v5, v7, Lje1;->b:Lkc1;

    .line 321
    .line 322
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    :goto_8
    add-int/2addr v10, v11

    .line 326
    move/from16 v8, v18

    .line 327
    .line 328
    move/from16 v11, v19

    .line 329
    .line 330
    move/from16 v12, v21

    .line 331
    .line 332
    move-object/from16 v5, v23

    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_c
    move-object/from16 v23, v5

    .line 337
    .line 338
    move/from16 v18, v8

    .line 339
    .line 340
    move/from16 v19, v11

    .line 341
    .line 342
    move/from16 v21, v12

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_d
    move-object/from16 v23, v5

    .line 346
    .line 347
    move/from16 v18, v8

    .line 348
    .line 349
    move/from16 v19, v11

    .line 350
    .line 351
    move/from16 v21, v12

    .line 352
    .line 353
    const/4 v11, 0x1

    .line 354
    iget-object v5, v13, Lpo;->a:Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    sub-int/2addr v7, v11

    .line 361
    :goto_9
    if-ltz v7, :cond_10

    .line 362
    .line 363
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    check-cast v8, Lje1;

    .line 368
    .line 369
    iget v10, v8, Lje1;->a:I

    .line 370
    .line 371
    if-eq v10, v11, :cond_f

    .line 372
    .line 373
    const/4 v11, 0x3

    .line 374
    if-eq v10, v11, :cond_e

    .line 375
    .line 376
    packed-switch v10, :pswitch_data_0

    .line 377
    .line 378
    .line 379
    goto :goto_a

    .line 380
    :pswitch_0
    iget-object v10, v8, Lje1;->h:Lr92;

    .line 381
    .line 382
    iput-object v10, v8, Lje1;->i:Lr92;

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :pswitch_1
    iget-object v8, v8, Lje1;->b:Lkc1;

    .line 386
    .line 387
    move-object v9, v8

    .line 388
    goto :goto_a

    .line 389
    :pswitch_2
    const/4 v9, 0x0

    .line 390
    goto :goto_a

    .line 391
    :cond_e
    :pswitch_3
    iget-object v8, v8, Lje1;->b:Lkc1;

    .line 392
    .line 393
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_a

    .line 397
    :cond_f
    const/4 v11, 0x3

    .line 398
    :pswitch_4
    iget-object v8, v8, Lje1;->b:Lkc1;

    .line 399
    .line 400
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    :goto_a
    add-int/lit8 v7, v7, -0x1

    .line 404
    .line 405
    const/4 v11, 0x1

    .line 406
    goto :goto_9

    .line 407
    :cond_10
    :goto_b
    if-nez v21, :cond_12

    .line 408
    .line 409
    iget-boolean v5, v13, Lpo;->g:Z

    .line 410
    .line 411
    if-eqz v5, :cond_11

    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_11
    const/4 v12, 0x0

    .line 415
    goto :goto_d

    .line 416
    :cond_12
    :goto_c
    const/4 v12, 0x1

    .line 417
    :goto_d
    add-int/lit8 v11, v19, 0x1

    .line 418
    .line 419
    move/from16 v7, p3

    .line 420
    .line 421
    move/from16 v8, v18

    .line 422
    .line 423
    move-object/from16 v5, v23

    .line 424
    .line 425
    goto/16 :goto_1

    .line 426
    .line 427
    :cond_13
    move-object/from16 v23, v5

    .line 428
    .line 429
    move/from16 v18, v8

    .line 430
    .line 431
    move/from16 v21, v12

    .line 432
    .line 433
    const/4 v11, 0x3

    .line 434
    iget-object v5, v0, Lld1;->M:Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 437
    .line 438
    .line 439
    if-nez v18, :cond_16

    .line 440
    .line 441
    iget v5, v0, Lld1;->u:I

    .line 442
    .line 443
    const/4 v7, 0x1

    .line 444
    if-lt v5, v7, :cond_16

    .line 445
    .line 446
    move/from16 v5, p3

    .line 447
    .line 448
    :goto_e
    if-ge v5, v3, :cond_16

    .line 449
    .line 450
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    check-cast v7, Lpo;

    .line 455
    .line 456
    iget-object v7, v7, Lpo;->a:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    const/4 v9, 0x0

    .line 463
    :cond_14
    :goto_f
    if-ge v9, v8, :cond_15

    .line 464
    .line 465
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    add-int/lit8 v9, v9, 0x1

    .line 470
    .line 471
    check-cast v10, Lje1;

    .line 472
    .line 473
    iget-object v10, v10, Lje1;->b:Lkc1;

    .line 474
    .line 475
    if-eqz v10, :cond_14

    .line 476
    .line 477
    iget-object v12, v10, Lkc1;->F:Lld1;

    .line 478
    .line 479
    if-eqz v12, :cond_14

    .line 480
    .line 481
    invoke-virtual {v0, v10}, Lld1;->f(Lkc1;)Lfe1;

    .line 482
    .line 483
    .line 484
    move-result-object v10

    .line 485
    invoke-virtual {v6, v10}, Lss0;->E(Lfe1;)V

    .line 486
    .line 487
    .line 488
    goto :goto_f

    .line 489
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 490
    .line 491
    goto :goto_e

    .line 492
    :cond_16
    const-string v5, "Unknown cmd: "

    .line 493
    .line 494
    move/from16 v6, p3

    .line 495
    .line 496
    :goto_10
    const/4 v7, -0x1

    .line 497
    if-ge v6, v3, :cond_22

    .line 498
    .line 499
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    check-cast v8, Lpo;

    .line 504
    .line 505
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    check-cast v9, Ljava/lang/Boolean;

    .line 510
    .line 511
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    if-eqz v9, :cond_1e

    .line 516
    .line 517
    invoke-virtual {v8, v7}, Lpo;->d(I)V

    .line 518
    .line 519
    .line 520
    iget-object v7, v8, Lpo;->q:Lld1;

    .line 521
    .line 522
    iget-object v9, v8, Lpo;->a:Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    const/16 v17, 0x1

    .line 529
    .line 530
    add-int/lit8 v10, v10, -0x1

    .line 531
    .line 532
    :goto_11
    if-ltz v10, :cond_1d

    .line 533
    .line 534
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v12

    .line 538
    check-cast v12, Lje1;

    .line 539
    .line 540
    iget-object v13, v12, Lje1;->b:Lkc1;

    .line 541
    .line 542
    if-eqz v13, :cond_1c

    .line 543
    .line 544
    iget-boolean v14, v8, Lpo;->t:Z

    .line 545
    .line 546
    iput-boolean v14, v13, Lkc1;->z:Z

    .line 547
    .line 548
    iget-object v14, v13, Lkc1;->W:Lhc1;

    .line 549
    .line 550
    if-nez v14, :cond_17

    .line 551
    .line 552
    goto :goto_12

    .line 553
    :cond_17
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 554
    .line 555
    .line 556
    move-result-object v14

    .line 557
    const/4 v15, 0x1

    .line 558
    iput-boolean v15, v14, Lhc1;->a:Z

    .line 559
    .line 560
    :goto_12
    iget v14, v8, Lpo;->f:I

    .line 561
    .line 562
    const/16 v15, 0x2002

    .line 563
    .line 564
    const/16 v11, 0x1001

    .line 565
    .line 566
    if-eq v14, v11, :cond_19

    .line 567
    .line 568
    if-eq v14, v15, :cond_1a

    .line 569
    .line 570
    const/16 v11, 0x1004

    .line 571
    .line 572
    const/16 v15, 0x2005

    .line 573
    .line 574
    if-eq v14, v15, :cond_1a

    .line 575
    .line 576
    const/16 v15, 0x1003

    .line 577
    .line 578
    if-eq v14, v15, :cond_19

    .line 579
    .line 580
    if-eq v14, v11, :cond_18

    .line 581
    .line 582
    const/4 v11, 0x0

    .line 583
    goto :goto_13

    .line 584
    :cond_18
    const/16 v11, 0x2005

    .line 585
    .line 586
    goto :goto_13

    .line 587
    :cond_19
    move v11, v15

    .line 588
    :cond_1a
    :goto_13
    iget-object v14, v13, Lkc1;->W:Lhc1;

    .line 589
    .line 590
    if-nez v14, :cond_1b

    .line 591
    .line 592
    if-nez v11, :cond_1b

    .line 593
    .line 594
    goto :goto_14

    .line 595
    :cond_1b
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 596
    .line 597
    .line 598
    iget-object v14, v13, Lkc1;->W:Lhc1;

    .line 599
    .line 600
    iput v11, v14, Lhc1;->f:I

    .line 601
    .line 602
    :goto_14
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 603
    .line 604
    .line 605
    iget-object v11, v13, Lkc1;->W:Lhc1;

    .line 606
    .line 607
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    :cond_1c
    iget v11, v12, Lje1;->a:I

    .line 611
    .line 612
    packed-switch v11, :pswitch_data_1

    .line 613
    .line 614
    .line 615
    :pswitch_5
    iget v0, v12, Lje1;->a:I

    .line 616
    .line 617
    invoke-static {v0, v5}, Lmj0;->f(ILjava/lang/String;)V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :pswitch_6
    iget-object v11, v12, Lje1;->h:Lr92;

    .line 622
    .line 623
    invoke-virtual {v7, v13, v11}, Lld1;->b0(Lkc1;Lr92;)V

    .line 624
    .line 625
    .line 626
    :goto_15
    const/4 v11, 0x1

    .line 627
    goto/16 :goto_16

    .line 628
    .line 629
    :pswitch_7
    invoke-virtual {v7, v13}, Lld1;->c0(Lkc1;)V

    .line 630
    .line 631
    .line 632
    goto :goto_15

    .line 633
    :pswitch_8
    const/4 v11, 0x0

    .line 634
    invoke-virtual {v7, v11}, Lld1;->c0(Lkc1;)V

    .line 635
    .line 636
    .line 637
    goto :goto_15

    .line 638
    :pswitch_9
    iget v11, v12, Lje1;->d:I

    .line 639
    .line 640
    iget v14, v12, Lje1;->e:I

    .line 641
    .line 642
    iget v15, v12, Lje1;->f:I

    .line 643
    .line 644
    iget v12, v12, Lje1;->g:I

    .line 645
    .line 646
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 647
    .line 648
    .line 649
    const/4 v11, 0x1

    .line 650
    invoke-virtual {v7, v13, v11}, Lld1;->Y(Lkc1;Z)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v7, v13}, Lld1;->g(Lkc1;)V

    .line 654
    .line 655
    .line 656
    goto :goto_15

    .line 657
    :pswitch_a
    iget v11, v12, Lje1;->d:I

    .line 658
    .line 659
    iget v14, v12, Lje1;->e:I

    .line 660
    .line 661
    iget v15, v12, Lje1;->f:I

    .line 662
    .line 663
    iget v12, v12, Lje1;->g:I

    .line 664
    .line 665
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v7, v13}, Lld1;->c(Lkc1;)V

    .line 669
    .line 670
    .line 671
    goto :goto_15

    .line 672
    :pswitch_b
    iget v11, v12, Lje1;->d:I

    .line 673
    .line 674
    iget v14, v12, Lje1;->e:I

    .line 675
    .line 676
    iget v15, v12, Lje1;->f:I

    .line 677
    .line 678
    iget v12, v12, Lje1;->g:I

    .line 679
    .line 680
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 681
    .line 682
    .line 683
    const/4 v11, 0x1

    .line 684
    invoke-virtual {v7, v13, v11}, Lld1;->Y(Lkc1;Z)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v7, v13}, Lld1;->H(Lkc1;)V

    .line 688
    .line 689
    .line 690
    goto :goto_15

    .line 691
    :pswitch_c
    iget v11, v12, Lje1;->d:I

    .line 692
    .line 693
    iget v14, v12, Lje1;->e:I

    .line 694
    .line 695
    iget v15, v12, Lje1;->f:I

    .line 696
    .line 697
    iget v12, v12, Lje1;->g:I

    .line 698
    .line 699
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-static {v13}, Lld1;->e0(Lkc1;)V

    .line 706
    .line 707
    .line 708
    goto :goto_15

    .line 709
    :pswitch_d
    iget v11, v12, Lje1;->d:I

    .line 710
    .line 711
    iget v14, v12, Lje1;->e:I

    .line 712
    .line 713
    iget v15, v12, Lje1;->f:I

    .line 714
    .line 715
    iget v12, v12, Lje1;->g:I

    .line 716
    .line 717
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v7, v13}, Lld1;->a(Lkc1;)Lfe1;

    .line 721
    .line 722
    .line 723
    goto :goto_15

    .line 724
    :pswitch_e
    iget v11, v12, Lje1;->d:I

    .line 725
    .line 726
    iget v14, v12, Lje1;->e:I

    .line 727
    .line 728
    iget v15, v12, Lje1;->f:I

    .line 729
    .line 730
    iget v12, v12, Lje1;->g:I

    .line 731
    .line 732
    invoke-virtual {v13, v11, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 733
    .line 734
    .line 735
    const/4 v11, 0x1

    .line 736
    invoke-virtual {v7, v13, v11}, Lld1;->Y(Lkc1;Z)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v7, v13}, Lld1;->T(Lkc1;)V

    .line 740
    .line 741
    .line 742
    :goto_16
    add-int/lit8 v10, v10, -0x1

    .line 743
    .line 744
    const/4 v11, 0x3

    .line 745
    goto/16 :goto_11

    .line 746
    .line 747
    :cond_1d
    move-object/from16 v18, v5

    .line 748
    .line 749
    goto/16 :goto_1c

    .line 750
    .line 751
    :cond_1e
    const/4 v11, 0x1

    .line 752
    invoke-virtual {v8, v11}, Lpo;->d(I)V

    .line 753
    .line 754
    .line 755
    iget-object v7, v8, Lpo;->q:Lld1;

    .line 756
    .line 757
    iget-object v9, v8, Lpo;->a:Ljava/util/ArrayList;

    .line 758
    .line 759
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 760
    .line 761
    .line 762
    move-result v10

    .line 763
    const/4 v11, 0x0

    .line 764
    :goto_17
    if-ge v11, v10, :cond_1d

    .line 765
    .line 766
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v12

    .line 770
    check-cast v12, Lje1;

    .line 771
    .line 772
    iget-object v13, v12, Lje1;->b:Lkc1;

    .line 773
    .line 774
    if-eqz v13, :cond_21

    .line 775
    .line 776
    iget-boolean v14, v8, Lpo;->t:Z

    .line 777
    .line 778
    iput-boolean v14, v13, Lkc1;->z:Z

    .line 779
    .line 780
    iget-object v14, v13, Lkc1;->W:Lhc1;

    .line 781
    .line 782
    if-nez v14, :cond_1f

    .line 783
    .line 784
    goto :goto_18

    .line 785
    :cond_1f
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 786
    .line 787
    .line 788
    move-result-object v14

    .line 789
    const/4 v15, 0x0

    .line 790
    iput-boolean v15, v14, Lhc1;->a:Z

    .line 791
    .line 792
    :goto_18
    iget v14, v8, Lpo;->f:I

    .line 793
    .line 794
    iget-object v15, v13, Lkc1;->W:Lhc1;

    .line 795
    .line 796
    if-nez v15, :cond_20

    .line 797
    .line 798
    if-nez v14, :cond_20

    .line 799
    .line 800
    goto :goto_19

    .line 801
    :cond_20
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 802
    .line 803
    .line 804
    iget-object v15, v13, Lkc1;->W:Lhc1;

    .line 805
    .line 806
    iput v14, v15, Lhc1;->f:I

    .line 807
    .line 808
    :goto_19
    invoke-virtual {v13}, Lkc1;->k()Lhc1;

    .line 809
    .line 810
    .line 811
    iget-object v14, v13, Lkc1;->W:Lhc1;

    .line 812
    .line 813
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    :cond_21
    iget v14, v12, Lje1;->a:I

    .line 817
    .line 818
    packed-switch v14, :pswitch_data_2

    .line 819
    .line 820
    .line 821
    :pswitch_f
    iget v0, v12, Lje1;->a:I

    .line 822
    .line 823
    invoke-static {v0, v5}, Lmj0;->f(ILjava/lang/String;)V

    .line 824
    .line 825
    .line 826
    return-void

    .line 827
    :pswitch_10
    iget-object v12, v12, Lje1;->i:Lr92;

    .line 828
    .line 829
    invoke-virtual {v7, v13, v12}, Lld1;->b0(Lkc1;Lr92;)V

    .line 830
    .line 831
    .line 832
    :goto_1a
    move-object/from16 v18, v5

    .line 833
    .line 834
    goto/16 :goto_1b

    .line 835
    .line 836
    :pswitch_11
    const/4 v12, 0x0

    .line 837
    invoke-virtual {v7, v12}, Lld1;->c0(Lkc1;)V

    .line 838
    .line 839
    .line 840
    goto :goto_1a

    .line 841
    :pswitch_12
    invoke-virtual {v7, v13}, Lld1;->c0(Lkc1;)V

    .line 842
    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :pswitch_13
    iget v14, v12, Lje1;->d:I

    .line 846
    .line 847
    iget v15, v12, Lje1;->e:I

    .line 848
    .line 849
    move-object/from16 v18, v5

    .line 850
    .line 851
    iget v5, v12, Lje1;->f:I

    .line 852
    .line 853
    iget v12, v12, Lje1;->g:I

    .line 854
    .line 855
    invoke-virtual {v13, v14, v15, v5, v12}, Lkc1;->b0(IIII)V

    .line 856
    .line 857
    .line 858
    const/4 v15, 0x0

    .line 859
    invoke-virtual {v7, v13, v15}, Lld1;->Y(Lkc1;Z)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v7, v13}, Lld1;->c(Lkc1;)V

    .line 863
    .line 864
    .line 865
    goto :goto_1b

    .line 866
    :pswitch_14
    move-object/from16 v18, v5

    .line 867
    .line 868
    iget v5, v12, Lje1;->d:I

    .line 869
    .line 870
    iget v14, v12, Lje1;->e:I

    .line 871
    .line 872
    iget v15, v12, Lje1;->f:I

    .line 873
    .line 874
    iget v12, v12, Lje1;->g:I

    .line 875
    .line 876
    invoke-virtual {v13, v5, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v7, v13}, Lld1;->g(Lkc1;)V

    .line 880
    .line 881
    .line 882
    goto :goto_1b

    .line 883
    :pswitch_15
    move-object/from16 v18, v5

    .line 884
    .line 885
    iget v5, v12, Lje1;->d:I

    .line 886
    .line 887
    iget v14, v12, Lje1;->e:I

    .line 888
    .line 889
    iget v15, v12, Lje1;->f:I

    .line 890
    .line 891
    iget v12, v12, Lje1;->g:I

    .line 892
    .line 893
    invoke-virtual {v13, v5, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 894
    .line 895
    .line 896
    const/4 v15, 0x0

    .line 897
    invoke-virtual {v7, v13, v15}, Lld1;->Y(Lkc1;Z)V

    .line 898
    .line 899
    .line 900
    invoke-static {v13}, Lld1;->e0(Lkc1;)V

    .line 901
    .line 902
    .line 903
    goto :goto_1b

    .line 904
    :pswitch_16
    move-object/from16 v18, v5

    .line 905
    .line 906
    iget v5, v12, Lje1;->d:I

    .line 907
    .line 908
    iget v14, v12, Lje1;->e:I

    .line 909
    .line 910
    iget v15, v12, Lje1;->f:I

    .line 911
    .line 912
    iget v12, v12, Lje1;->g:I

    .line 913
    .line 914
    invoke-virtual {v13, v5, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v7, v13}, Lld1;->H(Lkc1;)V

    .line 918
    .line 919
    .line 920
    goto :goto_1b

    .line 921
    :pswitch_17
    move-object/from16 v18, v5

    .line 922
    .line 923
    iget v5, v12, Lje1;->d:I

    .line 924
    .line 925
    iget v14, v12, Lje1;->e:I

    .line 926
    .line 927
    iget v15, v12, Lje1;->f:I

    .line 928
    .line 929
    iget v12, v12, Lje1;->g:I

    .line 930
    .line 931
    invoke-virtual {v13, v5, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v7, v13}, Lld1;->T(Lkc1;)V

    .line 935
    .line 936
    .line 937
    goto :goto_1b

    .line 938
    :pswitch_18
    move-object/from16 v18, v5

    .line 939
    .line 940
    iget v5, v12, Lje1;->d:I

    .line 941
    .line 942
    iget v14, v12, Lje1;->e:I

    .line 943
    .line 944
    iget v15, v12, Lje1;->f:I

    .line 945
    .line 946
    iget v12, v12, Lje1;->g:I

    .line 947
    .line 948
    invoke-virtual {v13, v5, v14, v15, v12}, Lkc1;->b0(IIII)V

    .line 949
    .line 950
    .line 951
    const/4 v15, 0x0

    .line 952
    invoke-virtual {v7, v13, v15}, Lld1;->Y(Lkc1;Z)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v7, v13}, Lld1;->a(Lkc1;)Lfe1;

    .line 956
    .line 957
    .line 958
    :goto_1b
    add-int/lit8 v11, v11, 0x1

    .line 959
    .line 960
    move-object/from16 v5, v18

    .line 961
    .line 962
    goto/16 :goto_17

    .line 963
    .line 964
    :goto_1c
    add-int/lit8 v6, v6, 0x1

    .line 965
    .line 966
    move-object/from16 v5, v18

    .line 967
    .line 968
    const/4 v11, 0x3

    .line 969
    goto/16 :goto_10

    .line 970
    .line 971
    :cond_22
    add-int/lit8 v5, v3, -0x1

    .line 972
    .line 973
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v5

    .line 977
    check-cast v5, Ljava/lang/Boolean;

    .line 978
    .line 979
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 980
    .line 981
    .line 982
    move-result v5

    .line 983
    if-eqz v21, :cond_3b

    .line 984
    .line 985
    iget-object v6, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 986
    .line 987
    if-eqz v6, :cond_3b

    .line 988
    .line 989
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 990
    .line 991
    .line 992
    move-result v6

    .line 993
    if-nez v6, :cond_3b

    .line 994
    .line 995
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 996
    .line 997
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1001
    .line 1002
    .line 1003
    move-result v8

    .line 1004
    const/4 v9, 0x0

    .line 1005
    :goto_1d
    if-ge v9, v8, :cond_25

    .line 1006
    .line 1007
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v10

    .line 1011
    add-int/lit8 v9, v9, 0x1

    .line 1012
    .line 1013
    check-cast v10, Lpo;

    .line 1014
    .line 1015
    new-instance v11, Ljava/util/HashSet;

    .line 1016
    .line 1017
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    const/4 v12, 0x0

    .line 1021
    :goto_1e
    iget-object v13, v10, Lpo;->a:Ljava/util/ArrayList;

    .line 1022
    .line 1023
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1024
    .line 1025
    .line 1026
    move-result v13

    .line 1027
    if-ge v12, v13, :cond_24

    .line 1028
    .line 1029
    iget-object v13, v10, Lpo;->a:Ljava/util/ArrayList;

    .line 1030
    .line 1031
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v13

    .line 1035
    check-cast v13, Lje1;

    .line 1036
    .line 1037
    iget-object v13, v13, Lje1;->b:Lkc1;

    .line 1038
    .line 1039
    if-eqz v13, :cond_23

    .line 1040
    .line 1041
    iget-boolean v14, v10, Lpo;->g:Z

    .line 1042
    .line 1043
    if-eqz v14, :cond_23

    .line 1044
    .line 1045
    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1046
    .line 1047
    .line 1048
    :cond_23
    add-int/lit8 v12, v12, 0x1

    .line 1049
    .line 1050
    goto :goto_1e

    .line 1051
    :cond_24
    invoke-interface {v6, v11}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1052
    .line 1053
    .line 1054
    goto :goto_1d

    .line 1055
    :cond_25
    iget-object v8, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 1056
    .line 1057
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1058
    .line 1059
    .line 1060
    move-result v9

    .line 1061
    const/4 v10, 0x0

    .line 1062
    :goto_1f
    if-ge v10, v9, :cond_2d

    .line 1063
    .line 1064
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v11

    .line 1068
    add-int/lit8 v10, v10, 0x1

    .line 1069
    .line 1070
    check-cast v11, Lvd1;

    .line 1071
    .line 1072
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v12

    .line 1076
    :goto_20
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v13

    .line 1080
    if-eqz v13, :cond_2c

    .line 1081
    .line 1082
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v13

    .line 1086
    check-cast v13, Lkc1;

    .line 1087
    .line 1088
    iget-object v14, v11, Lvd1;->a:Ld23;

    .line 1089
    .line 1090
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    if-eqz v5, :cond_2b

    .line 1094
    .line 1095
    iget-object v15, v14, Ld23;->e:Lvu3;

    .line 1096
    .line 1097
    iget-object v15, v15, Lvu3;->n:Lnl4;

    .line 1098
    .line 1099
    invoke-virtual {v15}, Lnl4;->getValue()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v15

    .line 1103
    check-cast v15, Ljava/util/List;

    .line 1104
    .line 1105
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1106
    .line 1107
    .line 1108
    move-result v7

    .line 1109
    invoke-interface {v15, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v7

    .line 1113
    :goto_21
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v15

    .line 1117
    if-eqz v15, :cond_27

    .line 1118
    .line 1119
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v15

    .line 1123
    move-object/from16 v19, v6

    .line 1124
    .line 1125
    move-object v6, v15

    .line 1126
    check-cast v6, La23;

    .line 1127
    .line 1128
    iget-object v6, v6, La23;->s:Ljava/lang/String;

    .line 1129
    .line 1130
    move-object/from16 v20, v7

    .line 1131
    .line 1132
    iget-object v7, v13, Lkc1;->L:Ljava/lang/String;

    .line 1133
    .line 1134
    invoke-static {v6, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v6

    .line 1138
    if-eqz v6, :cond_26

    .line 1139
    .line 1140
    goto :goto_22

    .line 1141
    :cond_26
    move-object/from16 v6, v19

    .line 1142
    .line 1143
    move-object/from16 v7, v20

    .line 1144
    .line 1145
    goto :goto_21

    .line 1146
    :cond_27
    move-object/from16 v19, v6

    .line 1147
    .line 1148
    const/4 v15, 0x0

    .line 1149
    :goto_22
    check-cast v15, La23;

    .line 1150
    .line 1151
    invoke-static {}, Lrd1;->n()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v6

    .line 1155
    if-eqz v6, :cond_28

    .line 1156
    .line 1157
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1158
    .line 1159
    const-string v7, "OnBackStackChangedStarted for fragment "

    .line 1160
    .line 1161
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v6

    .line 1177
    move-object/from16 v7, v23

    .line 1178
    .line 1179
    invoke-static {v7, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1180
    .line 1181
    .line 1182
    goto :goto_23

    .line 1183
    :cond_28
    move-object/from16 v7, v23

    .line 1184
    .line 1185
    :goto_23
    if-eqz v15, :cond_2a

    .line 1186
    .line 1187
    iget-object v6, v14, Ld23;->c:Lnl4;

    .line 1188
    .line 1189
    invoke-virtual {v6}, Lnl4;->getValue()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v13

    .line 1193
    check-cast v13, Ljava/util/Set;

    .line 1194
    .line 1195
    invoke-static {v13, v15}, Lkb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v13

    .line 1199
    move-object/from16 v20, v8

    .line 1200
    .line 1201
    const/4 v8, 0x0

    .line 1202
    invoke-virtual {v6, v8, v13}, Lnl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    iget-object v6, v14, Ld23;->h:Lv23;

    .line 1206
    .line 1207
    iget-object v6, v6, Lv23;->g:Lii;

    .line 1208
    .line 1209
    invoke-virtual {v6, v15}, Lii;->contains(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v6

    .line 1213
    if-eqz v6, :cond_29

    .line 1214
    .line 1215
    sget-object v6, Lr92;->q:Lr92;

    .line 1216
    .line 1217
    iput-object v6, v15, La23;->x:Lr92;

    .line 1218
    .line 1219
    invoke-virtual {v15}, La23;->e()V

    .line 1220
    .line 1221
    .line 1222
    goto :goto_25

    .line 1223
    :cond_29
    const-string v0, "Cannot transition entry that is not in the back stack"

    .line 1224
    .line 1225
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    return-void

    .line 1229
    :cond_2a
    :goto_24
    move-object/from16 v20, v8

    .line 1230
    .line 1231
    const/4 v8, 0x0

    .line 1232
    goto :goto_25

    .line 1233
    :cond_2b
    move-object/from16 v19, v6

    .line 1234
    .line 1235
    move-object/from16 v7, v23

    .line 1236
    .line 1237
    goto :goto_24

    .line 1238
    :goto_25
    move-object/from16 v23, v7

    .line 1239
    .line 1240
    move-object/from16 v6, v19

    .line 1241
    .line 1242
    move-object/from16 v8, v20

    .line 1243
    .line 1244
    const/4 v7, -0x1

    .line 1245
    goto/16 :goto_20

    .line 1246
    .line 1247
    :cond_2c
    const/4 v7, -0x1

    .line 1248
    goto/16 :goto_1f

    .line 1249
    .line 1250
    :cond_2d
    move-object/from16 v19, v6

    .line 1251
    .line 1252
    move-object/from16 v7, v23

    .line 1253
    .line 1254
    const/4 v8, 0x0

    .line 1255
    iget-object v6, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 1256
    .line 1257
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1258
    .line 1259
    .line 1260
    move-result v9

    .line 1261
    const/4 v10, 0x0

    .line 1262
    :goto_26
    if-ge v10, v9, :cond_3b

    .line 1263
    .line 1264
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v11

    .line 1268
    add-int/lit8 v10, v10, 0x1

    .line 1269
    .line 1270
    check-cast v11, Lvd1;

    .line 1271
    .line 1272
    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v12

    .line 1276
    :goto_27
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v13

    .line 1280
    if-eqz v13, :cond_3a

    .line 1281
    .line 1282
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v13

    .line 1286
    check-cast v13, Lkc1;

    .line 1287
    .line 1288
    const-string v14, "OnBackStackChangedCommitted for fragment "

    .line 1289
    .line 1290
    iget-object v15, v11, Lvd1;->b:Lrd1;

    .line 1291
    .line 1292
    iget-object v8, v15, Lrd1;->g:Ljava/util/ArrayList;

    .line 1293
    .line 1294
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    move-object/from16 v20, v6

    .line 1298
    .line 1299
    iget-object v6, v11, Lvd1;->a:Ld23;

    .line 1300
    .line 1301
    move/from16 v22, v9

    .line 1302
    .line 1303
    iget-object v9, v6, Ld23;->e:Lvu3;

    .line 1304
    .line 1305
    iget-object v9, v9, Lvu3;->n:Lnl4;

    .line 1306
    .line 1307
    invoke-virtual {v9}, Lnl4;->getValue()Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v9

    .line 1311
    check-cast v9, Ljava/util/Collection;

    .line 1312
    .line 1313
    move/from16 v23, v10

    .line 1314
    .line 1315
    iget-object v10, v6, Ld23;->f:Lvu3;

    .line 1316
    .line 1317
    iget-object v10, v10, Lvu3;->n:Lnl4;

    .line 1318
    .line 1319
    invoke-virtual {v10}, Lnl4;->getValue()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v10

    .line 1323
    check-cast v10, Ljava/lang/Iterable;

    .line 1324
    .line 1325
    invoke-static {v9, v10}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v9

    .line 1329
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1330
    .line 1331
    .line 1332
    move-result v10

    .line 1333
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v9

    .line 1337
    :goto_28
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1338
    .line 1339
    .line 1340
    move-result v10

    .line 1341
    if-eqz v10, :cond_2f

    .line 1342
    .line 1343
    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v10

    .line 1347
    move-object/from16 v24, v9

    .line 1348
    .line 1349
    move-object v9, v10

    .line 1350
    check-cast v9, La23;

    .line 1351
    .line 1352
    iget-object v9, v9, La23;->s:Ljava/lang/String;

    .line 1353
    .line 1354
    move-object/from16 v25, v10

    .line 1355
    .line 1356
    iget-object v10, v13, Lkc1;->L:Ljava/lang/String;

    .line 1357
    .line 1358
    invoke-static {v9, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v9

    .line 1362
    if-eqz v9, :cond_2e

    .line 1363
    .line 1364
    goto :goto_29

    .line 1365
    :cond_2e
    move-object/from16 v9, v24

    .line 1366
    .line 1367
    goto :goto_28

    .line 1368
    :cond_2f
    const/16 v25, 0x0

    .line 1369
    .line 1370
    :goto_29
    move-object/from16 v9, v25

    .line 1371
    .line 1372
    check-cast v9, La23;

    .line 1373
    .line 1374
    if-eqz v5, :cond_30

    .line 1375
    .line 1376
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v10

    .line 1380
    if-eqz v10, :cond_30

    .line 1381
    .line 1382
    iget-boolean v10, v13, Lkc1;->y:Z

    .line 1383
    .line 1384
    if-eqz v10, :cond_30

    .line 1385
    .line 1386
    const/16 v24, 0x1

    .line 1387
    .line 1388
    goto :goto_2a

    .line 1389
    :cond_30
    const/16 v24, 0x0

    .line 1390
    .line 1391
    :goto_2a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1392
    .line 1393
    .line 1394
    move-result v10

    .line 1395
    move-object/from16 v25, v11

    .line 1396
    .line 1397
    const/4 v11, 0x0

    .line 1398
    :goto_2b
    if-ge v11, v10, :cond_32

    .line 1399
    .line 1400
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v26

    .line 1404
    add-int/lit8 v11, v11, 0x1

    .line 1405
    .line 1406
    move/from16 v27, v10

    .line 1407
    .line 1408
    move-object/from16 v10, v26

    .line 1409
    .line 1410
    check-cast v10, Lkd3;

    .line 1411
    .line 1412
    iget-object v10, v10, Lkd3;->n:Ljava/lang/Object;

    .line 1413
    .line 1414
    move/from16 v28, v11

    .line 1415
    .line 1416
    iget-object v11, v13, Lkc1;->L:Ljava/lang/String;

    .line 1417
    .line 1418
    invoke-static {v10, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v10

    .line 1422
    if-eqz v10, :cond_31

    .line 1423
    .line 1424
    move-object/from16 v11, v26

    .line 1425
    .line 1426
    goto :goto_2c

    .line 1427
    :cond_31
    move/from16 v10, v27

    .line 1428
    .line 1429
    move/from16 v11, v28

    .line 1430
    .line 1431
    goto :goto_2b

    .line 1432
    :cond_32
    const/4 v11, 0x0

    .line 1433
    :goto_2c
    check-cast v11, Lkd3;

    .line 1434
    .line 1435
    if-eqz v11, :cond_33

    .line 1436
    .line 1437
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1438
    .line 1439
    .line 1440
    :cond_33
    if-nez v24, :cond_34

    .line 1441
    .line 1442
    invoke-static {}, Lrd1;->n()Z

    .line 1443
    .line 1444
    .line 1445
    move-result v8

    .line 1446
    if-eqz v8, :cond_34

    .line 1447
    .line 1448
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1449
    .line 1450
    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v8

    .line 1466
    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1467
    .line 1468
    .line 1469
    :cond_34
    if-eqz v11, :cond_35

    .line 1470
    .line 1471
    iget-object v8, v11, Lkd3;->o:Ljava/lang/Object;

    .line 1472
    .line 1473
    check-cast v8, Ljava/lang/Boolean;

    .line 1474
    .line 1475
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1476
    .line 1477
    .line 1478
    move-result v8

    .line 1479
    const/4 v11, 0x1

    .line 1480
    if-ne v8, v11, :cond_35

    .line 1481
    .line 1482
    const/4 v8, 0x1

    .line 1483
    goto :goto_2d

    .line 1484
    :cond_35
    const/4 v8, 0x0

    .line 1485
    :goto_2d
    if-nez v5, :cond_37

    .line 1486
    .line 1487
    if-nez v8, :cond_37

    .line 1488
    .line 1489
    if-eqz v9, :cond_36

    .line 1490
    .line 1491
    goto :goto_2e

    .line 1492
    :cond_36
    const-string v0, "The fragment "

    .line 1493
    .line 1494
    const-string v1, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."

    .line 1495
    .line 1496
    invoke-static {v0, v13, v1}, Lb11;->l(Ljava/lang/String;Lkc1;Ljava/lang/String;)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    invoke-static {v0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 1501
    .line 1502
    .line 1503
    return-void

    .line 1504
    :cond_37
    :goto_2e
    if-eqz v9, :cond_39

    .line 1505
    .line 1506
    invoke-virtual {v15, v13, v9, v6}, Lrd1;->l(Lkc1;La23;Ld23;)V

    .line 1507
    .line 1508
    .line 1509
    if-eqz v24, :cond_39

    .line 1510
    .line 1511
    invoke-static {}, Lrd1;->n()Z

    .line 1512
    .line 1513
    .line 1514
    move-result v8

    .line 1515
    if-eqz v8, :cond_38

    .line 1516
    .line 1517
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1518
    .line 1519
    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1523
    .line 1524
    .line 1525
    const-string v10, " popping associated entry "

    .line 1526
    .line 1527
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1531
    .line 1532
    .line 1533
    const-string v10, " via system back"

    .line 1534
    .line 1535
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v8

    .line 1542
    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1543
    .line 1544
    .line 1545
    :cond_38
    const/4 v15, 0x0

    .line 1546
    invoke-virtual {v6, v9, v15}, Ld23;->f(La23;Z)V

    .line 1547
    .line 1548
    .line 1549
    :cond_39
    move-object/from16 v6, v20

    .line 1550
    .line 1551
    move/from16 v9, v22

    .line 1552
    .line 1553
    move/from16 v10, v23

    .line 1554
    .line 1555
    move-object/from16 v11, v25

    .line 1556
    .line 1557
    const/4 v8, 0x0

    .line 1558
    goto/16 :goto_27

    .line 1559
    .line 1560
    :cond_3a
    move/from16 v23, v10

    .line 1561
    .line 1562
    goto/16 :goto_26

    .line 1563
    .line 1564
    :cond_3b
    move/from16 v4, p3

    .line 1565
    .line 1566
    :goto_2f
    if-ge v4, v3, :cond_40

    .line 1567
    .line 1568
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v6

    .line 1572
    check-cast v6, Lpo;

    .line 1573
    .line 1574
    if-eqz v5, :cond_3d

    .line 1575
    .line 1576
    iget-object v7, v6, Lpo;->a:Ljava/util/ArrayList;

    .line 1577
    .line 1578
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1579
    .line 1580
    .line 1581
    move-result v7

    .line 1582
    const/16 v17, 0x1

    .line 1583
    .line 1584
    add-int/lit8 v7, v7, -0x1

    .line 1585
    .line 1586
    :goto_30
    if-ltz v7, :cond_3f

    .line 1587
    .line 1588
    iget-object v8, v6, Lpo;->a:Ljava/util/ArrayList;

    .line 1589
    .line 1590
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v8

    .line 1594
    check-cast v8, Lje1;

    .line 1595
    .line 1596
    iget-object v8, v8, Lje1;->b:Lkc1;

    .line 1597
    .line 1598
    if-eqz v8, :cond_3c

    .line 1599
    .line 1600
    invoke-virtual {v0, v8}, Lld1;->f(Lkc1;)Lfe1;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v8

    .line 1604
    invoke-virtual {v8}, Lfe1;->k()V

    .line 1605
    .line 1606
    .line 1607
    :cond_3c
    add-int/lit8 v7, v7, -0x1

    .line 1608
    .line 1609
    goto :goto_30

    .line 1610
    :cond_3d
    iget-object v6, v6, Lpo;->a:Ljava/util/ArrayList;

    .line 1611
    .line 1612
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1613
    .line 1614
    .line 1615
    move-result v7

    .line 1616
    const/4 v11, 0x0

    .line 1617
    :cond_3e
    :goto_31
    if-ge v11, v7, :cond_3f

    .line 1618
    .line 1619
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v8

    .line 1623
    add-int/lit8 v11, v11, 0x1

    .line 1624
    .line 1625
    check-cast v8, Lje1;

    .line 1626
    .line 1627
    iget-object v8, v8, Lje1;->b:Lkc1;

    .line 1628
    .line 1629
    if-eqz v8, :cond_3e

    .line 1630
    .line 1631
    invoke-virtual {v0, v8}, Lld1;->f(Lkc1;)Lfe1;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v8

    .line 1635
    invoke-virtual {v8}, Lfe1;->k()V

    .line 1636
    .line 1637
    .line 1638
    goto :goto_31

    .line 1639
    :cond_3f
    add-int/lit8 v4, v4, 0x1

    .line 1640
    .line 1641
    goto :goto_2f

    .line 1642
    :cond_40
    iget v4, v0, Lld1;->u:I

    .line 1643
    .line 1644
    const/4 v11, 0x1

    .line 1645
    invoke-virtual {v0, v4, v11}, Lld1;->O(IZ)V

    .line 1646
    .line 1647
    .line 1648
    new-instance v4, Ljava/util/HashSet;

    .line 1649
    .line 1650
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 1651
    .line 1652
    .line 1653
    move/from16 v6, p3

    .line 1654
    .line 1655
    :goto_32
    if-ge v6, v3, :cond_43

    .line 1656
    .line 1657
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v7

    .line 1661
    check-cast v7, Lpo;

    .line 1662
    .line 1663
    iget-object v7, v7, Lpo;->a:Ljava/util/ArrayList;

    .line 1664
    .line 1665
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1666
    .line 1667
    .line 1668
    move-result v8

    .line 1669
    const/4 v11, 0x0

    .line 1670
    :cond_41
    :goto_33
    if-ge v11, v8, :cond_42

    .line 1671
    .line 1672
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v9

    .line 1676
    add-int/lit8 v11, v11, 0x1

    .line 1677
    .line 1678
    check-cast v9, Lje1;

    .line 1679
    .line 1680
    iget-object v9, v9, Lje1;->b:Lkc1;

    .line 1681
    .line 1682
    if-eqz v9, :cond_41

    .line 1683
    .line 1684
    iget-object v9, v9, Lkc1;->S:Landroid/view/ViewGroup;

    .line 1685
    .line 1686
    if-eqz v9, :cond_41

    .line 1687
    .line 1688
    invoke-static {v9, v0}, Lxm0;->f(Landroid/view/ViewGroup;Lld1;)Lxm0;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v9

    .line 1692
    invoke-virtual {v4, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1693
    .line 1694
    .line 1695
    goto :goto_33

    .line 1696
    :cond_42
    add-int/lit8 v6, v6, 0x1

    .line 1697
    .line 1698
    goto :goto_32

    .line 1699
    :cond_43
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v4

    .line 1703
    :goto_34
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1704
    .line 1705
    .line 1706
    move-result v6

    .line 1707
    if-eqz v6, :cond_4a

    .line 1708
    .line 1709
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v6

    .line 1713
    check-cast v6, Lxm0;

    .line 1714
    .line 1715
    iput-boolean v5, v6, Lxm0;->d:Z

    .line 1716
    .line 1717
    iget-object v7, v6, Lxm0;->b:Ljava/util/ArrayList;

    .line 1718
    .line 1719
    monitor-enter v7

    .line 1720
    :try_start_0
    invoke-virtual {v6}, Lxm0;->g()V

    .line 1721
    .line 1722
    .line 1723
    iget-object v8, v6, Lxm0;->b:Ljava/util/ArrayList;

    .line 1724
    .line 1725
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1726
    .line 1727
    .line 1728
    move-result v9

    .line 1729
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v8

    .line 1733
    :cond_44
    invoke-interface {v8}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v9

    .line 1737
    if-eqz v9, :cond_49

    .line 1738
    .line 1739
    invoke-interface {v8}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v11

    .line 1743
    move-object v9, v11

    .line 1744
    check-cast v9, Lpj4;

    .line 1745
    .line 1746
    iget-object v10, v9, Lpj4;->c:Lkc1;

    .line 1747
    .line 1748
    iget-object v10, v10, Lkc1;->T:Landroid/view/View;

    .line 1749
    .line 1750
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v10}, Landroid/view/View;->getAlpha()F

    .line 1754
    .line 1755
    .line 1756
    move-result v12

    .line 1757
    const/4 v13, 0x0

    .line 1758
    cmpg-float v12, v12, v13

    .line 1759
    .line 1760
    const/4 v13, 0x4

    .line 1761
    if-nez v12, :cond_46

    .line 1762
    .line 1763
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 1764
    .line 1765
    .line 1766
    move-result v12

    .line 1767
    if-nez v12, :cond_46

    .line 1768
    .line 1769
    :cond_45
    const/16 v12, 0x8

    .line 1770
    .line 1771
    goto :goto_35

    .line 1772
    :cond_46
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 1773
    .line 1774
    .line 1775
    move-result v10

    .line 1776
    if-eqz v10, :cond_48

    .line 1777
    .line 1778
    if-eq v10, v13, :cond_45

    .line 1779
    .line 1780
    const/16 v12, 0x8

    .line 1781
    .line 1782
    if-ne v10, v12, :cond_47

    .line 1783
    .line 1784
    const/4 v13, 0x3

    .line 1785
    goto :goto_35

    .line 1786
    :cond_47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1787
    .line 1788
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1789
    .line 1790
    const-string v2, "Unknown visibility "

    .line 1791
    .line 1792
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    throw v0

    .line 1806
    :cond_48
    const/16 v12, 0x8

    .line 1807
    .line 1808
    const/4 v13, 0x2

    .line 1809
    :goto_35
    iget v9, v9, Lpj4;->a:I

    .line 1810
    .line 1811
    const/4 v10, 0x2

    .line 1812
    if-ne v9, v10, :cond_44

    .line 1813
    .line 1814
    if-eq v13, v10, :cond_44

    .line 1815
    .line 1816
    goto :goto_36

    .line 1817
    :catchall_0
    move-exception v0

    .line 1818
    goto :goto_37

    .line 1819
    :cond_49
    const/4 v10, 0x2

    .line 1820
    const/16 v12, 0x8

    .line 1821
    .line 1822
    const/4 v11, 0x0

    .line 1823
    :goto_36
    check-cast v11, Lpj4;

    .line 1824
    .line 1825
    const/4 v15, 0x0

    .line 1826
    iput-boolean v15, v6, Lxm0;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1827
    .line 1828
    monitor-exit v7

    .line 1829
    invoke-virtual {v6}, Lxm0;->c()V

    .line 1830
    .line 1831
    .line 1832
    goto/16 :goto_34

    .line 1833
    .line 1834
    :goto_37
    monitor-exit v7

    .line 1835
    throw v0

    .line 1836
    :cond_4a
    const/4 v15, 0x0

    .line 1837
    move/from16 v4, p3

    .line 1838
    .line 1839
    :goto_38
    if-ge v4, v3, :cond_4c

    .line 1840
    .line 1841
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v5

    .line 1845
    check-cast v5, Lpo;

    .line 1846
    .line 1847
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v6

    .line 1851
    check-cast v6, Ljava/lang/Boolean;

    .line 1852
    .line 1853
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1854
    .line 1855
    .line 1856
    move-result v6

    .line 1857
    if-eqz v6, :cond_4b

    .line 1858
    .line 1859
    iget v6, v5, Lpo;->s:I

    .line 1860
    .line 1861
    if-ltz v6, :cond_4b

    .line 1862
    .line 1863
    const/4 v6, -0x1

    .line 1864
    iput v6, v5, Lpo;->s:I

    .line 1865
    .line 1866
    goto :goto_39

    .line 1867
    :cond_4b
    const/4 v6, -0x1

    .line 1868
    :goto_39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1869
    .line 1870
    .line 1871
    add-int/lit8 v4, v4, 0x1

    .line 1872
    .line 1873
    goto :goto_38

    .line 1874
    :cond_4c
    if-eqz v21, :cond_4d

    .line 1875
    .line 1876
    iget-object v1, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 1877
    .line 1878
    if-eqz v1, :cond_4d

    .line 1879
    .line 1880
    move v10, v15

    .line 1881
    :goto_3a
    iget-object v1, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 1882
    .line 1883
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1884
    .line 1885
    .line 1886
    move-result v1

    .line 1887
    if-ge v10, v1, :cond_4d

    .line 1888
    .line 1889
    iget-object v1, v0, Lld1;->m:Ljava/util/ArrayList;

    .line 1890
    .line 1891
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v1

    .line 1895
    check-cast v1, Lvd1;

    .line 1896
    .line 1897
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1898
    .line 1899
    .line 1900
    add-int/lit8 v10, v10, 0x1

    .line 1901
    .line 1902
    goto :goto_3a

    .line 1903
    :cond_4d
    return-void

    .line 1904
    nop

    .line 1905
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final B(ILjava/lang/String;Z)I
    .locals 4

    .line 1
    iget-object v0, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    if-nez p2, :cond_2

    .line 15
    .line 16
    if-gez p1, :cond_2

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    iget-object p0, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/lit8 p0, p0, -0x1

    .line 29
    .line 30
    return p0

    .line 31
    :cond_2
    iget-object v0, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    :goto_0
    if-ltz v0, :cond_5

    .line 40
    .line 41
    iget-object v2, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lpo;

    .line 48
    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    iget-object v3, v2, Lpo;->i:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    if-ltz p1, :cond_4

    .line 61
    .line 62
    iget v2, v2, Lpo;->s:I

    .line 63
    .line 64
    if-ne p1, v2, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    :goto_1
    if-gez v0, :cond_6

    .line 71
    .line 72
    return v0

    .line 73
    :cond_6
    if-eqz p3, :cond_a

    .line 74
    .line 75
    :goto_2
    if-lez v0, :cond_9

    .line 76
    .line 77
    iget-object p3, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 78
    .line 79
    add-int/lit8 v1, v0, -0x1

    .line 80
    .line 81
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Lpo;

    .line 86
    .line 87
    if-eqz p2, :cond_7

    .line 88
    .line 89
    iget-object v1, p3, Lpo;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_8

    .line 96
    .line 97
    :cond_7
    if-ltz p1, :cond_9

    .line 98
    .line 99
    iget p3, p3, Lpo;->s:I

    .line 100
    .line 101
    if-ne p1, p3, :cond_9

    .line 102
    .line 103
    :cond_8
    add-int/lit8 v0, v0, -0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_9
    return v0

    .line 107
    :cond_a
    iget-object p0, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    add-int/lit8 p0, p0, -0x1

    .line 114
    .line 115
    if-ne v0, p0, :cond_b

    .line 116
    .line 117
    return v1

    .line 118
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    return v0

    .line 121
    :cond_c
    :goto_3
    return v1
.end method

.method public final C(I)Lkc1;
    .locals 4

    .line 1
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 2
    .line 3
    iget-object v0, p0, Lss0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lkc1;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v3, v2, Lkc1;->J:I

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object p0, p0, Lss0;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lfe1;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Lfe1;->c:Lkc1;

    .line 58
    .line 59
    iget v1, v0, Lkc1;->J:I

    .line 60
    .line 61
    if-ne v1, p1, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public final D(Ljava/lang/String;)Lkc1;
    .locals 4

    .line 1
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 2
    .line 3
    iget-object v0, p0, Lss0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    :goto_0
    if-ltz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lkc1;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v3, v2, Lkc1;->L:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p0, p0, Lss0;->o:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lfe1;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v0, v0, Lfe1;->c:Lkc1;

    .line 66
    .line 67
    iget-object v1, v0, Lkc1;->L:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method public final E(Lkc1;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Lkc1;->S:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Lkc1;->K:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lld1;->w:Lfu;

    .line 12
    .line 13
    invoke-virtual {v0}, Lfu;->I()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lld1;->w:Lfu;

    .line 20
    .line 21
    iget p1, p1, Lkc1;->K:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lfu;->H(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final F()Ldd1;
    .locals 1

    .line 1
    iget-object v0, p0, Lld1;->x:Lkc1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lkc1;->F:Lld1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lld1;->F()Ldd1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lld1;->z:Ldd1;

    .line 13
    .line 14
    return-object p0
.end method

.method public final G()Ly41;
    .locals 1

    .line 1
    iget-object v0, p0, Lld1;->x:Lkc1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lkc1;->F:Lld1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lld1;->G()Ly41;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lld1;->A:Ly41;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H(Lkc1;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lld1;->I(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Lkc1;->M:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Lkc1;->M:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lkc1;->X:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Lkc1;->X:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lld1;->d0(Lkc1;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final K()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lld1;->x:Lkc1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lkc1;->y()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lld1;->x:Lkc1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lkc1;->q()Lld1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lld1;->K()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lld1;->G:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lld1;->H:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public final O(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p0, "No activity"

    .line 10
    .line 11
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Lld1;->u:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_2
    iput p1, p0, Lld1;->u:I

    .line 24
    .line 25
    iget-object p1, p0, Lld1;->c:Lss0;

    .line 26
    .line 27
    iget-object p2, p1, Lss0;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v0, p1, Lss0;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    move v3, v2

    .line 41
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    check-cast v4, Lkc1;

    .line 50
    .line 51
    iget-object v4, v4, Lkc1;->r:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Lfe1;

    .line 58
    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v4}, Lfe1;->k()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lfe1;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Lfe1;->k()V

    .line 88
    .line 89
    .line 90
    iget-object v1, v0, Lfe1;->c:Lkc1;

    .line 91
    .line 92
    iget-boolean v3, v1, Lkc1;->y:Z

    .line 93
    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    invoke-virtual {v1}, Lkc1;->A()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_5

    .line 101
    .line 102
    iget-boolean v3, v1, Lkc1;->z:Z

    .line 103
    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    iget-object v3, p1, Lss0;->p:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v4, v1, Lkc1;->r:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_6

    .line 117
    .line 118
    iget-object v1, v1, Lkc1;->r:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v0}, Lfe1;->o()Landroid/os/Bundle;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {p1, v1, v3}, Lss0;->G(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 125
    .line 126
    .line 127
    :cond_6
    invoke-virtual {p1, v0}, Lss0;->F(Lfe1;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    invoke-virtual {p0}, Lld1;->f0()V

    .line 132
    .line 133
    .line 134
    iget-boolean p1, p0, Lld1;->F:Z

    .line 135
    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 139
    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    iget p2, p0, Lld1;->u:I

    .line 143
    .line 144
    const/4 v0, 0x7

    .line 145
    if-ne p2, v0, :cond_8

    .line 146
    .line 147
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 150
    .line 151
    .line 152
    iput-boolean v2, p0, Lld1;->F:Z

    .line 153
    .line 154
    :cond_8
    :goto_3
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lld1;->G:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lld1;->H:Z

    .line 10
    .line 11
    iget-object v1, p0, Lld1;->N:Lod1;

    .line 12
    .line 13
    iput-boolean v0, v1, Lod1;->g:Z

    .line 14
    .line 15
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 16
    .line 17
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lkc1;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 40
    .line 41
    invoke-virtual {v0}, Lld1;->P()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final Q()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lld1;->R(II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final R(II)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lld1;->y(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lld1;->x(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lld1;->y:Lkc1;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lkc1;->m()Lld1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lld1;->Q()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    iget-object v3, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v4, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v2, p0

    .line 32
    move v6, p1

    .line 33
    move v7, p2

    .line 34
    invoke-virtual/range {v2 .. v7}, Lld1;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iput-boolean v0, v2, Lld1;->b:Z

    .line 41
    .line 42
    :try_start_0
    iget-object p1, v2, Lld1;->K:Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-object p2, v2, Lld1;->L:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2, p1, p2}, Lld1;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lld1;->d()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    invoke-virtual {v2}, Lld1;->d()V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lld1;->h0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lld1;->u()V

    .line 63
    .line 64
    .line 65
    iget-object p1, v2, Lld1;->c:Lss0;

    .line 66
    .line 67
    iget-object p1, p1, Lss0;->o:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/4 p2, 0x0

    .line 76
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p1, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    return p0
.end method

.method public final S(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p5, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p5, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p5, v1

    .line 9
    :goto_0
    invoke-virtual {p0, p4, p3, p5}, Lld1;->B(ILjava/lang/String;Z)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-gez p3, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object p4, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    sub-int/2addr p4, v0

    .line 23
    :goto_1
    if-lt p4, p3, :cond_2

    .line 24
    .line 25
    iget-object p5, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    check-cast p5, Lpo;

    .line 32
    .line 33
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 p4, p4, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    return v0
.end method

.method public final T(Lkc1;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lld1;->I(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Lkc1;->E:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lkc1;->A()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, Lkc1;->N:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lld1;->c:Lss0;

    .line 50
    .line 51
    iget-object v1, v0, Lss0;->n:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Lkc1;->x:Z

    .line 66
    .line 67
    invoke-static {p1}, Lld1;->J(Lkc1;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, Lld1;->F:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, Lkc1;->y:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lld1;->d0(Lkc1;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p0
.end method

.method public final U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lpo;

    .line 31
    .line 32
    iget-boolean v3, v3, Lpo;->p:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Lld1;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lpo;

    .line 74
    .line 75
    iget-boolean v3, v3, Lpo;->p:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lld1;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Lld1;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p0, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final V(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Lld1;->v:Lmc1;

    .line 40
    .line 41
    iget-object v5, v5, Lmc1;->B:Lnc1;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Lld1;->k:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Lld1;->v:Lmc1;

    .line 101
    .line 102
    iget-object v6, v6, Lmc1;->B:Lnc1;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Lld1;->c:Lss0;

    .line 122
    .line 123
    iget-object v4, v3, Lss0;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v5, v3, Lss0;->o:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lnd1;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v1, Lnd1;->n:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    const/4 v7, 0x0

    .line 158
    move v8, v7

    .line 159
    :cond_5
    :goto_2
    iget-object v9, v0, Lld1;->n:Lwo0;

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    const-string v11, "): "

    .line 163
    .line 164
    const/4 v12, 0x2

    .line 165
    const-string v13, "FragmentManager"

    .line 166
    .line 167
    if-ge v8, v6, :cond_9

    .line 168
    .line 169
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    .line 175
    check-cast v14, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v3, v14, v10}, Lss0;->G(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    if-eqz v10, :cond_5

    .line 182
    .line 183
    invoke-virtual {v10, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    check-cast v14, Lbe1;

    .line 188
    .line 189
    iget-object v15, v0, Lld1;->N:Lod1;

    .line 190
    .line 191
    iget-object v14, v14, Lbe1;->o:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v15, v15, Lod1;->b:Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    check-cast v14, Lkc1;

    .line 200
    .line 201
    if-eqz v14, :cond_7

    .line 202
    .line 203
    invoke-static {v12}, Lld1;->I(I)Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_6

    .line 208
    .line 209
    new-instance v15, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    move/from16 p1, v12

    .line 212
    .line 213
    const-string v12, "restoreSaveState: re-attaching retained "

    .line 214
    .line 215
    invoke-direct {v15, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-static {v13, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    move/from16 p1, v12

    .line 230
    .line 231
    :goto_3
    new-instance v12, Lfe1;

    .line 232
    .line 233
    invoke-direct {v12, v9, v3, v14, v10}, Lfe1;-><init>(Lwo0;Lss0;Lkc1;Landroid/os/Bundle;)V

    .line 234
    .line 235
    .line 236
    move-object v9, v10

    .line 237
    goto :goto_4

    .line 238
    :cond_7
    move/from16 p1, v12

    .line 239
    .line 240
    new-instance v15, Lfe1;

    .line 241
    .line 242
    iget-object v9, v0, Lld1;->v:Lmc1;

    .line 243
    .line 244
    iget-object v9, v9, Lmc1;->B:Lnc1;

    .line 245
    .line 246
    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 247
    .line 248
    .line 249
    move-result-object v18

    .line 250
    invoke-virtual {v0}, Lld1;->F()Ldd1;

    .line 251
    .line 252
    .line 253
    move-result-object v19

    .line 254
    iget-object v9, v0, Lld1;->n:Lwo0;

    .line 255
    .line 256
    iget-object v12, v0, Lld1;->c:Lss0;

    .line 257
    .line 258
    move-object/from16 v16, v9

    .line 259
    .line 260
    move-object/from16 v20, v10

    .line 261
    .line 262
    move-object/from16 v17, v12

    .line 263
    .line 264
    invoke-direct/range {v15 .. v20}, Lfe1;-><init>(Lwo0;Lss0;Ljava/lang/ClassLoader;Ldd1;Landroid/os/Bundle;)V

    .line 265
    .line 266
    .line 267
    move-object/from16 v9, v20

    .line 268
    .line 269
    move-object v12, v15

    .line 270
    :goto_4
    iget-object v10, v12, Lfe1;->c:Lkc1;

    .line 271
    .line 272
    iput-object v9, v10, Lkc1;->o:Landroid/os/Bundle;

    .line 273
    .line 274
    iput-object v0, v10, Lkc1;->F:Lld1;

    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, Lld1;->I(I)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-eqz v9, :cond_8

    .line 281
    .line 282
    new-instance v9, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v14, "restoreSaveState: active ("

    .line 285
    .line 286
    invoke-direct {v9, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    iget-object v14, v10, Lkc1;->r:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    invoke-static {v13, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    :cond_8
    iget-object v9, v0, Lld1;->v:Lmc1;

    .line 308
    .line 309
    iget-object v9, v9, Lmc1;->B:Lnc1;

    .line 310
    .line 311
    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-virtual {v12, v9}, Lfe1;->m(Ljava/lang/ClassLoader;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v12}, Lss0;->E(Lfe1;)V

    .line 319
    .line 320
    .line 321
    iget v9, v0, Lld1;->u:I

    .line 322
    .line 323
    iput v9, v12, Lfe1;->e:I

    .line 324
    .line 325
    goto/16 :goto_2

    .line 326
    .line 327
    :cond_9
    move/from16 p1, v12

    .line 328
    .line 329
    iget-object v2, v0, Lld1;->N:Lod1;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    new-instance v4, Ljava/util/ArrayList;

    .line 335
    .line 336
    iget-object v2, v2, Lod1;->b:Ljava/util/HashMap;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    move v6, v7

    .line 350
    :goto_5
    const/4 v8, 0x1

    .line 351
    if-ge v6, v2, :cond_c

    .line 352
    .line 353
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    add-int/lit8 v6, v6, 0x1

    .line 358
    .line 359
    check-cast v12, Lkc1;

    .line 360
    .line 361
    iget-object v14, v12, Lkc1;->r:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v5, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-eqz v14, :cond_a

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_a
    invoke-static/range {p1 .. p1}, Lld1;->I(I)Z

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    if-eqz v14, :cond_b

    .line 375
    .line 376
    new-instance v14, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v15, "Discarding retained Fragment "

    .line 379
    .line 380
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v15, " that was not found in the set of active Fragments "

    .line 387
    .line 388
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    iget-object v15, v1, Lnd1;->n:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 401
    .line 402
    .line 403
    :cond_b
    iget-object v14, v0, Lld1;->N:Lod1;

    .line 404
    .line 405
    invoke-virtual {v14, v12}, Lod1;->f(Lkc1;)V

    .line 406
    .line 407
    .line 408
    iput-object v0, v12, Lkc1;->F:Lld1;

    .line 409
    .line 410
    new-instance v14, Lfe1;

    .line 411
    .line 412
    invoke-direct {v14, v9, v3, v12}, Lfe1;-><init>(Lwo0;Lss0;Lkc1;)V

    .line 413
    .line 414
    .line 415
    iput v8, v14, Lfe1;->e:I

    .line 416
    .line 417
    invoke-virtual {v14}, Lfe1;->k()V

    .line 418
    .line 419
    .line 420
    iput-boolean v8, v12, Lkc1;->y:Z

    .line 421
    .line 422
    invoke-virtual {v14}, Lfe1;->k()V

    .line 423
    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_c
    iget-object v2, v1, Lnd1;->o:Ljava/util/ArrayList;

    .line 427
    .line 428
    iget-object v4, v3, Lss0;->n:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 433
    .line 434
    .line 435
    if-eqz v2, :cond_f

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    move v5, v7

    .line 442
    :goto_6
    if-ge v5, v4, :cond_f

    .line 443
    .line 444
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    add-int/lit8 v5, v5, 0x1

    .line 449
    .line 450
    check-cast v6, Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v3, v6}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    if-eqz v9, :cond_e

    .line 457
    .line 458
    invoke-static/range {p1 .. p1}, Lld1;->I(I)Z

    .line 459
    .line 460
    .line 461
    move-result v12

    .line 462
    if-eqz v12, :cond_d

    .line 463
    .line 464
    new-instance v12, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    const-string v14, "restoreSaveState: added ("

    .line 467
    .line 468
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-static {v13, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_d
    invoke-virtual {v3, v9}, Lss0;->o(Lkc1;)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_e
    const-string v0, "No instantiated fragment for ("

    .line 492
    .line 493
    const-string v1, ")"

    .line 494
    .line 495
    invoke-static {v0, v6, v1}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :cond_f
    iget-object v2, v1, Lnd1;->p:[Lqo;

    .line 504
    .line 505
    if-eqz v2, :cond_13

    .line 506
    .line 507
    new-instance v2, Ljava/util/ArrayList;

    .line 508
    .line 509
    iget-object v4, v1, Lnd1;->p:[Lqo;

    .line 510
    .line 511
    array-length v4, v4

    .line 512
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    iput-object v2, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 516
    .line 517
    move v2, v7

    .line 518
    :goto_7
    iget-object v4, v1, Lnd1;->p:[Lqo;

    .line 519
    .line 520
    array-length v5, v4

    .line 521
    if-ge v2, v5, :cond_14

    .line 522
    .line 523
    aget-object v4, v4, v2

    .line 524
    .line 525
    iget-object v5, v4, Lqo;->o:Ljava/util/ArrayList;

    .line 526
    .line 527
    new-instance v6, Lpo;

    .line 528
    .line 529
    invoke-direct {v6, v0}, Lpo;-><init>(Lld1;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, v6}, Lqo;->a(Lpo;)V

    .line 533
    .line 534
    .line 535
    iget v4, v4, Lqo;->t:I

    .line 536
    .line 537
    iput v4, v6, Lpo;->s:I

    .line 538
    .line 539
    move v4, v7

    .line 540
    :goto_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 541
    .line 542
    .line 543
    move-result v9

    .line 544
    if-ge v4, v9, :cond_11

    .line 545
    .line 546
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    check-cast v9, Ljava/lang/String;

    .line 551
    .line 552
    if-eqz v9, :cond_10

    .line 553
    .line 554
    iget-object v10, v6, Lpo;->a:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v10

    .line 560
    check-cast v10, Lje1;

    .line 561
    .line 562
    invoke-virtual {v3, v9}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    iput-object v9, v10, Lje1;->b:Lkc1;

    .line 567
    .line 568
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_11
    invoke-virtual {v6, v8}, Lpo;->d(I)V

    .line 572
    .line 573
    .line 574
    invoke-static/range {p1 .. p1}, Lld1;->I(I)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-eqz v4, :cond_12

    .line 579
    .line 580
    const-string v4, "restoreAllState: back stack #"

    .line 581
    .line 582
    const-string v5, " (index "

    .line 583
    .line 584
    invoke-static {v2, v4, v5}, Lf34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    iget v5, v6, Lpo;->s:I

    .line 589
    .line 590
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-static {v13, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 604
    .line 605
    .line 606
    new-instance v4, Lfe2;

    .line 607
    .line 608
    invoke-direct {v4}, Lfe2;-><init>()V

    .line 609
    .line 610
    .line 611
    new-instance v5, Ljava/io/PrintWriter;

    .line 612
    .line 613
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 614
    .line 615
    .line 616
    const-string v4, "  "

    .line 617
    .line 618
    invoke-virtual {v6, v4, v5, v7}, Lpo;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 622
    .line 623
    .line 624
    :cond_12
    iget-object v4, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 625
    .line 626
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    add-int/lit8 v2, v2, 0x1

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :cond_13
    iput-object v10, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 633
    .line 634
    :cond_14
    iget-object v2, v0, Lld1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 635
    .line 636
    iget v4, v1, Lnd1;->q:I

    .line 637
    .line 638
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 639
    .line 640
    .line 641
    iget-object v2, v1, Lnd1;->r:Ljava/lang/String;

    .line 642
    .line 643
    if-eqz v2, :cond_15

    .line 644
    .line 645
    invoke-virtual {v3, v2}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    iput-object v2, v0, Lld1;->y:Lkc1;

    .line 650
    .line 651
    invoke-virtual {v0, v2}, Lld1;->q(Lkc1;)V

    .line 652
    .line 653
    .line 654
    :cond_15
    iget-object v2, v1, Lnd1;->s:Ljava/util/ArrayList;

    .line 655
    .line 656
    if-eqz v2, :cond_16

    .line 657
    .line 658
    :goto_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-ge v7, v3, :cond_16

    .line 663
    .line 664
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    check-cast v3, Ljava/lang/String;

    .line 669
    .line 670
    iget-object v4, v1, Lnd1;->t:Ljava/util/ArrayList;

    .line 671
    .line 672
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    check-cast v4, Lro;

    .line 677
    .line 678
    iget-object v5, v0, Lld1;->j:Ljava/util/Map;

    .line 679
    .line 680
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    add-int/lit8 v7, v7, 0x1

    .line 684
    .line 685
    goto :goto_9

    .line 686
    :cond_16
    new-instance v2, Ljava/util/ArrayDeque;

    .line 687
    .line 688
    iget-object v1, v1, Lnd1;->u:Ljava/util/ArrayList;

    .line 689
    .line 690
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 691
    .line 692
    .line 693
    iput-object v2, v0, Lld1;->E:Ljava/util/ArrayDeque;

    .line 694
    .line 695
    return-void
.end method

.method public final W()Landroid/os/Bundle;
    .locals 15

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lld1;->e()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lxm0;

    .line 27
    .line 28
    iget-boolean v5, v2, Lxm0;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Lld1;->I(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const-string v4, "FragmentManager"

    .line 39
    .line 40
    const-string v5, "SpecialEffectsController: Forcing postponed operations"

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v3, v2, Lxm0;->e:Z

    .line 46
    .line 47
    invoke-virtual {v2}, Lxm0;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, Lld1;->e()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lxm0;

    .line 70
    .line 71
    invoke-virtual {v2}, Lxm0;->e()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v1, 0x1

    .line 76
    invoke-virtual {p0, v1}, Lld1;->y(Z)Z

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p0, Lld1;->G:Z

    .line 80
    .line 81
    iget-object v2, p0, Lld1;->N:Lod1;

    .line 82
    .line 83
    iput-boolean v1, v2, Lod1;->g:Z

    .line 84
    .line 85
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v5, v1, Lss0;->o:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :cond_4
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Lfe1;

    .line 122
    .line 123
    if-eqz v6, :cond_4

    .line 124
    .line 125
    iget-object v7, v6, Lfe1;->c:Lkc1;

    .line 126
    .line 127
    iget-object v8, v7, Lkc1;->r:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v6}, Lfe1;->o()Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v1, v8, v6}, Lss0;->G(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    iget-object v6, v7, Lkc1;->r:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    invoke-static {v4}, Lld1;->I(I)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_4

    .line 146
    .line 147
    const-string v6, "FragmentManager"

    .line 148
    .line 149
    new-instance v8, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v9, "Saved state of "

    .line 152
    .line 153
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v9, ": "

    .line 160
    .line 161
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-object v7, v7, Lkc1;->o:Landroid/os/Bundle;

    .line 165
    .line 166
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 178
    .line 179
    iget-object v1, v1, Lss0;->p:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ljava/util/HashMap;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_6

    .line 188
    .line 189
    invoke-static {v4}, Lld1;->I(I)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-eqz p0, :cond_f

    .line 194
    .line 195
    const-string p0, "FragmentManager"

    .line 196
    .line 197
    const-string v1, "saveAllState: no fragments!"

    .line 198
    .line 199
    invoke-static {p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    return-object v0

    .line 203
    :cond_6
    iget-object v5, p0, Lld1;->c:Lss0;

    .line 204
    .line 205
    iget-object v6, v5, Lss0;->n:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v6, Ljava/util/ArrayList;

    .line 208
    .line 209
    monitor-enter v6

    .line 210
    :try_start_0
    iget-object v7, v5, Lss0;->n:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v7, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    const/4 v8, 0x0

    .line 219
    if-eqz v7, :cond_7

    .line 220
    .line 221
    monitor-exit v6

    .line 222
    move-object v7, v8

    .line 223
    goto :goto_4

    .line 224
    :catchall_0
    move-exception p0

    .line 225
    goto/16 :goto_8

    .line 226
    .line 227
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 228
    .line 229
    iget-object v9, v5, Lss0;->n:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v9, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    iget-object v5, v5, Lss0;->n:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v5, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    move v10, v3

    .line 249
    :cond_8
    :goto_3
    if-ge v10, v9, :cond_9

    .line 250
    .line 251
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    add-int/lit8 v10, v10, 0x1

    .line 256
    .line 257
    check-cast v11, Lkc1;

    .line 258
    .line 259
    iget-object v12, v11, Lkc1;->r:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-static {v4}, Lld1;->I(I)Z

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-eqz v12, :cond_8

    .line 269
    .line 270
    const-string v12, "FragmentManager"

    .line 271
    .line 272
    new-instance v13, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v14, "saveAllState: adding fragment ("

    .line 278
    .line 279
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-object v14, v11, Lkc1;->r:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v14, "): "

    .line 288
    .line 289
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    invoke-static {v12, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_9
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    :goto_4
    iget-object v5, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 305
    .line 306
    if-eqz v5, :cond_b

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-lez v5, :cond_b

    .line 313
    .line 314
    new-array v6, v5, [Lqo;

    .line 315
    .line 316
    :goto_5
    if-ge v3, v5, :cond_c

    .line 317
    .line 318
    new-instance v9, Lqo;

    .line 319
    .line 320
    iget-object v10, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    check-cast v10, Lpo;

    .line 327
    .line 328
    invoke-direct {v9, v10}, Lqo;-><init>(Lpo;)V

    .line 329
    .line 330
    .line 331
    aput-object v9, v6, v3

    .line 332
    .line 333
    invoke-static {v4}, Lld1;->I(I)Z

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    if-eqz v9, :cond_a

    .line 338
    .line 339
    const-string v9, "FragmentManager"

    .line 340
    .line 341
    const-string v10, "saveAllState: adding back stack #"

    .line 342
    .line 343
    const-string v11, ": "

    .line 344
    .line 345
    invoke-static {v3, v10, v11}, Lf34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    iget-object v11, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_b
    move-object v6, v8

    .line 369
    :cond_c
    new-instance v3, Lnd1;

    .line 370
    .line 371
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 372
    .line 373
    .line 374
    iput-object v8, v3, Lnd1;->r:Ljava/lang/String;

    .line 375
    .line 376
    new-instance v4, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 379
    .line 380
    .line 381
    iput-object v4, v3, Lnd1;->s:Ljava/util/ArrayList;

    .line 382
    .line 383
    new-instance v5, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 386
    .line 387
    .line 388
    iput-object v5, v3, Lnd1;->t:Ljava/util/ArrayList;

    .line 389
    .line 390
    iput-object v2, v3, Lnd1;->n:Ljava/util/ArrayList;

    .line 391
    .line 392
    iput-object v7, v3, Lnd1;->o:Ljava/util/ArrayList;

    .line 393
    .line 394
    iput-object v6, v3, Lnd1;->p:[Lqo;

    .line 395
    .line 396
    iget-object v2, p0, Lld1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 397
    .line 398
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    iput v2, v3, Lnd1;->q:I

    .line 403
    .line 404
    iget-object v2, p0, Lld1;->y:Lkc1;

    .line 405
    .line 406
    if-eqz v2, :cond_d

    .line 407
    .line 408
    iget-object v2, v2, Lkc1;->r:Ljava/lang/String;

    .line 409
    .line 410
    iput-object v2, v3, Lnd1;->r:Ljava/lang/String;

    .line 411
    .line 412
    :cond_d
    iget-object v2, p0, Lld1;->j:Ljava/util/Map;

    .line 413
    .line 414
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 419
    .line 420
    .line 421
    iget-object v2, p0, Lld1;->j:Ljava/util/Map;

    .line 422
    .line 423
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 428
    .line 429
    .line 430
    new-instance v2, Ljava/util/ArrayList;

    .line 431
    .line 432
    iget-object v4, p0, Lld1;->E:Ljava/util/ArrayDeque;

    .line 433
    .line 434
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 435
    .line 436
    .line 437
    iput-object v2, v3, Lnd1;->u:Ljava/util/ArrayList;

    .line 438
    .line 439
    const-string v2, "state"

    .line 440
    .line 441
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 442
    .line 443
    .line 444
    iget-object v2, p0, Lld1;->k:Ljava/util/Map;

    .line 445
    .line 446
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_e

    .line 459
    .line 460
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    check-cast v3, Ljava/lang/String;

    .line 465
    .line 466
    const-string v4, "result_"

    .line 467
    .line 468
    invoke-static {v4, v3}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    iget-object v5, p0, Lld1;->k:Ljava/util/Map;

    .line 473
    .line 474
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    check-cast v3, Landroid/os/Bundle;

    .line 479
    .line 480
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 481
    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_e
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_f

    .line 497
    .line 498
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, Ljava/lang/String;

    .line 503
    .line 504
    const-string v3, "fragment_"

    .line 505
    .line 506
    invoke-static {v3, v2}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Landroid/os/Bundle;

    .line 515
    .line 516
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 517
    .line 518
    .line 519
    goto :goto_7

    .line 520
    :cond_f
    return-object v0

    .line 521
    :goto_8
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 522
    throw p0
.end method

.method public final X()V
    .locals 3

    .line 1
    iget-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 14
    .line 15
    iget-object v1, v1, Lmc1;->C:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lld1;->O:Lg5;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 23
    .line 24
    iget-object v1, v1, Lmc1;->C:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lld1;->O:Lg5;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lld1;->h0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final Y(Lkc1;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lld1;->E(Lkc1;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p1, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Z(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lld1;->l:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lhd1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lhd1;->n:Lea2;

    .line 12
    .line 13
    iget-object v1, v1, Lea2;->h:Lr92;

    .line 14
    .line 15
    sget-object v2, Lr92;->q:Lr92;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lhd1;->d(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p0, p0, Lld1;->k:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x2

    .line 33
    invoke-static {p0}, Lld1;->I(I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, "Setting fragment result with key "

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " and result "

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "FragmentManager"

    .line 62
    .line 63
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final a(Lkc1;)Lfe1;
    .locals 3

    .line 1
    iget-object v0, p1, Lkc1;->a0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lhe1;->c(Lkc1;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lld1;->I(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lld1;->f(Lkc1;)Lfe1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Lkc1;->F:Lld1;

    .line 39
    .line 40
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lss0;->E(Lfe1;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Lkc1;->N:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Lss0;->o(Lkc1;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Lkc1;->y:Z

    .line 54
    .line 55
    iget-object v2, p1, Lkc1;->T:Landroid/view/View;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iput-boolean v1, p1, Lkc1;->X:Z

    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Lld1;->J(Lkc1;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, Lld1;->F:Z

    .line 69
    .line 70
    :cond_3
    return-object v0
.end method

.method public final a0(Ljava/lang/String;Lle1;Lzd1;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lle1;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, Lle1;->r:Lea2;

    .line 5
    .line 6
    iget-object v0, p2, Lea2;->h:Lr92;

    .line 7
    .line 8
    sget-object v1, Lr92;->n:Lr92;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Led1;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1, p3, p2}, Led1;-><init>(Lld1;Ljava/lang/String;Lzd1;Lea2;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lhd1;

    .line 19
    .line 20
    invoke-direct {v1, p2, p3, v0}, Lhd1;-><init>(Lea2;Lzd1;Led1;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lld1;->l:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lhd1;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lhd1;->n:Lea2;

    .line 34
    .line 35
    iget-object p0, p0, Lhd1;->p:Led1;

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Lea2;->f(Laa2;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 p0, 0x2

    .line 41
    invoke-static {p0}, Lld1;->I(I)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    new-instance p0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "Setting FragmentResultListener with key "

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, " lifecycleOwner "

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " and listener "

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string p1, "FragmentManager"

    .line 78
    .line 79
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {p2, v0}, Lea2;->a(Laa2;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final b(Lmc1;Lfu;Lkc1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    iput-object p1, p0, Lld1;->v:Lmc1;

    .line 6
    .line 7
    iput-object p2, p0, Lld1;->w:Lfu;

    .line 8
    .line 9
    iput-object p3, p0, Lld1;->x:Lkc1;

    .line 10
    .line 11
    iget-object p2, p0, Lld1;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lfd1;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lfd1;-><init>(Lkc1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Lld1;->x:Lkc1;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lld1;->h0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Lmc1;->E:Lnc1;

    .line 39
    .line 40
    invoke-virtual {p2}, Ll70;->i()La93;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lld1;->g:La93;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Lld1;->h:Lbd1;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, La93;->a(Lba2;Lv83;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Lkc1;->F:Lld1;

    .line 60
    .line 61
    iget-object p1, p1, Lld1;->N:Lod1;

    .line 62
    .line 63
    iget-object v0, p1, Lod1;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, Lkc1;->r:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lod1;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, Lod1;

    .line 76
    .line 77
    iget-boolean p1, p1, Lod1;->e:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, Lod1;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Lkc1;->r:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, Lld1;->N:Lod1;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 93
    .line 94
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v0, Lsf0;->b:Lsf0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v1, Lbq4;

    .line 104
    .line 105
    sget-object v2, Lod1;->h:Lun0;

    .line 106
    .line 107
    invoke-direct {v1, p1, v2, v0}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 108
    .line 109
    .line 110
    const-class p1, Lod1;

    .line 111
    .line 112
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lod1;

    .line 133
    .line 134
    iput-object p1, p0, Lld1;->N:Lod1;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 138
    .line 139
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    new-instance p1, Lod1;

    .line 144
    .line 145
    invoke-direct {p1, p2}, Lod1;-><init>(Z)V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Lld1;->N:Lod1;

    .line 149
    .line 150
    :goto_2
    iget-object p1, p0, Lld1;->N:Lod1;

    .line 151
    .line 152
    invoke-virtual {p0}, Lld1;->N()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput-boolean v0, p1, Lod1;->g:Z

    .line 157
    .line 158
    iget-object p1, p0, Lld1;->c:Lss0;

    .line 159
    .line 160
    iget-object v0, p0, Lld1;->N:Lod1;

    .line 161
    .line 162
    iput-object v0, p1, Lss0;->q:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 165
    .line 166
    if-eqz p1, :cond_9

    .line 167
    .line 168
    if-nez p3, :cond_9

    .line 169
    .line 170
    invoke-virtual {p1}, Lmc1;->f()Lrm3;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-instance v0, Lcs0;

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    invoke-direct {v0, v1, p0}, Lcs0;-><init>(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    const-string v1, "android:support:fragments"

    .line 181
    .line 182
    invoke-virtual {p1, v1, v0}, Lrm3;->L(Ljava/lang/String;Li54;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v1}, Lrm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_9

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Lld1;->V(Landroid/os/Bundle;)V

    .line 192
    .line 193
    .line 194
    :cond_9
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 195
    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 199
    .line 200
    iget-object p1, p1, Ll70;->u:Lj70;

    .line 201
    .line 202
    if-eqz p3, :cond_a

    .line 203
    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    iget-object v1, p3, Lkc1;->r:Ljava/lang/String;

    .line 210
    .line 211
    const-string v2, ":"

    .line 212
    .line 213
    invoke-static {v0, v1, v2}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    goto :goto_3

    .line 218
    :cond_a
    const-string v0, ""

    .line 219
    .line 220
    :goto_3
    const-string v1, "FragmentManager:"

    .line 221
    .line 222
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const-string v1, "StartActivityForResult"

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v2, Lq5;

    .line 233
    .line 234
    const/4 v3, 0x2

    .line 235
    invoke-direct {v2, v3}, Lq5;-><init>(I)V

    .line 236
    .line 237
    .line 238
    new-instance v3, Lhg3;

    .line 239
    .line 240
    const/16 v4, 0x13

    .line 241
    .line 242
    invoke-direct {v3, v4, p0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v1, v2, v3}, Lj70;->c(Ljava/lang/String;Lsu3;Lp5;)Lw5;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iput-object v1, p0, Lld1;->B:Lw5;

    .line 250
    .line 251
    const-string v1, "StartIntentSenderForResult"

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    new-instance v2, Lq5;

    .line 258
    .line 259
    const/4 v3, 0x3

    .line 260
    invoke-direct {v2, v3}, Lq5;-><init>(I)V

    .line 261
    .line 262
    .line 263
    new-instance v3, Lzg5;

    .line 264
    .line 265
    invoke-direct {v3, p0}, Lzg5;-><init>(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v1, v2, v3}, Lj70;->c(Ljava/lang/String;Lsu3;Lp5;)Lw5;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    iput-object v1, p0, Lld1;->C:Lw5;

    .line 273
    .line 274
    const-string v1, "RequestPermissions"

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v1, Lq5;

    .line 281
    .line 282
    invoke-direct {v1, p2}, Lq5;-><init>(I)V

    .line 283
    .line 284
    .line 285
    new-instance p2, Lzh0;

    .line 286
    .line 287
    const/16 v2, 0x19

    .line 288
    .line 289
    invoke-direct {p2, v2, p0}, Lzh0;-><init>(ILjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, v0, v1, p2}, Lj70;->c(Ljava/lang/String;Lsu3;Lp5;)Lw5;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iput-object p1, p0, Lld1;->D:Lw5;

    .line 297
    .line 298
    :cond_b
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 299
    .line 300
    if-eqz p1, :cond_c

    .line 301
    .line 302
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 303
    .line 304
    iget-object p2, p0, Lld1;->p:Lad1;

    .line 305
    .line 306
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object p1, p1, Ll70;->v:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 310
    .line 311
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    :cond_c
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 315
    .line 316
    if-eqz p1, :cond_d

    .line 317
    .line 318
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 319
    .line 320
    iget-object p2, p0, Lld1;->q:Lad1;

    .line 321
    .line 322
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iget-object p1, p1, Ll70;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 326
    .line 327
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_d
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 331
    .line 332
    if-eqz p1, :cond_e

    .line 333
    .line 334
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 335
    .line 336
    iget-object p2, p0, Lld1;->r:Lad1;

    .line 337
    .line 338
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object p1, p1, Ll70;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 342
    .line 343
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    :cond_e
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 347
    .line 348
    if-eqz p1, :cond_f

    .line 349
    .line 350
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 351
    .line 352
    iget-object p2, p0, Lld1;->s:Lad1;

    .line 353
    .line 354
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object p1, p1, Ll70;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 358
    .line 359
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    :cond_f
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 363
    .line 364
    if-eqz p1, :cond_10

    .line 365
    .line 366
    if-nez p3, :cond_10

    .line 367
    .line 368
    iget-object p1, p1, Lmc1;->E:Lnc1;

    .line 369
    .line 370
    iget-object p0, p0, Lld1;->t:Lcd1;

    .line 371
    .line 372
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget-object p1, p1, Ll70;->p:Lr20;

    .line 376
    .line 377
    iget-object p2, p1, Lr20;->p:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 380
    .line 381
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    iget-object p0, p1, Lr20;->o:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast p0, Ljava/lang/Runnable;

    .line 387
    .line 388
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 389
    .line 390
    .line 391
    :cond_10
    return-void

    .line 392
    :cond_11
    const-string p0, "Already attached"

    .line 393
    .line 394
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-void
.end method

.method public final b0(Lkc1;Lr92;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lkc1;->r:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, Lkc1;->G:Lmc1;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lkc1;->F:Lld1;

    .line 16
    .line 17
    if-ne v0, p0, :cond_1

    .line 18
    .line 19
    :cond_0
    iput-object p2, p1, Lkc1;->b0:Lr92;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p2, "Fragment "

    .line 23
    .line 24
    const-string v0, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {p2, p1, v0, p0}, Ltb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c(Lkc1;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lld1;->I(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Lkc1;->N:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Lkc1;->N:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lkc1;->x:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lss0;->o(Lkc1;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lld1;->I(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lld1;->J(Lkc1;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Lld1;->F:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final c0(Lkc1;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lkc1;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Lkc1;->G:Lmc1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Lkc1;->F:Lld1;

    .line 18
    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "Fragment "

    .line 23
    .line 24
    const-string v1, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {v0, p1, v1, p0}, Ltb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lld1;->y:Lkc1;

    .line 31
    .line 32
    iput-object p1, p0, Lld1;->y:Lkc1;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lld1;->q(Lkc1;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lld1;->y:Lkc1;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lld1;->q(Lkc1;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lld1;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d0(Lkc1;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lld1;->E(Lkc1;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_7

    .line 6
    .line 7
    iget-object v0, p1, Lkc1;->W:Lhc1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v2, v0, Lhc1;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    move v3, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v3, v0, Lhc1;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v3, v2

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move v2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v2, v0, Lhc1;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v2, v3

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v0, v0, Lhc1;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v0, v2

    .line 37
    if-lez v0, :cond_7

    .line 38
    .line 39
    const v0, 0x7f0a065e

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lkc1;

    .line 56
    .line 57
    iget-object p1, p1, Lkc1;->W:Lhc1;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v1, p1, Lhc1;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, p0, Lkc1;->W:Lhc1;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {p0}, Lkc1;->k()Lhc1;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iput-boolean v1, p0, Lhc1;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lss0;->v()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Lfe1;

    .line 26
    .line 27
    iget-object v4, v4, Lfe1;->c:Lkc1;

    .line 28
    .line 29
    iget-object v4, v4, Lkc1;->S:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lld1;->G()Ly41;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const v5, 0x7f0a05a9

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    instance-of v7, v6, Lxm0;

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    check-cast v6, Lxm0;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance v6, Lxm0;

    .line 55
    .line 56
    invoke-direct {v6, v4}, Lxm0;-><init>(Landroid/view/ViewGroup;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v0
.end method

.method public final f(Lkc1;)Lfe1;
    .locals 3

    .line 1
    iget-object v0, p1, Lkc1;->r:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 4
    .line 5
    iget-object v2, v1, Lss0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lfe1;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lfe1;

    .line 19
    .line 20
    iget-object v2, p0, Lld1;->n:Lwo0;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Lfe1;-><init>(Lwo0;Lss0;Lkc1;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lld1;->v:Lmc1;

    .line 26
    .line 27
    iget-object p1, p1, Lmc1;->B:Lnc1;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lfe1;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lld1;->u:I

    .line 37
    .line 38
    iput p0, v0, Lfe1;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final f0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lld1;->c:Lss0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lss0;->v()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    check-cast v4, Lfe1;

    .line 22
    .line 23
    iget-object v5, v4, Lfe1;->c:Lkc1;

    .line 24
    .line 25
    iget-boolean v6, v5, Lkc1;->U:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Lld1;->b:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iput-boolean v4, p0, Lld1;->J:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-boolean v2, v5, Lkc1;->U:Z

    .line 38
    .line 39
    invoke-virtual {v4}, Lfe1;->k()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final g(Lkc1;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Lld1;->I(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Lkc1;->N:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Lkc1;->N:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Lkc1;->x:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Lld1;->I(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lld1;->c:Lss0;

    .line 62
    .line 63
    iget-object v1, v0, Lss0;->n:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Lkc1;->x:Z

    .line 78
    .line 79
    invoke-static {p1}, Lld1;->J(Lkc1;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Lld1;->F:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lld1;->d0(Lkc1;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p0

    .line 94
    :cond_3
    return-void
.end method

.method public final g0(Ljava/lang/RuntimeException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Lfe2;

    .line 16
    .line 17
    invoke-direct {v0}, Lfe2;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array p0, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, p0}, Lnc1;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, Lld1;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception p0

    .line 55
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
.end method

.method public final h(ZLandroid/content/res/Configuration;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 21
    .line 22
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkc1;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Lkc1;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {v0, v1, p2}, Lld1;->h(ZLandroid/content/res/Configuration;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    return-void
.end method

.method public final h0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lld1;->h:Lbd1;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lv83;->c(Z)V

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object v0, p0, Lld1;->h:Lbd1;

    .line 24
    .line 25
    iget-object v1, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v3

    .line 36
    :goto_0
    if-lez v1, :cond_2

    .line 37
    .line 38
    iget-object p0, p0, Lld1;->x:Lkc1;

    .line 39
    .line 40
    invoke-static {p0}, Lld1;->M(Lkc1;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v2, v3

    .line 48
    :goto_1
    invoke-virtual {v0, v2}, Lv83;->c(Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p0
.end method

.method public final i()Z
    .locals 4

    .line 1
    iget v0, p0, Lld1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lkc1;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lkc1;->M:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 37
    .line 38
    invoke-virtual {v0}, Lld1;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final j(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 8

    .line 1
    iget v0, p0, Lld1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lld1;->c:Lss0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lss0;->x()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_5

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lkc1;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lld1;->L(Lkc1;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Lkc1;->M:Z

    .line 41
    .line 42
    if-nez v6, :cond_3

    .line 43
    .line 44
    iget-boolean v6, v5, Lkc1;->P:Z

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    iget-boolean v6, v5, Lkc1;->Q:Z

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    invoke-virtual {v5, p1, p2}, Lkc1;->G(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 53
    .line 54
    .line 55
    move v6, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v6, v1

    .line 58
    :goto_1
    iget-object v7, v5, Lkc1;->H:Lmd1;

    .line 59
    .line 60
    invoke-virtual {v7, p1, p2}, Lld1;->j(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    or-int/2addr v6, v7

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v6, v1

    .line 67
    :goto_2
    if-eqz v6, :cond_1

    .line 68
    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    new-instance v3, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move v4, v2

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    iget-object p1, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 82
    .line 83
    if-eqz p1, :cond_8

    .line 84
    .line 85
    :goto_3
    iget-object p1, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-ge v1, p1, :cond_8

    .line 92
    .line 93
    iget-object p1, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lkc1;

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_7

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    iput-object v3, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 116
    .line 117
    return v4
.end method

.method public final k()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lld1;->I:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lld1;->y(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lld1;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lxm0;

    .line 26
    .line 27
    invoke-virtual {v2}, Lxm0;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 32
    .line 33
    iget-object v2, p0, Lld1;->c:Lss0;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v2, Lss0;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lod1;

    .line 40
    .line 41
    iget-boolean v0, v0, Lod1;->f:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v1, v1, Lmc1;->B:Lnc1;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/2addr v0, v1

    .line 53
    :cond_2
    :goto_1
    if-eqz v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Lld1;->j:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lro;

    .line 76
    .line 77
    iget-object v1, v1, Lro;->n:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v4, 0x0

    .line 84
    move v5, v4

    .line 85
    :goto_2
    if-ge v5, v3, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    check-cast v6, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v7, v2, Lss0;->q:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, Lod1;

    .line 98
    .line 99
    invoke-virtual {v7, v6, v4}, Lod1;->d(Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    const/4 v0, -0x1

    .line 104
    invoke-virtual {p0, v0}, Lld1;->t(I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 112
    .line 113
    iget-object v1, p0, Lld1;->q:Lad1;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, Ll70;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_5
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 124
    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 128
    .line 129
    iget-object v1, p0, Lld1;->p:Lad1;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v0, v0, Ll70;->v:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 144
    .line 145
    iget-object v1, p0, Lld1;->r:Lad1;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v0, v0, Ll70;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_7
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 160
    .line 161
    iget-object v1, p0, Lld1;->s:Lad1;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v0, v0, Ll70;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_8
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    iget-object v1, p0, Lld1;->x:Lkc1;

    .line 176
    .line 177
    if-nez v1, :cond_a

    .line 178
    .line 179
    iget-object v0, v0, Lmc1;->E:Lnc1;

    .line 180
    .line 181
    iget-object v1, p0, Lld1;->t:Lcd1;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, Ll70;->p:Lr20;

    .line 187
    .line 188
    iget-object v2, v0, Lr20;->p:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    iget-object v2, v0, Lr20;->q:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-nez v1, :cond_9

    .line 204
    .line 205
    iget-object v0, v0, Lr20;->o:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Ljava/lang/Runnable;

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_9
    invoke-static {}, Lkf2;->k()V

    .line 214
    .line 215
    .line 216
    :cond_a
    :goto_3
    const/4 v0, 0x0

    .line 217
    iput-object v0, p0, Lld1;->v:Lmc1;

    .line 218
    .line 219
    iput-object v0, p0, Lld1;->w:Lfu;

    .line 220
    .line 221
    iput-object v0, p0, Lld1;->x:Lkc1;

    .line 222
    .line 223
    iget-object v1, p0, Lld1;->g:La93;

    .line 224
    .line 225
    if-eqz v1, :cond_b

    .line 226
    .line 227
    iget-object v1, p0, Lld1;->h:Lbd1;

    .line 228
    .line 229
    invoke-virtual {v1}, Lv83;->b()V

    .line 230
    .line 231
    .line 232
    iput-object v0, p0, Lld1;->g:La93;

    .line 233
    .line 234
    :cond_b
    iget-object v0, p0, Lld1;->B:Lw5;

    .line 235
    .line 236
    if-eqz v0, :cond_c

    .line 237
    .line 238
    invoke-virtual {v0}, Lw5;->b()V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lld1;->C:Lw5;

    .line 242
    .line 243
    invoke-virtual {v0}, Lw5;->b()V

    .line 244
    .line 245
    .line 246
    iget-object p0, p0, Lld1;->D:Lw5;

    .line 247
    .line 248
    invoke-virtual {p0}, Lw5;->b()V

    .line 249
    .line 250
    .line 251
    :cond_c
    return-void
.end method

.method public final l(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 21
    .line 22
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkc1;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lkc1;->R:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lld1;->l(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 21
    .line 22
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkc1;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lld1;->m(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lss0;->w()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Lkc1;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Lkc1;->z()Z

    .line 25
    .line 26
    .line 27
    iget-object v2, v2, Lkc1;->H:Lmd1;

    .line 28
    .line 29
    invoke-virtual {v2}, Lld1;->n()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final o(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    iget v0, p0, Lld1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lkc1;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lkc1;->M:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    iget-boolean v3, v0, Lkc1;->P:Z

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-boolean v3, v0, Lkc1;->Q:Z

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lkc1;->N(Landroid/view/MenuItem;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    move v0, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lld1;->o(Landroid/view/MenuItem;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move v0, v1

    .line 60
    :goto_0
    if-eqz v0, :cond_1

    .line 61
    .line 62
    return v2

    .line 63
    :cond_4
    :goto_1
    return v1
.end method

.method public final p()V
    .locals 2

    .line 1
    iget v0, p0, Lld1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lkc1;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v0, Lkc1;->M:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 36
    .line 37
    invoke-virtual {v0}, Lld1;->p()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(Lkc1;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p1, Lkc1;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lss0;->t(Ljava/lang/String;)Lkc1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eq p1, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p1, Lkc1;->F:Lld1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lld1;->M(Lkc1;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iget-object v0, p1, Lkc1;->w:Ljava/lang/Boolean;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eq v0, p0, :cond_2

    .line 32
    .line 33
    :cond_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p1, Lkc1;->w:Ljava/lang/Boolean;

    .line 38
    .line 39
    iget-object p0, p1, Lkc1;->H:Lmd1;

    .line 40
    .line 41
    invoke-virtual {p0}, Lld1;->h0()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lld1;->y:Lkc1;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lld1;->q(Lkc1;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void
.end method

.method public final r(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 21
    .line 22
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkc1;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lkc1;->H:Lmd1;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lld1;->r(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final s()Z
    .locals 5

    .line 1
    iget v0, p0, Lld1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lss0;->x()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move v0, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lkc1;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Lld1;->L(Lkc1;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget-boolean v4, v3, Lkc1;->M:Z

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    iget-boolean v4, v3, Lkc1;->P:Z

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-boolean v4, v3, Lkc1;->Q:Z

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    move v4, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v4, v1

    .line 54
    :goto_1
    iget-object v3, v3, Lkc1;->H:Lmd1;

    .line 55
    .line 56
    invoke-virtual {v3}, Lld1;->s()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    or-int/2addr v3, v4

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v3, v1

    .line 63
    :goto_2
    if-eqz v3, :cond_1

    .line 64
    .line 65
    move v0, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    return v0
.end method

.method public final t(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lld1;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lld1;->c:Lss0;

    .line 6
    .line 7
    iget-object v2, v2, Lss0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lfe1;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Lfe1;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lld1;->O(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lld1;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lxm0;

    .line 58
    .line 59
    invoke-virtual {v2}, Lxm0;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Lld1;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lld1;->y(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lld1;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lld1;->x:Lkc1;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lld1;->x:Lkc1;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lld1;->v:Lmc1;

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string p0, "null"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string p0, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lld1;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lld1;->J:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lld1;->f0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "    "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lld1;->c:Lss0;

    .line 19
    .line 20
    iget-object v2, v1, Lss0;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v4, "    "

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v1, v1, Lss0;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v4, "Active Fragments:"

    .line 55
    .line 56
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lfe1;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    iget-object v4, v4, Lfe1;->c:Lkc1;

    .line 85
    .line 86
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v3, p2, p3, p4}, Lkc1;->j(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const-string v4, "null"

    .line 94
    .line 95
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    const/4 p4, 0x0

    .line 104
    if-lez p2, :cond_2

    .line 105
    .line 106
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v1, "Added Fragments:"

    .line 110
    .line 111
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move v1, p4

    .line 115
    :goto_1
    if-ge v1, p2, :cond_2

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Lkc1;

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v4, "  #"

    .line 127
    .line 128
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 132
    .line 133
    .line 134
    const-string v4, ": "

    .line 135
    .line 136
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lkc1;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    iget-object p2, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 150
    .line 151
    if-eqz p2, :cond_3

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-lez p2, :cond_3

    .line 158
    .line 159
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v1, "Fragments Created Menus:"

    .line 163
    .line 164
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move v1, p4

    .line 168
    :goto_2
    if-ge v1, p2, :cond_3

    .line 169
    .line 170
    iget-object v2, p0, Lld1;->e:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Lkc1;

    .line 177
    .line 178
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v3, "  #"

    .line 182
    .line 183
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 187
    .line 188
    .line 189
    const-string v3, ": "

    .line 190
    .line 191
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Lkc1;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_3
    iget-object p2, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 205
    .line 206
    if-eqz p2, :cond_4

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    if-lez p2, :cond_4

    .line 213
    .line 214
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "Back Stack:"

    .line 218
    .line 219
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    move v1, p4

    .line 223
    :goto_3
    if-ge v1, p2, :cond_4

    .line 224
    .line 225
    iget-object v2, p0, Lld1;->d:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Lpo;

    .line 232
    .line 233
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v3, "  #"

    .line 237
    .line 238
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 242
    .line 243
    .line 244
    const-string v3, ": "

    .line 245
    .line 246
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Lpo;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const/4 v3, 0x1

    .line 257
    invoke-virtual {v2, v0, p3, v3}, Lpo;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 258
    .line 259
    .line 260
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    new-instance p2, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v0, "Back Stack Index: "

    .line 269
    .line 270
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lld1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    iget-object p2, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 290
    .line 291
    monitor-enter p2

    .line 292
    :try_start_0
    iget-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-lez v0, :cond_5

    .line 299
    .line 300
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const-string v1, "Pending Actions:"

    .line 304
    .line 305
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_4
    if-ge p4, v0, :cond_5

    .line 309
    .line 310
    iget-object v1, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Lid1;

    .line 317
    .line 318
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string v2, "  #"

    .line 322
    .line 323
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 327
    .line 328
    .line 329
    const-string v2, ": "

    .line 330
    .line 331
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    add-int/lit8 p4, p4, 0x1

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :catchall_0
    move-exception p0

    .line 341
    goto :goto_5

    .line 342
    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 343
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string p2, "FragmentManager misc state:"

    .line 347
    .line 348
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    const-string p2, "  mHost="

    .line 355
    .line 356
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    iget-object p2, p0, Lld1;->v:Lmc1;

    .line 360
    .line 361
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const-string p2, "  mContainer="

    .line 368
    .line 369
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object p2, p0, Lld1;->w:Lfu;

    .line 373
    .line 374
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object p2, p0, Lld1;->x:Lkc1;

    .line 378
    .line 379
    if-eqz p2, :cond_6

    .line 380
    .line 381
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    const-string p2, "  mParent="

    .line 385
    .line 386
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object p2, p0, Lld1;->x:Lkc1;

    .line 390
    .line 391
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-string p2, "  mCurState="

    .line 398
    .line 399
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget p2, p0, Lld1;->u:I

    .line 403
    .line 404
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 405
    .line 406
    .line 407
    const-string p2, " mStateSaved="

    .line 408
    .line 409
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-boolean p2, p0, Lld1;->G:Z

    .line 413
    .line 414
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 415
    .line 416
    .line 417
    const-string p2, " mStopped="

    .line 418
    .line 419
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    iget-boolean p2, p0, Lld1;->H:Z

    .line 423
    .line 424
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 425
    .line 426
    .line 427
    const-string p2, " mDestroyed="

    .line 428
    .line 429
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget-boolean p2, p0, Lld1;->I:Z

    .line 433
    .line 434
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 435
    .line 436
    .line 437
    iget-boolean p2, p0, Lld1;->F:Z

    .line 438
    .line 439
    if-eqz p2, :cond_7

    .line 440
    .line 441
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const-string p1, "  mNeedMenuInvalidate="

    .line 445
    .line 446
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iget-boolean p0, p0, Lld1;->F:Z

    .line 450
    .line 451
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    .line 452
    .line 453
    .line 454
    :cond_7
    return-void

    .line 455
    :goto_5
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 456
    throw p0
.end method

.method public final w(Lid1;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Lld1;->I:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0}, Lld1;->N()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 31
    .line 32
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    :goto_0
    iget-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "Activity has been destroyed"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_5
    iget-object p2, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lld1;->X()V

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lld1;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Lld1;->I:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 30
    .line 31
    iget-object v1, v1, Lmc1;->C:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lld1;->N()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 49
    .line 50
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    :goto_0
    iget-object p1, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 71
    .line 72
    :cond_4
    return-void

    .line 73
    :cond_5
    const-string p0, "Must be called from main thread of fragment host"

    .line 74
    .line 75
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    const-string p0, "FragmentManager is already executing transactions"

    .line 80
    .line 81
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final y(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lld1;->x(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_4

    .line 26
    :cond_0
    :try_start_1
    iget-object v4, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    move v5, p1

    .line 33
    move v6, v5

    .line 34
    :goto_1
    iget-object v7, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-ge v5, v4, :cond_1

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lid1;

    .line 43
    .line 44
    invoke-interface {v7, v1, v2}, Lid1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 45
    .line 46
    .line 47
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    or-int/2addr v6, v7

    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lld1;->v:Lmc1;

    .line 58
    .line 59
    iget-object v1, v1, Lmc1;->C:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object v2, p0, Lld1;->O:Lg5;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    :goto_2
    if-eqz v6, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Lld1;->b:Z

    .line 71
    .line 72
    :try_start_4
    iget-object v1, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object v2, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p0, v1, v2}, Lld1;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lld1;->d()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_2
    move-exception p1

    .line 84
    invoke-virtual {p0}, Lld1;->d()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-virtual {p0}, Lld1;->h0()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lld1;->u()V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 95
    .line 96
    iget-object p0, p0, Lss0;->o:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 110
    .line 111
    .line 112
    return v0

    .line 113
    :goto_3
    :try_start_5
    iget-object v0, p0, Lld1;->a:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 119
    .line 120
    iget-object v0, v0, Lmc1;->C:Landroid/os/Handler;

    .line 121
    .line 122
    iget-object p0, p0, Lld1;->O:Lg5;

    .line 123
    .line 124
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :goto_4
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 129
    throw p0
.end method

.method public final z(Lpo;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lld1;->v:Lmc1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lld1;->I:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Lld1;->x(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lpo;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lld1;->b:Z

    .line 24
    .line 25
    :try_start_0
    iget-object p1, p0, Lld1;->K:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object p2, p0, Lld1;->L:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lld1;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lld1;->d()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lld1;->h0()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lld1;->u()V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lld1;->c:Lss0;

    .line 42
    .line 43
    iget-object p0, p0, Lss0;->o:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    invoke-virtual {p0}, Lld1;->d()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method
