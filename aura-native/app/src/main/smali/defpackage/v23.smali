.class public final Ldefpackage/v23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:Ljava/util/ArrayList;

.field public final B:Ldefpackage/rp4;

.field public final C:Ldefpackage/cd4;

.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/Activity;

.field public c:Ldefpackage/t23;

.field public d:Landroid/os/Bundle;

.field public e:[Landroid/os/Parcelable;

.field public f:Z

.field public final g:Ldefpackage/ii;

.field public final h:Ldefpackage/nl4;

.field public final i:Ldefpackage/nl4;

.field public final j:Ljava/util/LinkedHashMap;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/LinkedHashMap;

.field public n:Ldefpackage/ba2;

.field public o:Ldefpackage/j23;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public q:Ldefpackage/r92;

.field public final r:Ldefpackage/pd1;

.field public final s:Ldefpackage/bd1;

.field public final t:Z

.field public final u:Ldefpackage/u43;

.field public final v:Ljava/util/LinkedHashMap;

.field public w:Ldefpackage/if1;

.field public x:Ldefpackage/f23;

.field public final y:Ljava/util/LinkedHashMap;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Ldefpackage/k5;->s:Ldefpackage/k5;

    .line 7
    .line 8
    invoke-static {v0, p1}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ldefpackage/aa4;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Landroid/content/Context;

    .line 28
    .line 29
    instance-of v1, v1, Landroid/app/Activity;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_0
    check-cast v0, Landroid/app/Activity;

    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/v23;->b:Landroid/app/Activity;

    .line 38
    .line 39
    new-instance p1, Ldefpackage/ii;

    .line 40
    .line 41
    invoke-direct {p1}, Ldefpackage/ii;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 45
    .line 46
    sget-object p1, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 47
    .line 48
    invoke-static {p1}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Ldefpackage/v23;->h:Ldefpackage/nl4;

    .line 53
    .line 54
    invoke-static {p1}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Ldefpackage/v23;->i:Ldefpackage/nl4;

    .line 59
    .line 60
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Ldefpackage/v23;->j:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Ldefpackage/v23;->k:Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Ldefpackage/v23;->l:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Ldefpackage/v23;->m:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Ldefpackage/v23;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    sget-object p1, Ldefpackage/r92;->o:Ldefpackage/r92;

    .line 96
    .line 97
    iput-object p1, p0, Ldefpackage/v23;->q:Ldefpackage/r92;

    .line 98
    .line 99
    new-instance p1, Ldefpackage/pd1;

    .line 100
    .line 101
    const/4 v0, 0x1

    .line 102
    invoke-direct {p1, v0, p0}, Ldefpackage/pd1;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Ldefpackage/v23;->r:Ldefpackage/pd1;

    .line 106
    .line 107
    new-instance p1, Ldefpackage/bd1;

    .line 108
    .line 109
    const/4 v1, 0x5

    .line 110
    invoke-direct {p1, v1, p0}, Ldefpackage/bd1;-><init>(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Ldefpackage/v23;->s:Ldefpackage/bd1;

    .line 114
    .line 115
    iput-boolean v0, p0, Ldefpackage/v23;->t:Z

    .line 116
    .line 117
    new-instance p1, Ldefpackage/u43;

    .line 118
    .line 119
    invoke-direct {p1}, Ldefpackage/u43;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 123
    .line 124
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v1, p0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 130
    .line 131
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v1, p0, Ldefpackage/v23;->y:Ljava/util/LinkedHashMap;

    .line 137
    .line 138
    new-instance v1, Ldefpackage/u23;

    .line 139
    .line 140
    invoke-direct {v1, p1}, Ldefpackage/u23;-><init>(Ldefpackage/u43;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ldefpackage/u43;->a(Ldefpackage/t43;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Ldefpackage/l5;

    .line 147
    .line 148
    iget-object v2, p0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 149
    .line 150
    invoke-direct {v1, v2}, Ldefpackage/l5;-><init>(Landroid/content/Context;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1}, Ldefpackage/u43;->a(Ldefpackage/t43;)V

    .line 154
    .line 155
    .line 156
    new-instance p1, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object p1, p0, Ldefpackage/v23;->A:Ljava/util/ArrayList;

    .line 162
    .line 163
    new-instance p1, Ldefpackage/zf0;

    .line 164
    .line 165
    const/4 v1, 0x3

    .line 166
    invoke-direct {p1, v1, p0}, Ldefpackage/zf0;-><init>(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Ldefpackage/rp4;

    .line 170
    .line 171
    invoke-direct {v1, p1}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 172
    .line 173
    .line 174
    iput-object v1, p0, Ldefpackage/v23;->B:Ldefpackage/rp4;

    .line 175
    .line 176
    sget-object p1, Ldefpackage/wv;->o:Ldefpackage/wv;

    .line 177
    .line 178
    const/4 v1, 0x0

    .line 179
    invoke-static {v0, v1, p1}, Ldefpackage/g12;->a(IILdefpackage/wv;)Ldefpackage/cd4;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iput-object p1, p0, Ldefpackage/v23;->C:Ldefpackage/cd4;

    .line 184
    .line 185
    return-void
.end method

.method public static e(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;
    .locals 2

    .line 1
    iget v0, p1, Ldefpackage/r23;->u:I

    .line 2
    .line 3
    if-ne v0, p0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Ldefpackage/r23;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 14
    .line 15
    iget-object v1, p2, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Ldefpackage/t23;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p1, Ldefpackage/t23;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object p1, p1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p1, p0, p1, p2, p3}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static synthetic s(Ldefpackage/v23;Ldefpackage/a23;)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ii;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ii;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, p1, v1, v0}, Ldefpackage/v23;->r(Ldefpackage/a23;ZLdefpackage/ii;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/a23;Ljava/util/List;)V
    .locals 16

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
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v3, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 12
    .line 13
    instance-of v6, v5, Ldefpackage/rp0;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v9, v0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 18
    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Ldefpackage/a23;

    .line 32
    .line 33
    iget-object v6, v6, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 34
    .line 35
    instance-of v6, v6, Ldefpackage/rp0;

    .line 36
    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ldefpackage/a23;

    .line 44
    .line 45
    iget-object v6, v6, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 46
    .line 47
    iget v6, v6, Ldefpackage/r23;->u:I

    .line 48
    .line 49
    invoke-virtual {v0, v6, v8, v7}, Ldefpackage/v23;->q(IZZ)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_0

    .line 54
    .line 55
    :cond_1
    new-instance v6, Ldefpackage/ii;

    .line 56
    .line 57
    invoke-direct {v6}, Ldefpackage/ii;-><init>()V

    .line 58
    .line 59
    .line 60
    instance-of v10, v1, Ldefpackage/t23;

    .line 61
    .line 62
    iget-object v11, v0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    if-eqz v10, :cond_7

    .line 66
    .line 67
    move-object v10, v5

    .line 68
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v10, v10, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 72
    .line 73
    if-eqz v10, :cond_6

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    invoke-interface {v4, v13}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    :cond_3
    invoke-interface {v13}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-eqz v14, :cond_4

    .line 88
    .line 89
    invoke-interface {v13}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    move-object v15, v14

    .line 94
    check-cast v15, Ldefpackage/a23;

    .line 95
    .line 96
    iget-object v15, v15, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 97
    .line 98
    invoke-static {v15, v10}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    if-eqz v15, :cond_3

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    move-object v14, v12

    .line 106
    :goto_0
    check-cast v14, Ldefpackage/a23;

    .line 107
    .line 108
    if-nez v14, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    iget-object v14, v0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 115
    .line 116
    invoke-static {v11, v10, v2, v13, v14}, Ldefpackage/tv1;->v(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    :cond_5
    invoke-virtual {v6, v14}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    if-nez v13, :cond_6

    .line 128
    .line 129
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    check-cast v13, Ldefpackage/a23;

    .line 134
    .line 135
    iget-object v13, v13, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 136
    .line 137
    if-ne v13, v10, :cond_6

    .line 138
    .line 139
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    check-cast v13, Ldefpackage/a23;

    .line 144
    .line 145
    invoke-static {v0, v13}, Ldefpackage/v23;->s(Ldefpackage/v23;Ldefpackage/a23;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    if-eqz v10, :cond_7

    .line 149
    .line 150
    if-ne v10, v1, :cond_2

    .line 151
    .line 152
    :cond_7
    invoke-virtual {v6}, Ldefpackage/ii;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-eqz v10, :cond_8

    .line 157
    .line 158
    move-object v10, v5

    .line 159
    goto :goto_1

    .line 160
    :cond_8
    invoke-virtual {v6}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    check-cast v10, Ldefpackage/a23;

    .line 165
    .line 166
    iget-object v10, v10, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 167
    .line 168
    :goto_1
    if-eqz v10, :cond_e

    .line 169
    .line 170
    iget v13, v10, Ldefpackage/r23;->u:I

    .line 171
    .line 172
    invoke-virtual {v0, v13, v10}, Ldefpackage/v23;->d(ILdefpackage/r23;)Ldefpackage/r23;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    if-eq v13, v10, :cond_e

    .line 177
    .line 178
    iget-object v10, v10, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 179
    .line 180
    if-eqz v10, :cond_d

    .line 181
    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    if-ne v13, v8, :cond_9

    .line 189
    .line 190
    move-object v13, v12

    .line 191
    goto :goto_2

    .line 192
    :cond_9
    move-object v13, v2

    .line 193
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    invoke-interface {v4, v14}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    :goto_3
    invoke-interface {v14}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    if-eqz v15, :cond_b

    .line 206
    .line 207
    invoke-interface {v14}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    move-object v7, v15

    .line 212
    check-cast v7, Ldefpackage/a23;

    .line 213
    .line 214
    iget-object v7, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 215
    .line 216
    invoke-static {v7, v10}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-eqz v7, :cond_a

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_a
    const/4 v7, 0x0

    .line 224
    goto :goto_3

    .line 225
    :cond_b
    move-object v15, v12

    .line 226
    :goto_4
    check-cast v15, Ldefpackage/a23;

    .line 227
    .line 228
    if-nez v15, :cond_c

    .line 229
    .line 230
    invoke-virtual {v10, v13}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual {v0}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    iget-object v14, v0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 239
    .line 240
    invoke-static {v11, v10, v7, v13, v14}, Ldefpackage/tv1;->v(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    :cond_c
    invoke-virtual {v6, v15}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_d
    const/4 v7, 0x0

    .line 248
    goto :goto_1

    .line 249
    :cond_e
    invoke-virtual {v6}, Ldefpackage/ii;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_f

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_f
    invoke-virtual {v6}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    check-cast v5, Ldefpackage/a23;

    .line 261
    .line 262
    iget-object v5, v5, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 263
    .line 264
    :goto_5
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    if-nez v7, :cond_10

    .line 269
    .line 270
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    check-cast v7, Ldefpackage/a23;

    .line 275
    .line 276
    iget-object v7, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 277
    .line 278
    instance-of v7, v7, Ldefpackage/t23;

    .line 279
    .line 280
    if-eqz v7, :cond_10

    .line 281
    .line 282
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    check-cast v7, Ldefpackage/a23;

    .line 287
    .line 288
    iget-object v7, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    check-cast v7, Ldefpackage/t23;

    .line 294
    .line 295
    iget-object v7, v7, Ldefpackage/t23;->x:Ldefpackage/mj4;

    .line 296
    .line 297
    iget v8, v5, Ldefpackage/r23;->u:I

    .line 298
    .line 299
    invoke-virtual {v7, v8}, Ldefpackage/mj4;->b(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    if-nez v7, :cond_10

    .line 304
    .line 305
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    check-cast v7, Ldefpackage/a23;

    .line 310
    .line 311
    invoke-static {v0, v7}, Ldefpackage/v23;->s(Ldefpackage/v23;Ldefpackage/a23;)V

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_10
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-eqz v5, :cond_11

    .line 320
    .line 321
    move-object v5, v12

    .line 322
    goto :goto_6

    .line 323
    :cond_11
    iget-object v5, v9, Ldefpackage/ii;->o:[Ljava/lang/Object;

    .line 324
    .line 325
    iget v7, v9, Ldefpackage/ii;->n:I

    .line 326
    .line 327
    aget-object v5, v5, v7

    .line 328
    .line 329
    :goto_6
    check-cast v5, Ldefpackage/a23;

    .line 330
    .line 331
    if-nez v5, :cond_13

    .line 332
    .line 333
    invoke-virtual {v6}, Ldefpackage/ii;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-eqz v5, :cond_12

    .line 338
    .line 339
    move-object v5, v12

    .line 340
    goto :goto_7

    .line 341
    :cond_12
    iget-object v5, v6, Ldefpackage/ii;->o:[Ljava/lang/Object;

    .line 342
    .line 343
    iget v7, v6, Ldefpackage/ii;->n:I

    .line 344
    .line 345
    aget-object v5, v5, v7

    .line 346
    .line 347
    :goto_7
    check-cast v5, Ldefpackage/a23;

    .line 348
    .line 349
    :cond_13
    if-eqz v5, :cond_14

    .line 350
    .line 351
    iget-object v5, v5, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_14
    move-object v5, v12

    .line 355
    :goto_8
    iget-object v7, v0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 356
    .line 357
    invoke-static {v5, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-nez v5, :cond_18

    .line 362
    .line 363
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    invoke-interface {v4, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    :cond_15
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-eqz v5, :cond_16

    .line 376
    .line 377
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    move-object v7, v5

    .line 382
    check-cast v7, Ldefpackage/a23;

    .line 383
    .line 384
    iget-object v7, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 385
    .line 386
    iget-object v8, v0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 387
    .line 388
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-static {v7, v8}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-eqz v7, :cond_15

    .line 396
    .line 397
    move-object v12, v5

    .line 398
    :cond_16
    check-cast v12, Ldefpackage/a23;

    .line 399
    .line 400
    if-nez v12, :cond_17

    .line 401
    .line 402
    iget-object v4, v0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget-object v5, v0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v2}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-virtual {v0}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    iget-object v7, v0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 421
    .line 422
    invoke-static {v11, v4, v2, v5, v7}, Ldefpackage/tv1;->v(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    :cond_17
    invoke-virtual {v6, v12}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_18
    invoke-virtual {v6}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_1a

    .line 438
    .line 439
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    check-cast v4, Ldefpackage/a23;

    .line 444
    .line 445
    iget-object v5, v4, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 446
    .line 447
    iget-object v5, v5, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 448
    .line 449
    iget-object v7, v0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 450
    .line 451
    invoke-virtual {v7, v5}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    iget-object v7, v0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 456
    .line 457
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    if-eqz v5, :cond_19

    .line 462
    .line 463
    check-cast v5, Ldefpackage/d23;

    .line 464
    .line 465
    invoke-virtual {v5, v4}, Ldefpackage/d23;->a(Ldefpackage/a23;)V

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    const-string v2, "NavigatorBackStack for "

    .line 472
    .line 473
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    iget-object v1, v1, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 477
    .line 478
    const-string v2, " should already be created"

    .line 479
    .line 480
    invoke-static {v0, v1, v2}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, Ldefpackage/nz2;->f(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_1a
    invoke-virtual {v9, v6}, Ldefpackage/ii;->addAll(Ljava/util/Collection;)Z

    .line 489
    .line 490
    .line 491
    invoke-virtual {v9, v3}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v3, v6}, Ldefpackage/q40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    const/4 v7, 0x0

    .line 503
    :cond_1b
    :goto_a
    if-ge v7, v2, :cond_1c

    .line 504
    .line 505
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    add-int/lit8 v7, v7, 0x1

    .line 510
    .line 511
    check-cast v3, Ldefpackage/a23;

    .line 512
    .line 513
    iget-object v4, v3, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 514
    .line 515
    iget-object v4, v4, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 516
    .line 517
    if-eqz v4, :cond_1b

    .line 518
    .line 519
    iget v4, v4, Ldefpackage/r23;->u:I

    .line 520
    .line 521
    invoke-virtual {v0, v4}, Ldefpackage/v23;->f(I)Ldefpackage/a23;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-virtual {v0, v3, v4}, Ldefpackage/v23;->l(Ldefpackage/a23;Ldefpackage/a23;)V

    .line 526
    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_1c
    return-void
.end method

.method public final b(Ldefpackage/e23;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 7
    .line 8
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ldefpackage/a23;

    .line 19
    .line 20
    iget-object v1, v0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/a23;->c()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p0, v1}, Ldefpackage/e23;->a(Ldefpackage/v23;Ldefpackage/r23;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 11

    .line 1
    :goto_0
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ldefpackage/a23;

    .line 14
    .line 15
    iget-object v1, v1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 16
    .line 17
    instance-of v1, v1, Ldefpackage/t23;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/a23;

    .line 26
    .line 27
    invoke-static {p0, v0}, Ldefpackage/v23;->s(Ldefpackage/v23;Ldefpackage/a23;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ldefpackage/a23;

    .line 36
    .line 37
    iget-object v2, p0, Ldefpackage/v23;->A:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget v3, p0, Ldefpackage/v23;->z:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    add-int/2addr v3, v4

    .line 48
    iput v3, p0, Ldefpackage/v23;->z:I

    .line 49
    .line 50
    invoke-virtual {p0}, Ldefpackage/v23;->x()V

    .line 51
    .line 52
    .line 53
    iget v3, p0, Ldefpackage/v23;->z:I

    .line 54
    .line 55
    add-int/lit8 v3, v3, -0x1

    .line 56
    .line 57
    iput v3, p0, Ldefpackage/v23;->z:I

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    invoke-static {v2}, Ldefpackage/q40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v6, v5

    .line 74
    :goto_1
    if-ge v6, v2, :cond_3

    .line 75
    .line 76
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    add-int/lit8 v6, v6, 0x1

    .line 81
    .line 82
    check-cast v7, Ldefpackage/a23;

    .line 83
    .line 84
    iget-object v8, p0, Ldefpackage/v23;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    check-cast v9, Ldefpackage/e23;

    .line 101
    .line 102
    iget-object v10, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 103
    .line 104
    invoke-virtual {v7}, Ldefpackage/a23;->c()Landroid/os/Bundle;

    .line 105
    .line 106
    .line 107
    invoke-interface {v9, p0, v10}, Ldefpackage/e23;->a(Ldefpackage/v23;Ldefpackage/r23;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    iget-object v8, p0, Ldefpackage/v23;->C:Ldefpackage/cd4;

    .line 112
    .line 113
    invoke-virtual {v8, v7}, Ldefpackage/cd4;->q(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Ldefpackage/v23;->h:Ldefpackage/nl4;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-virtual {v0, v3, v2}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Ldefpackage/v23;->t()Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object p0, p0, Ldefpackage/v23;->i:Ldefpackage/nl4;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v3, v0}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_4
    if-eqz v1, :cond_5

    .line 144
    .line 145
    return v4

    .line 146
    :cond_5
    return v5
.end method

.method public final d(ILdefpackage/r23;)Ldefpackage/r23;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget v1, v0, Ldefpackage/r23;->u:I

    .line 8
    .line 9
    if-ne v1, p1, :cond_2

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-static {v0, p2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p2, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0

    .line 27
    :cond_2
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 28
    .line 29
    invoke-virtual {v0}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ldefpackage/a23;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    :cond_3
    iget-object v0, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :cond_4
    const/4 p0, 0x0

    .line 47
    invoke-static {p1, v0, p2, p0}, Ldefpackage/v23;->e(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public final f(I)Ldefpackage/a23;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Ldefpackage/a23;

    .line 23
    .line 24
    iget-object v2, v2, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 25
    .line 26
    iget v2, v2, Ldefpackage/r23;->u:I

    .line 27
    .line 28
    if-ne v2, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    check-cast v1, Ldefpackage/a23;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    const-string v0, "No destination with ID "

    .line 38
    .line 39
    const-string v1, " is on the NavController\'s back stack. The current destination is "

    .line 40
    .line 41
    invoke-static {p1, v0, v1}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public final g()Ldefpackage/r23;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/a23;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final h()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/ii;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

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
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ldefpackage/a23;

    .line 28
    .line 29
    iget-object v1, v1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 30
    .line 31
    instance-of v1, v1, Ldefpackage/t23;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    if-ltz v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 41
    .line 42
    const-string v0, "Count overflow has happened."

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_3
    return v0
.end method

.method public final i()Ldefpackage/t23;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "You must call setGraph() before calling getGraph()"

    .line 10
    .line 11
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final j()Ldefpackage/r92;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->n:Ldefpackage/ba2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ldefpackage/r92;->p:Ldefpackage/r92;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/v23;->q:Ldefpackage/r92;

    .line 9
    .line 10
    return-object p0
.end method

.method public final k(Ldefpackage/ii;)Ldefpackage/t23;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ldefpackage/a23;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :cond_1
    instance-of p0, p1, Ldefpackage/t23;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    check-cast p1, Ldefpackage/t23;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_2
    iget-object p0, p1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final l(Ldefpackage/a23;Ldefpackage/a23;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->j:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/v23;->k:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final m(ILandroid/os/Bundle;Ldefpackage/y23;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldefpackage/a23;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 19
    .line 20
    :goto_0
    if-eqz v0, :cond_c

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ldefpackage/r23;->d(I)Ldefpackage/y13;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    if-nez p3, :cond_1

    .line 30
    .line 31
    iget-object p3, v1, Ldefpackage/y13;->b:Ldefpackage/y23;

    .line 32
    .line 33
    :cond_1
    iget v3, v1, Ldefpackage/y13;->a:I

    .line 34
    .line 35
    iget-object v4, v1, Ldefpackage/y13;->c:Landroid/os/Bundle;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    new-instance v5, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    move-object v5, v2

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move v3, p1

    .line 51
    goto :goto_1

    .line 52
    :goto_2
    if-eqz p2, :cond_5

    .line 53
    .line 54
    if-nez v5, :cond_4

    .line 55
    .line 56
    new-instance v4, Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 59
    .line 60
    .line 61
    move-object v5, v4

    .line 62
    :cond_4
    invoke-virtual {v5, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    if-nez v3, :cond_8

    .line 66
    .line 67
    if-eqz p3, :cond_8

    .line 68
    .line 69
    iget-boolean p2, p3, Ldefpackage/y23;->d:Z

    .line 70
    .line 71
    iget v4, p3, Ldefpackage/y23;->c:I

    .line 72
    .line 73
    const/4 v6, -0x1

    .line 74
    if-ne v4, v6, :cond_6

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_6
    if-eq v4, v6, :cond_7

    .line 78
    .line 79
    invoke-virtual {p0, v4, p2}, Ldefpackage/v23;->p(IZ)Z

    .line 80
    .line 81
    .line 82
    :cond_7
    return-void

    .line 83
    :cond_8
    :goto_3
    if-eqz v3, :cond_b

    .line 84
    .line 85
    invoke-virtual {p0, v3, v2}, Ldefpackage/v23;->d(ILdefpackage/r23;)Ldefpackage/r23;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-nez p2, :cond_a

    .line 90
    .line 91
    sget p2, Ldefpackage/r23;->w:I

    .line 92
    .line 93
    iget-object p0, p0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {p0, v3}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    const-string p3, " cannot be found from the current destination "

    .line 100
    .line 101
    if-nez v1, :cond_9

    .line 102
    .line 103
    const-string p0, "Navigation action/destination "

    .line 104
    .line 105
    invoke-static {p0, p2, p3, v0}, Ldefpackage/tb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_9
    const-string v1, "Navigation destination "

    .line 110
    .line 111
    const-string v2, " referenced from action "

    .line 112
    .line 113
    invoke-static {v1, p2, v2}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {p0, p1}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_a
    invoke-virtual {p0, p2, v5, p3}, Ldefpackage/v23;->n(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/y23;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_b
    const-string p0, "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"

    .line 149
    .line 150
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    new-instance p2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string p3, "No current destination found. Ensure a navigation graph has been set for NavController "

    .line 159
    .line 160
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const/16 p0, 0x2e

    .line 167
    .line 168
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method

.method public final n(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/y23;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    check-cast v4, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x1

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ldefpackage/d23;

    .line 31
    .line 32
    iput-boolean v6, v5, Ldefpackage/d23;->d:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v4, Ldefpackage/fx3;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v5, -0x1

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iget-boolean v8, v2, Ldefpackage/y23;->e:Z

    .line 44
    .line 45
    iget-boolean v9, v2, Ldefpackage/y23;->d:Z

    .line 46
    .line 47
    iget v10, v2, Ldefpackage/y23;->c:I

    .line 48
    .line 49
    if-eq v10, v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, v10, v9, v8}, Ldefpackage/v23;->q(IZZ)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v8, 0x0

    .line 57
    :goto_1
    invoke-virtual/range {p1 .. p2}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    iget-boolean v10, v2, Ldefpackage/y23;->b:Z

    .line 64
    .line 65
    if-ne v10, v6, :cond_2

    .line 66
    .line 67
    iget v10, v1, Ldefpackage/r23;->u:I

    .line 68
    .line 69
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iget-object v11, v0, Ldefpackage/v23;->l:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-interface {v11, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eqz v10, :cond_2

    .line 80
    .line 81
    iget v1, v1, Ldefpackage/r23;->u:I

    .line 82
    .line 83
    invoke-virtual {v0, v1, v9, v2}, Ldefpackage/v23;->u(ILandroid/os/Bundle;Ldefpackage/y23;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iput-boolean v1, v4, Ldefpackage/fx3;->n:Z

    .line 88
    .line 89
    move-object/from16 v22, v3

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_2
    iget-object v10, v0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 95
    .line 96
    if-eqz v2, :cond_e

    .line 97
    .line 98
    iget-boolean v11, v2, Ldefpackage/y23;->a:Z

    .line 99
    .line 100
    if-ne v11, v6, :cond_e

    .line 101
    .line 102
    iget-object v11, v0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 103
    .line 104
    invoke-virtual {v11}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    check-cast v12, Ldefpackage/a23;

    .line 109
    .line 110
    invoke-virtual {v11}, Ldefpackage/ii;->a()I

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    invoke-virtual {v11, v13}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    :cond_3
    invoke-interface {v13}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    if-eqz v14, :cond_4

    .line 123
    .line 124
    invoke-interface {v13}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    check-cast v14, Ldefpackage/a23;

    .line 129
    .line 130
    iget-object v14, v14, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 131
    .line 132
    if-ne v14, v1, :cond_3

    .line 133
    .line 134
    invoke-interface {v13}, Ljava/util/ListIterator;->nextIndex()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    move v13, v5

    .line 140
    :goto_2
    if-ne v13, v5, :cond_5

    .line 141
    .line 142
    goto/16 :goto_7

    .line 143
    .line 144
    :cond_5
    instance-of v5, v1, Ldefpackage/t23;

    .line 145
    .line 146
    if-eqz v5, :cond_8

    .line 147
    .line 148
    sget v5, Ldefpackage/t23;->A:I

    .line 149
    .line 150
    move-object v5, v1

    .line 151
    check-cast v5, Ldefpackage/t23;

    .line 152
    .line 153
    sget-object v12, Ldefpackage/k5;->z:Ldefpackage/k5;

    .line 154
    .line 155
    invoke-static {v12, v5}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    sget-object v12, Ldefpackage/k5;->v:Ldefpackage/k5;

    .line 160
    .line 161
    new-instance v14, Ldefpackage/tq4;

    .line 162
    .line 163
    invoke-direct {v14, v5, v12, v6}, Ldefpackage/tq4;-><init>(Ljava/lang/Object;Ldefpackage/if1;I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v14}, Ldefpackage/fa4;->f0(Ldefpackage/aa4;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    iget v12, v11, Ldefpackage/ii;->p:I

    .line 171
    .line 172
    sub-int/2addr v12, v13

    .line 173
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-eq v12, v14, :cond_6

    .line 178
    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :cond_6
    iget v12, v11, Ldefpackage/ii;->p:I

    .line 182
    .line 183
    invoke-virtual {v11, v13, v12}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    new-instance v14, Ljava/util/ArrayList;

    .line 188
    .line 189
    const/16 v15, 0xa

    .line 190
    .line 191
    invoke-static {v12, v15}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    if-eqz v15, :cond_7

    .line 207
    .line 208
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    check-cast v15, Ldefpackage/a23;

    .line 213
    .line 214
    iget-object v15, v15, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 215
    .line 216
    iget v15, v15, Ldefpackage/r23;->u:I

    .line 217
    .line 218
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_7
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-nez v5, :cond_9

    .line 231
    .line 232
    goto/16 :goto_7

    .line 233
    .line 234
    :cond_8
    if-eqz v12, :cond_e

    .line 235
    .line 236
    iget-object v5, v12, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 237
    .line 238
    if-eqz v5, :cond_e

    .line 239
    .line 240
    iget v12, v1, Ldefpackage/r23;->u:I

    .line 241
    .line 242
    iget v5, v5, Ldefpackage/r23;->u:I

    .line 243
    .line 244
    if-ne v12, v5, :cond_e

    .line 245
    .line 246
    :cond_9
    new-instance v5, Ldefpackage/ii;

    .line 247
    .line 248
    invoke-direct {v5}, Ldefpackage/ii;-><init>()V

    .line 249
    .line 250
    .line 251
    :goto_4
    invoke-virtual {v11}, Ldefpackage/v1;->size()I

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    sub-int/2addr v12, v6

    .line 256
    if-lt v12, v13, :cond_a

    .line 257
    .line 258
    invoke-static {v11}, Ldefpackage/v40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    check-cast v12, Ldefpackage/a23;

    .line 263
    .line 264
    invoke-virtual {v0, v12}, Ldefpackage/v23;->w(Ldefpackage/a23;)V

    .line 265
    .line 266
    .line 267
    new-instance v14, Ldefpackage/a23;

    .line 268
    .line 269
    iget-object v15, v12, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 270
    .line 271
    move-object/from16 v6, p2

    .line 272
    .line 273
    invoke-virtual {v15, v6}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 274
    .line 275
    .line 276
    move-result-object v17

    .line 277
    iget-object v15, v12, Ldefpackage/a23;->n:Landroid/content/Context;

    .line 278
    .line 279
    iget-object v7, v12, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 280
    .line 281
    move-object/from16 v22, v3

    .line 282
    .line 283
    iget-object v3, v12, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 284
    .line 285
    move-object/from16 v18, v3

    .line 286
    .line 287
    iget-object v3, v12, Ldefpackage/a23;->r:Ldefpackage/j23;

    .line 288
    .line 289
    move-object/from16 v19, v3

    .line 290
    .line 291
    iget-object v3, v12, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 292
    .line 293
    move-object/from16 v20, v3

    .line 294
    .line 295
    iget-object v3, v12, Ldefpackage/a23;->t:Landroid/os/Bundle;

    .line 296
    .line 297
    move-object/from16 v21, v3

    .line 298
    .line 299
    move-object/from16 v16, v7

    .line 300
    .line 301
    invoke-direct/range {v14 .. v21}, Ldefpackage/a23;-><init>(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 302
    .line 303
    .line 304
    iget-object v3, v12, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 305
    .line 306
    iput-object v3, v14, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 307
    .line 308
    iget-object v3, v12, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iput-object v3, v14, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 314
    .line 315
    invoke-virtual {v14}, Ldefpackage/a23;->e()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v14}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v3, v22

    .line 322
    .line 323
    const/4 v6, 0x1

    .line 324
    goto :goto_4

    .line 325
    :cond_a
    move-object/from16 v22, v3

    .line 326
    .line 327
    invoke-virtual {v5}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-eqz v6, :cond_c

    .line 336
    .line 337
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    check-cast v6, Ldefpackage/a23;

    .line 342
    .line 343
    iget-object v7, v6, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 344
    .line 345
    iget-object v7, v7, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 346
    .line 347
    if-eqz v7, :cond_b

    .line 348
    .line 349
    iget v7, v7, Ldefpackage/r23;->u:I

    .line 350
    .line 351
    invoke-virtual {v0, v7}, Ldefpackage/v23;->f(I)Ldefpackage/a23;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-virtual {v0, v6, v7}, Ldefpackage/v23;->l(Ldefpackage/a23;Ldefpackage/a23;)V

    .line 356
    .line 357
    .line 358
    :cond_b
    invoke-virtual {v11, v6}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_c
    invoke-virtual {v5}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-eqz v5, :cond_d

    .line 371
    .line 372
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    check-cast v5, Ldefpackage/a23;

    .line 377
    .line 378
    iget-object v6, v5, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 379
    .line 380
    iget-object v6, v6, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v10, v6}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-virtual {v6, v5}, Ldefpackage/t43;->f(Ldefpackage/a23;)V

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_d
    const/4 v6, 0x1

    .line 391
    goto :goto_8

    .line 392
    :cond_e
    :goto_7
    move-object/from16 v22, v3

    .line 393
    .line 394
    const/4 v6, 0x0

    .line 395
    :goto_8
    if-nez v6, :cond_f

    .line 396
    .line 397
    invoke-virtual {v0}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    iget-object v5, v0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 402
    .line 403
    iget-object v7, v0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 404
    .line 405
    invoke-static {v7, v1, v9, v3, v5}, Ldefpackage/tv1;->v(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    iget-object v5, v1, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v10, v5}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-static {v3}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    new-instance v7, Ldefpackage/i23;

    .line 420
    .line 421
    invoke-direct {v7, v4, v0, v1, v9}, Ldefpackage/i23;-><init>(Ldefpackage/fx3;Ldefpackage/v23;Ldefpackage/r23;Landroid/os/Bundle;)V

    .line 422
    .line 423
    .line 424
    iput-object v7, v0, Ldefpackage/v23;->w:Ldefpackage/if1;

    .line 425
    .line 426
    invoke-virtual {v5, v3, v2}, Ldefpackage/t43;->d(Ljava/util/List;Ldefpackage/y23;)V

    .line 427
    .line 428
    .line 429
    const/4 v1, 0x0

    .line 430
    iput-object v1, v0, Ldefpackage/v23;->w:Ldefpackage/if1;

    .line 431
    .line 432
    :cond_f
    :goto_9
    invoke-virtual {v0}, Ldefpackage/v23;->y()V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v22 .. v22}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, Ljava/lang/Iterable;

    .line 440
    .line 441
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    if-eqz v2, :cond_10

    .line 450
    .line 451
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    check-cast v2, Ldefpackage/d23;

    .line 456
    .line 457
    const/4 v3, 0x0

    .line 458
    iput-boolean v3, v2, Ldefpackage/d23;->d:Z

    .line 459
    .line 460
    goto :goto_a

    .line 461
    :cond_10
    if-nez v8, :cond_12

    .line 462
    .line 463
    iget-boolean v1, v4, Ldefpackage/fx3;->n:Z

    .line 464
    .line 465
    if-nez v1, :cond_12

    .line 466
    .line 467
    if-eqz v6, :cond_11

    .line 468
    .line 469
    goto :goto_b

    .line 470
    :cond_11
    invoke-virtual {v0}, Ldefpackage/v23;->x()V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :cond_12
    :goto_b
    invoke-virtual {v0}, Ldefpackage/v23;->c()Z

    .line 475
    .line 476
    .line 477
    return-void
.end method

.method public final o()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ldefpackage/v23;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v2, :cond_12

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/v23;->b:Landroid/app/Activity;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v4, v3

    .line 27
    :goto_0
    const-string v5, "android-support-nav:controller:deepLinkIds"

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v4, v3

    .line 37
    :goto_1
    const-string v6, "android-support-nav:controller:deepLinkExtras"

    .line 38
    .line 39
    const-string v7, "android-support-nav:controller:deepLinkIntent"

    .line 40
    .line 41
    if-eqz v4, :cond_c

    .line 42
    .line 43
    iget-boolean v1, p0, Ldefpackage/v23;->f:Z

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v5, Ljava/util/ArrayList;

    .line 71
    .line 72
    array-length v8, v4

    .line 73
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    array-length v8, v4

    .line 77
    const/4 v9, 0x0

    .line 78
    move v10, v9

    .line 79
    :goto_2
    if-ge v10, v8, :cond_3

    .line 80
    .line 81
    aget v11, v4, v10

    .line 82
    .line 83
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const-string v4, "android-support-nav:controller:deepLinkArgs"

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v5}, Ldefpackage/v40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-static {v4}, Ldefpackage/v40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Landroid/os/Bundle;

    .line 116
    .line 117
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_5

    .line 122
    .line 123
    goto/16 :goto_7

    .line 124
    .line 125
    :cond_5
    invoke-virtual {p0}, Ldefpackage/v23;->i()Ldefpackage/t23;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v8, v10, v3, v9}, Ldefpackage/v23;->e(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    instance-of v11, v10, Ldefpackage/t23;

    .line 134
    .line 135
    if-eqz v11, :cond_6

    .line 136
    .line 137
    sget v8, Ldefpackage/t23;->A:I

    .line 138
    .line 139
    check-cast v10, Ldefpackage/t23;

    .line 140
    .line 141
    invoke-static {v10}, Ldefpackage/jz4;->s(Ldefpackage/t23;)Ldefpackage/r23;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    iget v8, v8, Ldefpackage/r23;->u:I

    .line 146
    .line 147
    :cond_6
    invoke-virtual {p0}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    if-eqz v10, :cond_11

    .line 152
    .line 153
    iget v10, v10, Ldefpackage/r23;->u:I

    .line 154
    .line 155
    if-ne v8, v10, :cond_11

    .line 156
    .line 157
    new-instance v8, Ldefpackage/na4;

    .line 158
    .line 159
    invoke-direct {v8, p0}, Ldefpackage/na4;-><init>(Ldefpackage/v23;)V

    .line 160
    .line 161
    .line 162
    new-instance p0, Ldefpackage/kd3;

    .line 163
    .line 164
    invoke-direct {p0, v7, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    filled-new-array {p0}, [Ldefpackage/kd3;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, Ldefpackage/fh0;->g([Ldefpackage/kd3;)Landroid/os/Bundle;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-eqz v1, :cond_7

    .line 180
    .line 181
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 182
    .line 183
    .line 184
    :cond_7
    iget-object v1, v8, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Landroid/content/Intent;

    .line 187
    .line 188
    invoke-virtual {v1, v6, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    move v1, v9

    .line 196
    :goto_3
    if-ge v1, p0, :cond_b

    .line 197
    .line 198
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    add-int/lit8 v1, v1, 0x1

    .line 203
    .line 204
    add-int/lit8 v6, v9, 0x1

    .line 205
    .line 206
    if-ltz v9, :cond_a

    .line 207
    .line 208
    check-cast v2, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v4, :cond_8

    .line 215
    .line 216
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, Landroid/os/Bundle;

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    move-object v7, v3

    .line 224
    :goto_4
    iget-object v9, v8, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v9, Ljava/util/ArrayList;

    .line 227
    .line 228
    new-instance v10, Ldefpackage/o23;

    .line 229
    .line 230
    invoke-direct {v10, v2, v7}, Ldefpackage/o23;-><init>(ILandroid/os/Bundle;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    iget-object v2, v8, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Ldefpackage/t23;

    .line 239
    .line 240
    if-eqz v2, :cond_9

    .line 241
    .line 242
    invoke-virtual {v8}, Ldefpackage/na4;->S()V

    .line 243
    .line 244
    .line 245
    :cond_9
    move v9, v6

    .line 246
    goto :goto_3

    .line 247
    :cond_a
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 248
    .line 249
    .line 250
    throw v3

    .line 251
    :cond_b
    invoke-virtual {v8}, Ldefpackage/na4;->k()Ldefpackage/hr4;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-virtual {p0}, Ldefpackage/hr4;->b()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_c
    invoke-virtual {p0}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget v5, v4, Ldefpackage/r23;->u:I

    .line 270
    .line 271
    iget-object v4, v4, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 272
    .line 273
    :goto_5
    if-eqz v4, :cond_11

    .line 274
    .line 275
    iget v8, v4, Ldefpackage/t23;->y:I

    .line 276
    .line 277
    if-eq v8, v5, :cond_10

    .line 278
    .line 279
    new-instance v5, Landroid/os/Bundle;

    .line 280
    .line 281
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 282
    .line 283
    .line 284
    if-eqz v0, :cond_e

    .line 285
    .line 286
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    if-eqz v8, :cond_e

    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-virtual {v8}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    if-eqz v8, :cond_e

    .line 301
    .line 302
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v1}, Ldefpackage/v23;->k(Ldefpackage/ii;)Ldefpackage/t23;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    new-instance v7, Ldefpackage/ik;

    .line 314
    .line 315
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-direct {v7, v8}, Ldefpackage/ik;-><init>(Landroid/content/Intent;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v7, v2, v1}, Ldefpackage/t23;->i(Ldefpackage/ik;ZLdefpackage/t23;)Ldefpackage/p23;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    if-eqz v1, :cond_d

    .line 330
    .line 331
    iget-object v2, v1, Ldefpackage/p23;->o:Landroid/os/Bundle;

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_d
    move-object v2, v3

    .line 335
    :goto_6
    if-eqz v2, :cond_e

    .line 336
    .line 337
    iget-object v2, v1, Ldefpackage/p23;->n:Ldefpackage/r23;

    .line 338
    .line 339
    iget-object v1, v1, Ldefpackage/p23;->o:Landroid/os/Bundle;

    .line 340
    .line 341
    invoke-virtual {v2, v1}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v5, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 346
    .line 347
    .line 348
    :cond_e
    new-instance v1, Ldefpackage/na4;

    .line 349
    .line 350
    invoke-direct {v1, p0}, Ldefpackage/na4;-><init>(Ldefpackage/v23;)V

    .line 351
    .line 352
    .line 353
    iget p0, v4, Ldefpackage/r23;->u:I

    .line 354
    .line 355
    iget-object v2, v1, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v2, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 360
    .line 361
    .line 362
    new-instance v4, Ldefpackage/o23;

    .line 363
    .line 364
    invoke-direct {v4, p0, v3}, Ldefpackage/o23;-><init>(ILandroid/os/Bundle;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    iget-object p0, v1, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast p0, Ldefpackage/t23;

    .line 373
    .line 374
    if-eqz p0, :cond_f

    .line 375
    .line 376
    invoke-virtual {v1}, Ldefpackage/na4;->S()V

    .line 377
    .line 378
    .line 379
    :cond_f
    iget-object p0, v1, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast p0, Landroid/content/Intent;

    .line 382
    .line 383
    invoke-virtual {p0, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Ldefpackage/na4;->k()Ldefpackage/hr4;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-virtual {p0}, Ldefpackage/hr4;->b()V

    .line 391
    .line 392
    .line 393
    if-eqz v0, :cond_11

    .line 394
    .line 395
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :cond_10
    iget v5, v4, Ldefpackage/r23;->u:I

    .line 400
    .line 401
    iget-object v4, v4, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 402
    .line 403
    goto/16 :goto_5

    .line 404
    .line 405
    :cond_11
    :goto_7
    return-void

    .line 406
    :cond_12
    invoke-virtual {v1}, Ldefpackage/ii;->isEmpty()Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_13

    .line 411
    .line 412
    return-void

    .line 413
    :cond_13
    invoke-virtual {p0}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    iget v0, v0, Ldefpackage/r23;->u:I

    .line 421
    .line 422
    invoke-virtual {p0, v0, v2}, Ldefpackage/v23;->p(IZ)Z

    .line 423
    .line 424
    .line 425
    return-void
.end method

.method public final p(IZ)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Ldefpackage/v23;->q(IZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/v23;->c()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v0
.end method

.method public final q(IZZ)Z
    .locals 15

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    iget-object v6, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 4
    .line 5
    invoke-virtual {v6}, Ldefpackage/ii;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v7, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v7

    .line 13
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v6}, Ldefpackage/q40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v9, 0x0

    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ldefpackage/a23;

    .line 38
    .line 39
    iget-object v2, v2, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 40
    .line 41
    iget-object v3, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 42
    .line 43
    iget-object v4, v2, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    iget v4, v2, Ldefpackage/r23;->u:I

    .line 52
    .line 53
    if-eq v4, v0, :cond_3

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    iget v3, v2, Ldefpackage/r23;->u:I

    .line 59
    .line 60
    if-ne v3, v0, :cond_1

    .line 61
    .line 62
    move-object v10, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    move-object v10, v9

    .line 65
    :goto_0
    if-nez v10, :cond_5

    .line 66
    .line 67
    sget v1, Ldefpackage/r23;->w:I

    .line 68
    .line 69
    iget-object p0, p0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 70
    .line 71
    invoke-static {p0, v0}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, "Ignoring popBackStack to destination "

    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, " as it was not found on the current back stack"

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v0, "NavController"

    .line 95
    .line 96
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    return v7

    .line 100
    :cond_5
    new-instance v2, Ldefpackage/fx3;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance v5, Ldefpackage/ii;

    .line 106
    .line 107
    invoke-direct {v5}, Ldefpackage/ii;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    move v0, v7

    .line 115
    :goto_1
    if-ge v0, v11, :cond_7

    .line 116
    .line 117
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    add-int/lit8 v12, v0, 0x1

    .line 122
    .line 123
    move-object v13, v1

    .line 124
    check-cast v13, Ldefpackage/t43;

    .line 125
    .line 126
    new-instance v1, Ldefpackage/fx3;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    move-object v14, v0

    .line 136
    check-cast v14, Ldefpackage/a23;

    .line 137
    .line 138
    new-instance v0, Ldefpackage/f23;

    .line 139
    .line 140
    move-object v3, p0

    .line 141
    move/from16 v4, p3

    .line 142
    .line 143
    invoke-direct/range {v0 .. v5}, Ldefpackage/f23;-><init>(Ldefpackage/fx3;Ldefpackage/fx3;Ldefpackage/v23;ZLdefpackage/ii;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p0, Ldefpackage/v23;->x:Ldefpackage/f23;

    .line 147
    .line 148
    invoke-virtual {v13, v14, v4}, Ldefpackage/t43;->i(Ldefpackage/a23;Z)V

    .line 149
    .line 150
    .line 151
    iput-object v9, p0, Ldefpackage/v23;->x:Ldefpackage/f23;

    .line 152
    .line 153
    iget-boolean v0, v1, Ldefpackage/fx3;->n:Z

    .line 154
    .line 155
    if-nez v0, :cond_6

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    move v0, v12

    .line 159
    goto :goto_1

    .line 160
    :cond_7
    move/from16 v4, p3

    .line 161
    .line 162
    :goto_2
    if-eqz v4, :cond_c

    .line 163
    .line 164
    iget-object v0, p0, Ldefpackage/v23;->l:Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    if-nez p2, :cond_a

    .line 167
    .line 168
    sget-object v1, Ldefpackage/k5;->t:Ldefpackage/k5;

    .line 169
    .line 170
    invoke-static {v1, v10}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v4, Ldefpackage/g23;

    .line 175
    .line 176
    invoke-direct {v4, p0, v7}, Ldefpackage/g23;-><init>(Ldefpackage/v23;I)V

    .line 177
    .line 178
    .line 179
    new-instance v6, Ldefpackage/tq4;

    .line 180
    .line 181
    invoke-direct {v6, v1, v4, v7}, Ldefpackage/tq4;-><init>(Ljava/lang/Object;Ldefpackage/if1;I)V

    .line 182
    .line 183
    .line 184
    new-instance v1, Ldefpackage/g71;

    .line 185
    .line 186
    invoke-direct {v1, v6}, Ldefpackage/g71;-><init>(Ldefpackage/tq4;)V

    .line 187
    .line 188
    .line 189
    :goto_3
    invoke-virtual {v1}, Ldefpackage/g71;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_a

    .line 194
    .line 195
    invoke-virtual {v1}, Ldefpackage/g71;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ldefpackage/r23;

    .line 200
    .line 201
    iget v4, v4, Ldefpackage/r23;->u:I

    .line 202
    .line 203
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v5}, Ldefpackage/ii;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_8

    .line 212
    .line 213
    move-object v6, v9

    .line 214
    goto :goto_4

    .line 215
    :cond_8
    iget-object v6, v5, Ldefpackage/ii;->o:[Ljava/lang/Object;

    .line 216
    .line 217
    iget v8, v5, Ldefpackage/ii;->n:I

    .line 218
    .line 219
    aget-object v6, v6, v8

    .line 220
    .line 221
    :goto_4
    check-cast v6, Ldefpackage/c23;

    .line 222
    .line 223
    if-eqz v6, :cond_9

    .line 224
    .line 225
    iget-object v6, v6, Ldefpackage/c23;->n:Ljava/lang/String;

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_9
    move-object v6, v9

    .line 229
    :goto_5
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_a
    invoke-virtual {v5}, Ldefpackage/ii;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_c

    .line 238
    .line 239
    invoke-virtual {v5}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Ldefpackage/c23;

    .line 244
    .line 245
    iget v4, v1, Ldefpackage/c23;->o:I

    .line 246
    .line 247
    iget-object v1, v1, Ldefpackage/c23;->n:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {p0, v4, v9}, Ldefpackage/v23;->d(ILdefpackage/r23;)Ldefpackage/r23;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    sget-object v6, Ldefpackage/k5;->u:Ldefpackage/k5;

    .line 254
    .line 255
    invoke-static {v6, v4}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    new-instance v6, Ldefpackage/g23;

    .line 260
    .line 261
    const/4 v8, 0x1

    .line 262
    invoke-direct {v6, p0, v8}, Ldefpackage/g23;-><init>(Ldefpackage/v23;I)V

    .line 263
    .line 264
    .line 265
    new-instance v8, Ldefpackage/tq4;

    .line 266
    .line 267
    invoke-direct {v8, v4, v6, v7}, Ldefpackage/tq4;-><init>(Ljava/lang/Object;Ldefpackage/if1;I)V

    .line 268
    .line 269
    .line 270
    new-instance v4, Ldefpackage/g71;

    .line 271
    .line 272
    invoke-direct {v4, v8}, Ldefpackage/g71;-><init>(Ldefpackage/tq4;)V

    .line 273
    .line 274
    .line 275
    :goto_6
    invoke-virtual {v4}, Ldefpackage/g71;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-eqz v6, :cond_b

    .line 280
    .line 281
    invoke-virtual {v4}, Ldefpackage/g71;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    check-cast v6, Ldefpackage/r23;

    .line 286
    .line 287
    iget v6, v6, Ldefpackage/r23;->u:I

    .line 288
    .line 289
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_b
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_c

    .line 306
    .line 307
    iget-object v0, p0, Ldefpackage/v23;->m:Ljava/util/LinkedHashMap;

    .line 308
    .line 309
    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_c
    invoke-virtual {p0}, Ldefpackage/v23;->y()V

    .line 313
    .line 314
    .line 315
    iget-boolean p0, v2, Ldefpackage/fx3;->n:Z

    .line 316
    .line 317
    return p0
.end method

.method public final r(Ldefpackage/a23;ZLdefpackage/ii;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ldefpackage/a23;

    .line 8
    .line 9
    invoke-static {v1, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_6

    .line 14
    .line 15
    invoke-static {v0}, Ldefpackage/v40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object p1, v1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 19
    .line 20
    iget-object p1, p1, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ldefpackage/d23;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p1, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object p1, p1, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 44
    .line 45
    invoke-virtual {p1}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/util/Set;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-ne p1, v0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object p1, p0, Ldefpackage/v23;->k:Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 v0, 0x0

    .line 70
    :goto_0
    iget-object p1, v1, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 71
    .line 72
    iget-object p1, p1, Ldefpackage/ea2;->h:Ldefpackage/r92;

    .line 73
    .line 74
    sget-object v2, Ldefpackage/r92;->p:Ldefpackage/r92;

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-ltz p1, :cond_4

    .line 81
    .line 82
    if-eqz p2, :cond_2

    .line 83
    .line 84
    iput-object v2, v1, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 85
    .line 86
    invoke-virtual {v1}, Ldefpackage/a23;->e()V

    .line 87
    .line 88
    .line 89
    new-instance p1, Ldefpackage/c23;

    .line 90
    .line 91
    invoke-direct {p1, v1}, Ldefpackage/c23;-><init>(Ldefpackage/a23;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, p1}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    if-nez v0, :cond_3

    .line 98
    .line 99
    sget-object p1, Ldefpackage/r92;->n:Ldefpackage/r92;

    .line 100
    .line 101
    iput-object p1, v1, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 102
    .line 103
    invoke-virtual {v1}, Ldefpackage/a23;->e()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Ldefpackage/v23;->w(Ldefpackage/a23;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    iput-object v2, v1, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 111
    .line 112
    invoke-virtual {v1}, Ldefpackage/a23;->e()V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_1
    if-nez p2, :cond_5

    .line 116
    .line 117
    if-nez v0, :cond_5

    .line 118
    .line 119
    iget-object p0, p0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 120
    .line 121
    if-eqz p0, :cond_5

    .line 122
    .line 123
    iget-object p1, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object p0, p0, Ldefpackage/j23;->b:Ljava/util/LinkedHashMap;

    .line 129
    .line 130
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Ldefpackage/e75;

    .line 135
    .line 136
    if-eqz p0, :cond_5

    .line 137
    .line 138
    invoke-virtual {p0}, Ldefpackage/e75;->a()V

    .line 139
    .line 140
    .line 141
    :cond_5
    return-void

    .line 142
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string p2, "Attempted to pop "

    .line 145
    .line 146
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget-object p1, v1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 155
    .line 156
    const-string p2, ", which is not the top of the back stack ("

    .line 157
    .line 158
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const/16 p1, 0x29

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

.method public final t()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sget-object v3, Ldefpackage/r92;->q:Ldefpackage/r92;

    .line 23
    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ldefpackage/d23;

    .line 31
    .line 32
    iget-object v2, v2, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 33
    .line 34
    iget-object v2, v2, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 35
    .line 36
    invoke-virtual {v2}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Iterable;

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    move-object v6, v5

    .line 62
    check-cast v6, Ldefpackage/a23;

    .line 63
    .line 64
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    iget-object v6, v6, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 71
    .line 72
    invoke-virtual {v6, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-ltz v6, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-static {v4, v0}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v4, v2

    .line 109
    check-cast v4, Ldefpackage/a23;

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    iget-object v4, v4, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 118
    .line 119
    invoke-virtual {v4, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-ltz v4, :cond_4

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    invoke-static {v1, v0}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 130
    .line 131
    .line 132
    new-instance p0, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/4 v2, 0x0

    .line 142
    :cond_6
    :goto_3
    if-ge v2, v1, :cond_7

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    move-object v4, v3

    .line 151
    check-cast v4, Ldefpackage/a23;

    .line 152
    .line 153
    iget-object v4, v4, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 154
    .line 155
    instance-of v4, v4, Ldefpackage/t23;

    .line 156
    .line 157
    if-nez v4, :cond_6

    .line 158
    .line 159
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    return-object p0
.end method

.method public final u(ILandroid/os/Bundle;Ldefpackage/y23;)Z
    .locals 11

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/v23;->l:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    new-instance v1, Ldefpackage/td1;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v1, v3, p1}, Ldefpackage/td1;-><init>(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, v3}, Ldefpackage/v40;->o0(Ljava/lang/Iterable;Ldefpackage/if1;Z)Z

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ldefpackage/v23;->m:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-static {v0}, Ldefpackage/jz4;->f(Ljava/lang/Object;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ldefpackage/ii;

    .line 54
    .line 55
    new-instance v6, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 61
    .line 62
    invoke-virtual {v0}, Ldefpackage/ii;->g()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ldefpackage/a23;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v0, v0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 71
    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    :cond_1
    invoke-virtual {p0}, Ldefpackage/v23;->i()Ldefpackage/t23;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_2
    const/4 v1, 0x0

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Ldefpackage/c23;

    .line 96
    .line 97
    iget v5, v4, Ldefpackage/c23;->o:I

    .line 98
    .line 99
    invoke-static {v5, v0, v1, v3}, Ldefpackage/v23;->e(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget-object v7, p0, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 104
    .line 105
    if-eqz v5, :cond_3

    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v8, p0, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 112
    .line 113
    invoke-virtual {v4, v7, v5, v0, v8}, Ldefpackage/c23;->a(Landroid/content/Context;Ldefpackage/r23;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-object v0, v5

    .line 121
    goto :goto_0

    .line 122
    :cond_3
    sget p0, Ldefpackage/r23;->w:I

    .line 123
    .line 124
    iget p0, v4, Ldefpackage/c23;->o:I

    .line 125
    .line 126
    invoke-static {v7, p0}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string p1, "Restore State failed: destination "

    .line 131
    .line 132
    const-string p2, " cannot be found from the current destination "

    .line 133
    .line 134
    invoke-static {p1, p0, p2, v0}, Ldefpackage/nz2;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return v2

    .line 138
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v0, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    move v4, v2

    .line 153
    :cond_5
    :goto_1
    if-ge v4, v3, :cond_6

    .line 154
    .line 155
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    add-int/lit8 v4, v4, 0x1

    .line 160
    .line 161
    move-object v7, v5

    .line 162
    check-cast v7, Ldefpackage/a23;

    .line 163
    .line 164
    iget-object v7, v7, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 165
    .line 166
    instance-of v7, v7, Ldefpackage/t23;

    .line 167
    .line 168
    if-nez v7, :cond_5

    .line 169
    .line 170
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    move v4, v2

    .line 179
    :goto_2
    if-ge v4, v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    check-cast v5, Ldefpackage/a23;

    .line 188
    .line 189
    invoke-static {p1}, Ldefpackage/q40;->D0(Ljava/util/List;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    check-cast v7, Ljava/util/List;

    .line 194
    .line 195
    if-eqz v7, :cond_7

    .line 196
    .line 197
    invoke-static {v7}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    check-cast v8, Ldefpackage/a23;

    .line 202
    .line 203
    if-eqz v8, :cond_7

    .line 204
    .line 205
    iget-object v8, v8, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 206
    .line 207
    if-eqz v8, :cond_7

    .line 208
    .line 209
    iget-object v8, v8, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_7
    move-object v8, v1

    .line 213
    :goto_3
    iget-object v9, v5, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 214
    .line 215
    iget-object v9, v9, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v8, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_8

    .line 222
    .line 223
    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_8
    filled-new-array {v5}, [Ldefpackage/a23;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-static {v5}, Ldefpackage/gb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_9
    new-instance v5, Ldefpackage/fx3;

    .line 240
    .line 241
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    :goto_4
    if-ge v2, v0, :cond_a

    .line 249
    .line 250
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    add-int/lit8 v2, v2, 0x1

    .line 255
    .line 256
    check-cast v3, Ljava/util/List;

    .line 257
    .line 258
    invoke-static {v3}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    check-cast v4, Ldefpackage/a23;

    .line 263
    .line 264
    iget-object v4, v4, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 265
    .line 266
    iget-object v4, v4, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 267
    .line 268
    iget-object v7, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 269
    .line 270
    invoke-virtual {v7, v4}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    new-instance v7, Ldefpackage/hx3;

    .line 275
    .line 276
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 277
    .line 278
    .line 279
    new-instance v4, Ldefpackage/h23;

    .line 280
    .line 281
    move-object v8, p0

    .line 282
    move-object v9, p2

    .line 283
    invoke-direct/range {v4 .. v9}, Ldefpackage/h23;-><init>(Ldefpackage/fx3;Ljava/util/ArrayList;Ldefpackage/hx3;Ldefpackage/v23;Landroid/os/Bundle;)V

    .line 284
    .line 285
    .line 286
    iput-object v4, v8, Ldefpackage/v23;->w:Ldefpackage/if1;

    .line 287
    .line 288
    invoke-virtual {v10, v3, p3}, Ldefpackage/t43;->d(Ljava/util/List;Ldefpackage/y23;)V

    .line 289
    .line 290
    .line 291
    iput-object v1, v8, Ldefpackage/v23;->w:Ldefpackage/if1;

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_a
    iget-boolean p0, v5, Ldefpackage/fx3;->n:Z

    .line 295
    .line 296
    return p0
.end method

.method public final v(Ldefpackage/t23;Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/t23;->x:Ldefpackage/mj4;

    .line 6
    .line 7
    iget-object v3, v1, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 8
    .line 9
    invoke-virtual {v3}, Ldefpackage/ii;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    sget-object v5, Ldefpackage/r92;->n:Ldefpackage/r92;

    .line 20
    .line 21
    if-eq v4, v5, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController."

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v4, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 31
    .line 32
    invoke-static {v4, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    if-nez v4, :cond_33

    .line 39
    .line 40
    iget-object v2, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    iget-object v8, v1, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    move-object v9, v8

    .line 46
    const/4 v8, 0x1

    .line 47
    if-eqz v2, :cond_6

    .line 48
    .line 49
    new-instance v10, Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v11, v1, Ldefpackage/v23;->l:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    check-cast v11, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    move v12, v7

    .line 67
    :goto_1
    if-ge v12, v11, :cond_5

    .line 68
    .line 69
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    add-int/lit8 v16, v12, 0x1

    .line 74
    .line 75
    check-cast v13, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    check-cast v13, Ljava/lang/Iterable;

    .line 89
    .line 90
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-eqz v14, :cond_2

    .line 99
    .line 100
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    check-cast v14, Ldefpackage/d23;

    .line 105
    .line 106
    iput-boolean v8, v14, Ldefpackage/d23;->d:Z

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    new-instance v13, Ldefpackage/y23;

    .line 110
    .line 111
    const/4 v14, -0x1

    .line 112
    const/4 v15, -0x1

    .line 113
    move-object/from16 v17, v9

    .line 114
    .line 115
    const/4 v9, -0x1

    .line 116
    move/from16 v18, v12

    .line 117
    .line 118
    const/4 v12, -0x1

    .line 119
    move-object/from16 v19, v10

    .line 120
    .line 121
    move v10, v7

    .line 122
    move/from16 v20, v11

    .line 123
    .line 124
    move v11, v7

    .line 125
    move/from16 v21, v6

    .line 126
    .line 127
    move-object v6, v13

    .line 128
    move v13, v12

    .line 129
    move/from16 v4, v18

    .line 130
    .line 131
    move-object/from16 v18, v3

    .line 132
    .line 133
    move/from16 v3, v21

    .line 134
    .line 135
    move-object/from16 v21, v17

    .line 136
    .line 137
    invoke-direct/range {v6 .. v15}, Ldefpackage/y23;-><init>(ZZIZZIIII)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v4, v5, v6}, Ldefpackage/v23;->u(ILandroid/os/Bundle;Ldefpackage/y23;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    invoke-virtual/range {v21 .. v21}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    check-cast v9, Ljava/lang/Iterable;

    .line 149
    .line 150
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_3

    .line 159
    .line 160
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    check-cast v10, Ldefpackage/d23;

    .line 165
    .line 166
    iput-boolean v7, v10, Ldefpackage/d23;->d:Z

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_3
    if-eqz v6, :cond_4

    .line 170
    .line 171
    invoke-virtual {v1, v4, v8, v7}, Ldefpackage/v23;->q(IZZ)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    :cond_4
    move v6, v3

    .line 176
    move/from16 v12, v16

    .line 177
    .line 178
    move-object/from16 v3, v18

    .line 179
    .line 180
    move-object/from16 v10, v19

    .line 181
    .line 182
    move/from16 v11, v20

    .line 183
    .line 184
    move-object/from16 v9, v21

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_5
    move-object/from16 v18, v3

    .line 188
    .line 189
    move v3, v6

    .line 190
    move-object/from16 v21, v9

    .line 191
    .line 192
    iget v2, v2, Ldefpackage/r23;->u:I

    .line 193
    .line 194
    const/4 v4, 0x1

    .line 195
    invoke-virtual {v1, v2, v4, v3}, Ldefpackage/v23;->q(IZZ)Z

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    move-object/from16 v18, v3

    .line 200
    .line 201
    move v3, v6

    .line 202
    move-object/from16 v21, v9

    .line 203
    .line 204
    :goto_4
    iput-object v0, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 205
    .line 206
    iget-object v0, v1, Ldefpackage/v23;->d:Landroid/os/Bundle;

    .line 207
    .line 208
    iget-object v2, v1, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 209
    .line 210
    if-eqz v0, :cond_8

    .line 211
    .line 212
    const-string v4, "android-support-nav:controller:navigatorState:names"

    .line 213
    .line 214
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    if-eqz v4, :cond_8

    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    move v9, v7

    .line 225
    :cond_7
    :goto_5
    if-ge v9, v6, :cond_8

    .line 226
    .line 227
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    add-int/lit8 v9, v9, 0x1

    .line 232
    .line 233
    check-cast v10, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v10}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    if-eqz v10, :cond_7

    .line 247
    .line 248
    invoke-virtual {v11, v10}, Ldefpackage/t43;->g(Landroid/os/Bundle;)V

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_8
    iget-object v0, v1, Ldefpackage/v23;->e:[Landroid/os/Parcelable;

    .line 253
    .line 254
    const-string v4, " cannot be found from the current destination "

    .line 255
    .line 256
    iget-object v6, v1, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 257
    .line 258
    if-eqz v0, :cond_d

    .line 259
    .line 260
    array-length v9, v0

    .line 261
    move v10, v7

    .line 262
    :goto_6
    if-ge v10, v9, :cond_c

    .line 263
    .line 264
    aget-object v11, v0, v10

    .line 265
    .line 266
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    check-cast v11, Ldefpackage/c23;

    .line 270
    .line 271
    iget v12, v11, Ldefpackage/c23;->o:I

    .line 272
    .line 273
    invoke-virtual {v1, v12, v5}, Ldefpackage/v23;->d(ILdefpackage/r23;)Ldefpackage/r23;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    if-eqz v13, :cond_b

    .line 278
    .line 279
    invoke-virtual {v1}, Ldefpackage/v23;->j()Ldefpackage/r92;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    iget-object v14, v1, Ldefpackage/v23;->o:Ldefpackage/j23;

    .line 284
    .line 285
    invoke-virtual {v11, v6, v13, v12, v14}, Ldefpackage/c23;->a(Landroid/content/Context;Ldefpackage/r23;Ldefpackage/r92;Ldefpackage/j23;)Ldefpackage/a23;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    iget-object v12, v13, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v2, v12}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    move-object/from16 v13, v21

    .line 296
    .line 297
    invoke-virtual {v13, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v14

    .line 301
    if-nez v14, :cond_9

    .line 302
    .line 303
    new-instance v14, Ldefpackage/d23;

    .line 304
    .line 305
    invoke-direct {v14, v1, v12}, Ldefpackage/d23;-><init>(Ldefpackage/v23;Ldefpackage/t43;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v13, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    :cond_9
    check-cast v14, Ldefpackage/d23;

    .line 312
    .line 313
    move-object/from16 v15, v18

    .line 314
    .line 315
    invoke-virtual {v15, v11}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v14, v11}, Ldefpackage/d23;->a(Ldefpackage/a23;)V

    .line 319
    .line 320
    .line 321
    iget-object v12, v11, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 322
    .line 323
    iget-object v12, v12, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 324
    .line 325
    if-eqz v12, :cond_a

    .line 326
    .line 327
    iget v12, v12, Ldefpackage/r23;->u:I

    .line 328
    .line 329
    invoke-virtual {v1, v12}, Ldefpackage/v23;->f(I)Ldefpackage/a23;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-virtual {v1, v11, v12}, Ldefpackage/v23;->l(Ldefpackage/a23;Ldefpackage/a23;)V

    .line 334
    .line 335
    .line 336
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 337
    .line 338
    move-object/from16 v21, v13

    .line 339
    .line 340
    move-object/from16 v18, v15

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_b
    sget v0, Ldefpackage/r23;->w:I

    .line 344
    .line 345
    invoke-static {v6, v12}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v2, "Restoring the Navigation back stack failed: destination "

    .line 350
    .line 351
    invoke-static {v2, v0, v4}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v1}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-static {v1, v0}, Ldefpackage/nz2;->m(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :cond_c
    move-object/from16 v15, v18

    .line 364
    .line 365
    move-object/from16 v13, v21

    .line 366
    .line 367
    invoke-virtual {v1}, Ldefpackage/v23;->y()V

    .line 368
    .line 369
    .line 370
    iput-object v5, v1, Ldefpackage/v23;->e:[Landroid/os/Parcelable;

    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_d
    move-object/from16 v15, v18

    .line 374
    .line 375
    move-object/from16 v13, v21

    .line 376
    .line 377
    :goto_7
    iget-object v0, v2, Ldefpackage/u43;->a:Ljava/util/LinkedHashMap;

    .line 378
    .line 379
    invoke-static {v0}, Ldefpackage/lg2;->a0(Ljava/util/Map;)Ljava/util/Map;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Ljava/lang/Iterable;

    .line 388
    .line 389
    new-instance v2, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    if-eqz v9, :cond_f

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    move-object v10, v9

    .line 409
    check-cast v10, Ldefpackage/t43;

    .line 410
    .line 411
    iget-boolean v10, v10, Ldefpackage/t43;->b:Z

    .line 412
    .line 413
    if-nez v10, :cond_e

    .line 414
    .line 415
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    move v9, v7

    .line 424
    :goto_9
    if-ge v9, v0, :cond_11

    .line 425
    .line 426
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    add-int/lit8 v9, v9, 0x1

    .line 431
    .line 432
    check-cast v10, Ldefpackage/t43;

    .line 433
    .line 434
    invoke-virtual {v13, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    if-nez v11, :cond_10

    .line 439
    .line 440
    new-instance v11, Ldefpackage/d23;

    .line 441
    .line 442
    invoke-direct {v11, v1, v10}, Ldefpackage/d23;-><init>(Ldefpackage/v23;Ldefpackage/t43;)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v13, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    :cond_10
    check-cast v11, Ldefpackage/d23;

    .line 449
    .line 450
    invoke-virtual {v10, v11}, Ldefpackage/t43;->e(Ldefpackage/d23;)V

    .line 451
    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_11
    iget-object v0, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 455
    .line 456
    if-eqz v0, :cond_32

    .line 457
    .line 458
    invoke-virtual {v15}, Ldefpackage/ii;->isEmpty()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_32

    .line 463
    .line 464
    iget-boolean v0, v1, Ldefpackage/v23;->f:Z

    .line 465
    .line 466
    if-nez v0, :cond_31

    .line 467
    .line 468
    iget-object v2, v1, Ldefpackage/v23;->b:Landroid/app/Activity;

    .line 469
    .line 470
    if-eqz v2, :cond_31

    .line 471
    .line 472
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    if-nez v9, :cond_12

    .line 477
    .line 478
    goto/16 :goto_18

    .line 479
    .line 480
    :cond_12
    invoke-virtual {v9}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    const-string v11, "NavController"

    .line 485
    .line 486
    if-eqz v10, :cond_13

    .line 487
    .line 488
    :try_start_0
    const-string v0, "android-support-nav:controller:deepLinkIds"

    .line 489
    .line 490
    invoke-virtual {v10, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 491
    .line 492
    .line 493
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 494
    goto :goto_a

    .line 495
    :catch_0
    move-exception v0

    .line 496
    new-instance v12, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    const-string v13, "handleDeepLink() could not extract deepLink from "

    .line 499
    .line 500
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    invoke-static {v11, v12, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 511
    .line 512
    .line 513
    :cond_13
    move-object v0, v5

    .line 514
    :goto_a
    if-eqz v10, :cond_14

    .line 515
    .line 516
    const-string v12, "android-support-nav:controller:deepLinkArgs"

    .line 517
    .line 518
    invoke-virtual {v10, v12}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    goto :goto_b

    .line 523
    :cond_14
    move-object v12, v5

    .line 524
    :goto_b
    new-instance v13, Landroid/os/Bundle;

    .line 525
    .line 526
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 527
    .line 528
    .line 529
    if-eqz v10, :cond_15

    .line 530
    .line 531
    const-string v14, "android-support-nav:controller:deepLinkExtras"

    .line 532
    .line 533
    invoke-virtual {v10, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    goto :goto_c

    .line 538
    :cond_15
    move-object v10, v5

    .line 539
    :goto_c
    if-eqz v10, :cond_16

    .line 540
    .line 541
    invoke-virtual {v13, v10}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 542
    .line 543
    .line 544
    :cond_16
    if-eqz v0, :cond_17

    .line 545
    .line 546
    array-length v10, v0

    .line 547
    if-nez v10, :cond_19

    .line 548
    .line 549
    :cond_17
    invoke-virtual {v1, v15}, Ldefpackage/v23;->k(Ldefpackage/ii;)Ldefpackage/t23;

    .line 550
    .line 551
    .line 552
    move-result-object v10

    .line 553
    new-instance v14, Ldefpackage/ik;

    .line 554
    .line 555
    invoke-direct {v14, v9}, Ldefpackage/ik;-><init>(Landroid/content/Intent;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v10, v14, v8, v10}, Ldefpackage/t23;->i(Ldefpackage/ik;ZLdefpackage/t23;)Ldefpackage/p23;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    if-eqz v10, :cond_19

    .line 563
    .line 564
    iget-object v0, v10, Ldefpackage/p23;->n:Ldefpackage/r23;

    .line 565
    .line 566
    invoke-virtual {v0, v5}, Ldefpackage/r23;->b(Ldefpackage/r23;)[I

    .line 567
    .line 568
    .line 569
    move-result-object v12

    .line 570
    iget-object v10, v10, Ldefpackage/p23;->o:Landroid/os/Bundle;

    .line 571
    .line 572
    invoke-virtual {v0, v10}, Ldefpackage/r23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    if-eqz v0, :cond_18

    .line 577
    .line 578
    invoke-virtual {v13, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 579
    .line 580
    .line 581
    :cond_18
    move-object v0, v12

    .line 582
    move-object v12, v5

    .line 583
    :cond_19
    if-eqz v0, :cond_31

    .line 584
    .line 585
    array-length v10, v0

    .line 586
    if-nez v10, :cond_1a

    .line 587
    .line 588
    goto/16 :goto_18

    .line 589
    .line 590
    :cond_1a
    iget-object v10, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 591
    .line 592
    array-length v14, v0

    .line 593
    move-object/from16 p1, v10

    .line 594
    .line 595
    move v10, v7

    .line 596
    :goto_d
    if-ge v10, v14, :cond_20

    .line 597
    .line 598
    move/from16 v16, v8

    .line 599
    .line 600
    aget v8, v0, v10

    .line 601
    .line 602
    if-nez v10, :cond_1c

    .line 603
    .line 604
    iget-object v3, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 605
    .line 606
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    iget v3, v3, Ldefpackage/r23;->u:I

    .line 610
    .line 611
    if-ne v3, v8, :cond_1b

    .line 612
    .line 613
    iget-object v3, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 614
    .line 615
    goto :goto_e

    .line 616
    :cond_1b
    move-object v3, v5

    .line 617
    :goto_e
    move-object v5, v3

    .line 618
    move-object/from16 v3, p1

    .line 619
    .line 620
    goto :goto_f

    .line 621
    :cond_1c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-object/from16 v3, p1

    .line 625
    .line 626
    invoke-virtual {v3, v8, v3, v5, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 627
    .line 628
    .line 629
    move-result-object v18

    .line 630
    move-object/from16 v5, v18

    .line 631
    .line 632
    :goto_f
    if-nez v5, :cond_1d

    .line 633
    .line 634
    sget v3, Ldefpackage/r23;->w:I

    .line 635
    .line 636
    invoke-static {v6, v8}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    goto :goto_11

    .line 641
    :cond_1d
    array-length v8, v0

    .line 642
    add-int/lit8 v8, v8, -0x1

    .line 643
    .line 644
    if-eq v10, v8, :cond_1f

    .line 645
    .line 646
    instance-of v8, v5, Ldefpackage/t23;

    .line 647
    .line 648
    if-eqz v8, :cond_1f

    .line 649
    .line 650
    check-cast v5, Ldefpackage/t23;

    .line 651
    .line 652
    :goto_10
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    iget v3, v5, Ldefpackage/t23;->y:I

    .line 656
    .line 657
    const/4 v8, 0x0

    .line 658
    invoke-virtual {v5, v3, v5, v8, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    instance-of v3, v3, Ldefpackage/t23;

    .line 663
    .line 664
    if-eqz v3, :cond_1e

    .line 665
    .line 666
    iget v3, v5, Ldefpackage/t23;->y:I

    .line 667
    .line 668
    invoke-virtual {v5, v3, v5, v8, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    move-object v5, v3

    .line 673
    check-cast v5, Ldefpackage/t23;

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_1e
    move-object v3, v5

    .line 677
    :cond_1f
    add-int/lit8 v10, v10, 0x1

    .line 678
    .line 679
    move-object/from16 p1, v3

    .line 680
    .line 681
    move/from16 v8, v16

    .line 682
    .line 683
    const/4 v3, 0x0

    .line 684
    const/4 v5, 0x0

    .line 685
    goto :goto_d

    .line 686
    :cond_20
    move/from16 v16, v8

    .line 687
    .line 688
    const/4 v3, 0x0

    .line 689
    :goto_11
    if-eqz v3, :cond_21

    .line 690
    .line 691
    new-instance v0, Ljava/lang/StringBuilder;

    .line 692
    .line 693
    const-string v2, "Could not find destination "

    .line 694
    .line 695
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    const-string v2, " in the navigation graph, ignoring the deep link from "

    .line 702
    .line 703
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v11, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 714
    .line 715
    .line 716
    goto/16 :goto_18

    .line 717
    .line 718
    :cond_21
    const-string v3, "android-support-nav:controller:deepLinkIntent"

    .line 719
    .line 720
    invoke-virtual {v13, v3, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 721
    .line 722
    .line 723
    array-length v3, v0

    .line 724
    new-array v5, v3, [Landroid/os/Bundle;

    .line 725
    .line 726
    move v8, v7

    .line 727
    :goto_12
    if-ge v8, v3, :cond_23

    .line 728
    .line 729
    new-instance v10, Landroid/os/Bundle;

    .line 730
    .line 731
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v10, v13}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 735
    .line 736
    .line 737
    if-eqz v12, :cond_22

    .line 738
    .line 739
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    check-cast v11, Landroid/os/Bundle;

    .line 744
    .line 745
    if-eqz v11, :cond_22

    .line 746
    .line 747
    invoke-virtual {v10, v11}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 748
    .line 749
    .line 750
    :cond_22
    aput-object v10, v5, v8

    .line 751
    .line 752
    add-int/lit8 v8, v8, 0x1

    .line 753
    .line 754
    goto :goto_12

    .line 755
    :cond_23
    invoke-virtual {v9}, Landroid/content/Intent;->getFlags()I

    .line 756
    .line 757
    .line 758
    move-result v3

    .line 759
    const/high16 v8, 0x10000000

    .line 760
    .line 761
    and-int/2addr v8, v3

    .line 762
    if-eqz v8, :cond_26

    .line 763
    .line 764
    const v10, 0x8000

    .line 765
    .line 766
    .line 767
    and-int/2addr v3, v10

    .line 768
    if-nez v3, :cond_26

    .line 769
    .line 770
    invoke-virtual {v9, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 771
    .line 772
    .line 773
    new-instance v0, Ldefpackage/hr4;

    .line 774
    .line 775
    invoke-direct {v0, v6}, Ldefpackage/hr4;-><init>(Landroid/content/Context;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v9}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    if-nez v1, :cond_24

    .line 783
    .line 784
    iget-object v1, v0, Ldefpackage/hr4;->o:Landroid/content/Context;

    .line 785
    .line 786
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    invoke-virtual {v9, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    :cond_24
    if-eqz v1, :cond_25

    .line 795
    .line 796
    invoke-virtual {v0, v1}, Ldefpackage/hr4;->a(Landroid/content/ComponentName;)V

    .line 797
    .line 798
    .line 799
    :cond_25
    iget-object v1, v0, Ldefpackage/hr4;->n:Ljava/util/ArrayList;

    .line 800
    .line 801
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0}, Ldefpackage/hr4;->b()V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2, v7, v7}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_1c

    .line 814
    .line 815
    :cond_26
    const-string v2, "Deep Linking failed: destination "

    .line 816
    .line 817
    if-eqz v8, :cond_2a

    .line 818
    .line 819
    invoke-virtual {v15}, Ldefpackage/ii;->isEmpty()Z

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-nez v3, :cond_27

    .line 824
    .line 825
    iget-object v3, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 826
    .line 827
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    iget v3, v3, Ldefpackage/r23;->u:I

    .line 831
    .line 832
    const/4 v8, 0x1

    .line 833
    const/4 v9, 0x0

    .line 834
    invoke-virtual {v1, v3, v8, v9}, Ldefpackage/v23;->q(IZZ)Z

    .line 835
    .line 836
    .line 837
    :cond_27
    :goto_13
    array-length v3, v0

    .line 838
    if-ge v7, v3, :cond_29

    .line 839
    .line 840
    aget v3, v0, v7

    .line 841
    .line 842
    add-int/lit8 v8, v7, 0x1

    .line 843
    .line 844
    aget-object v7, v5, v7

    .line 845
    .line 846
    const/4 v9, 0x0

    .line 847
    invoke-virtual {v1, v3, v9}, Ldefpackage/v23;->d(ILdefpackage/r23;)Ldefpackage/r23;

    .line 848
    .line 849
    .line 850
    move-result-object v10

    .line 851
    if-eqz v10, :cond_28

    .line 852
    .line 853
    new-instance v3, Ldefpackage/br0;

    .line 854
    .line 855
    const/4 v9, 0x1

    .line 856
    invoke-direct {v3, v9, v10, v1}, Ldefpackage/br0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    new-instance v11, Ldefpackage/z23;

    .line 860
    .line 861
    invoke-direct {v11}, Ldefpackage/z23;-><init>()V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v3, v11}, Ldefpackage/br0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    iget-object v3, v11, Ldefpackage/z23;->a:Ldefpackage/x23;

    .line 868
    .line 869
    const/4 v12, 0x0

    .line 870
    iput-boolean v12, v3, Ldefpackage/x23;->a:Z

    .line 871
    .line 872
    iput-boolean v12, v3, Ldefpackage/x23;->b:Z

    .line 873
    .line 874
    iget v13, v11, Ldefpackage/z23;->b:I

    .line 875
    .line 876
    iget-boolean v11, v11, Ldefpackage/z23;->c:Z

    .line 877
    .line 878
    iput v13, v3, Ldefpackage/x23;->c:I

    .line 879
    .line 880
    iput-boolean v12, v3, Ldefpackage/x23;->d:Z

    .line 881
    .line 882
    iput-boolean v11, v3, Ldefpackage/x23;->e:Z

    .line 883
    .line 884
    invoke-virtual {v3}, Ldefpackage/x23;->a()Ldefpackage/y23;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-virtual {v1, v10, v7, v3}, Ldefpackage/v23;->n(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/y23;)V

    .line 889
    .line 890
    .line 891
    move v7, v8

    .line 892
    goto :goto_13

    .line 893
    :cond_28
    sget v0, Ldefpackage/r23;->w:I

    .line 894
    .line 895
    invoke-static {v6, v3}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-static {v2, v0, v4}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v1}, Ldefpackage/v23;->g()Ldefpackage/r23;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-static {v1, v0}, Ldefpackage/nz2;->m(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 908
    .line 909
    .line 910
    return-void

    .line 911
    :cond_29
    move/from16 v8, v16

    .line 912
    .line 913
    iput-boolean v8, v1, Ldefpackage/v23;->f:Z

    .line 914
    .line 915
    goto/16 :goto_1c

    .line 916
    .line 917
    :cond_2a
    iget-object v3, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 918
    .line 919
    array-length v4, v0

    .line 920
    move v8, v7

    .line 921
    :goto_14
    if-ge v8, v4, :cond_30

    .line 922
    .line 923
    aget v9, v0, v8

    .line 924
    .line 925
    aget-object v10, v5, v8

    .line 926
    .line 927
    if-nez v8, :cond_2b

    .line 928
    .line 929
    iget-object v11, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 930
    .line 931
    goto :goto_15

    .line 932
    :cond_2b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    const/4 v11, 0x0

    .line 936
    invoke-virtual {v3, v9, v3, v11, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 937
    .line 938
    .line 939
    move-result-object v12

    .line 940
    move-object v11, v12

    .line 941
    :goto_15
    if-eqz v11, :cond_2f

    .line 942
    .line 943
    array-length v9, v0

    .line 944
    const/16 v16, 0x1

    .line 945
    .line 946
    add-int/lit8 v9, v9, -0x1

    .line 947
    .line 948
    if-eq v8, v9, :cond_2e

    .line 949
    .line 950
    instance-of v9, v11, Ldefpackage/t23;

    .line 951
    .line 952
    if-eqz v9, :cond_2d

    .line 953
    .line 954
    check-cast v11, Ldefpackage/t23;

    .line 955
    .line 956
    :goto_16
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    iget v3, v11, Ldefpackage/t23;->y:I

    .line 960
    .line 961
    const/4 v9, 0x0

    .line 962
    invoke-virtual {v11, v3, v11, v9, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 963
    .line 964
    .line 965
    move-result-object v3

    .line 966
    instance-of v3, v3, Ldefpackage/t23;

    .line 967
    .line 968
    if-eqz v3, :cond_2c

    .line 969
    .line 970
    iget v3, v11, Ldefpackage/t23;->y:I

    .line 971
    .line 972
    invoke-virtual {v11, v3, v11, v9, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    move-object v11, v3

    .line 977
    check-cast v11, Ldefpackage/t23;

    .line 978
    .line 979
    goto :goto_16

    .line 980
    :cond_2c
    move-object/from16 p1, v0

    .line 981
    .line 982
    move/from16 v16, v4

    .line 983
    .line 984
    move-object/from16 v18, v5

    .line 985
    .line 986
    move-object v5, v6

    .line 987
    move/from16 v17, v8

    .line 988
    .line 989
    move-object v3, v11

    .line 990
    goto :goto_17

    .line 991
    :cond_2d
    move-object/from16 p1, v0

    .line 992
    .line 993
    move/from16 v16, v4

    .line 994
    .line 995
    move-object/from16 v18, v5

    .line 996
    .line 997
    move-object v5, v6

    .line 998
    move/from16 v17, v8

    .line 999
    .line 1000
    goto :goto_17

    .line 1001
    :cond_2e
    iget-object v9, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1002
    .line 1003
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    iget v9, v9, Ldefpackage/r23;->u:I

    .line 1007
    .line 1008
    move-object v12, v6

    .line 1009
    new-instance v6, Ldefpackage/y23;

    .line 1010
    .line 1011
    const/4 v14, -0x1

    .line 1012
    const/4 v15, -0x1

    .line 1013
    move-object v13, v12

    .line 1014
    move v12, v7

    .line 1015
    const/4 v7, 0x0

    .line 1016
    move/from16 v17, v8

    .line 1017
    .line 1018
    const/4 v8, 0x0

    .line 1019
    move-object/from16 v18, v10

    .line 1020
    .line 1021
    const/4 v10, 0x1

    .line 1022
    move-object/from16 v20, v11

    .line 1023
    .line 1024
    const/4 v11, 0x0

    .line 1025
    move-object/from16 v21, v13

    .line 1026
    .line 1027
    move v13, v12

    .line 1028
    move-object/from16 p1, v0

    .line 1029
    .line 1030
    move/from16 v16, v4

    .line 1031
    .line 1032
    move-object/from16 v0, v18

    .line 1033
    .line 1034
    move-object/from16 v4, v20

    .line 1035
    .line 1036
    move-object/from16 v18, v5

    .line 1037
    .line 1038
    move-object/from16 v5, v21

    .line 1039
    .line 1040
    invoke-direct/range {v6 .. v15}, Ldefpackage/y23;-><init>(ZZIZZIIII)V

    .line 1041
    .line 1042
    .line 1043
    move v7, v12

    .line 1044
    invoke-virtual {v1, v4, v0, v6}, Ldefpackage/v23;->n(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/y23;)V

    .line 1045
    .line 1046
    .line 1047
    :goto_17
    add-int/lit8 v8, v17, 0x1

    .line 1048
    .line 1049
    move-object/from16 v0, p1

    .line 1050
    .line 1051
    move-object v6, v5

    .line 1052
    move/from16 v4, v16

    .line 1053
    .line 1054
    move-object/from16 v5, v18

    .line 1055
    .line 1056
    goto/16 :goto_14

    .line 1057
    .line 1058
    :cond_2f
    move-object v5, v6

    .line 1059
    sget v0, Ldefpackage/r23;->w:I

    .line 1060
    .line 1061
    invoke-static {v5, v9}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1066
    .line 1067
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    const-string v0, " cannot be found in graph "

    .line 1076
    .line 1077
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    throw v1

    .line 1091
    :cond_30
    const/4 v8, 0x1

    .line 1092
    iput-boolean v8, v1, Ldefpackage/v23;->f:Z

    .line 1093
    .line 1094
    goto/16 :goto_1c

    .line 1095
    .line 1096
    :cond_31
    :goto_18
    iget-object v0, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1097
    .line 1098
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    move-object/from16 v2, p2

    .line 1102
    .line 1103
    const/4 v9, 0x0

    .line 1104
    invoke-virtual {v1, v0, v2, v9}, Ldefpackage/v23;->n(Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/y23;)V

    .line 1105
    .line 1106
    .line 1107
    goto/16 :goto_1c

    .line 1108
    .line 1109
    :cond_32
    invoke-virtual {v1}, Ldefpackage/v23;->c()Z

    .line 1110
    .line 1111
    .line 1112
    return-void

    .line 1113
    :cond_33
    move-object v15, v3

    .line 1114
    invoke-virtual {v2}, Ldefpackage/mj4;->e()I

    .line 1115
    .line 1116
    .line 1117
    move-result v3

    .line 1118
    move v4, v7

    .line 1119
    :goto_19
    if-ge v4, v3, :cond_36

    .line 1120
    .line 1121
    invoke-virtual {v2, v4}, Ldefpackage/mj4;->f(I)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v5

    .line 1125
    check-cast v5, Ldefpackage/r23;

    .line 1126
    .line 1127
    iget-object v6, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1128
    .line 1129
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1130
    .line 1131
    .line 1132
    iget-object v6, v6, Ldefpackage/t23;->x:Ldefpackage/mj4;

    .line 1133
    .line 1134
    invoke-virtual {v6, v4}, Ldefpackage/mj4;->c(I)I

    .line 1135
    .line 1136
    .line 1137
    move-result v6

    .line 1138
    iget-object v8, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1139
    .line 1140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    iget-object v8, v8, Ldefpackage/t23;->x:Ldefpackage/mj4;

    .line 1144
    .line 1145
    iget-boolean v9, v8, Ldefpackage/mj4;->n:Z

    .line 1146
    .line 1147
    if-eqz v9, :cond_34

    .line 1148
    .line 1149
    invoke-static {v8}, Ldefpackage/su3;->f(Ldefpackage/mj4;)V

    .line 1150
    .line 1151
    .line 1152
    :cond_34
    iget-object v9, v8, Ldefpackage/mj4;->o:[I

    .line 1153
    .line 1154
    iget v10, v8, Ldefpackage/mj4;->q:I

    .line 1155
    .line 1156
    invoke-static {v10, v6, v9}, Ldefpackage/su3;->h(II[I)I

    .line 1157
    .line 1158
    .line 1159
    move-result v6

    .line 1160
    if-ltz v6, :cond_35

    .line 1161
    .line 1162
    iget-object v8, v8, Ldefpackage/mj4;->p:[Ljava/lang/Object;

    .line 1163
    .line 1164
    aget-object v9, v8, v6

    .line 1165
    .line 1166
    aput-object v5, v8, v6

    .line 1167
    .line 1168
    :cond_35
    add-int/lit8 v4, v4, 0x1

    .line 1169
    .line 1170
    goto :goto_19

    .line 1171
    :cond_36
    invoke-virtual {v15}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v3

    .line 1179
    if-eqz v3, :cond_3a

    .line 1180
    .line 1181
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    check-cast v3, Ldefpackage/a23;

    .line 1186
    .line 1187
    sget v4, Ldefpackage/r23;->w:I

    .line 1188
    .line 1189
    iget-object v4, v3, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 1190
    .line 1191
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1192
    .line 1193
    .line 1194
    sget-object v5, Ldefpackage/k5;->y:Ldefpackage/k5;

    .line 1195
    .line 1196
    invoke-static {v5, v4}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    invoke-static {v4}, Ldefpackage/fa4;->f0(Ldefpackage/aa4;)Ljava/util/List;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v4

    .line 1204
    new-instance v5, Ldefpackage/tg2;

    .line 1205
    .line 1206
    invoke-direct {v5, v4}, Ldefpackage/tg2;-><init>(Ljava/util/List;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v4, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1210
    .line 1211
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v5}, Ldefpackage/tg2;->iterator()Ljava/util/Iterator;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v5

    .line 1218
    :goto_1b
    move-object v6, v5

    .line 1219
    check-cast v6, Ldefpackage/f24;

    .line 1220
    .line 1221
    iget-object v6, v6, Ldefpackage/f24;->o:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v6, Ljava/util/ListIterator;

    .line 1224
    .line 1225
    invoke-interface {v6}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1226
    .line 1227
    .line 1228
    move-result v8

    .line 1229
    if-eqz v8, :cond_39

    .line 1230
    .line 1231
    invoke-interface {v6}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v6

    .line 1235
    check-cast v6, Ldefpackage/r23;

    .line 1236
    .line 1237
    iget-object v8, v1, Ldefpackage/v23;->c:Ldefpackage/t23;

    .line 1238
    .line 1239
    invoke-static {v6, v8}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v8

    .line 1243
    if-eqz v8, :cond_38

    .line 1244
    .line 1245
    invoke-virtual {v4, v0}, Ldefpackage/r23;->equals(Ljava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v8

    .line 1249
    if-eqz v8, :cond_38

    .line 1250
    .line 1251
    :cond_37
    const/4 v9, 0x0

    .line 1252
    goto :goto_1b

    .line 1253
    :cond_38
    instance-of v8, v4, Ldefpackage/t23;

    .line 1254
    .line 1255
    if-eqz v8, :cond_37

    .line 1256
    .line 1257
    check-cast v4, Ldefpackage/t23;

    .line 1258
    .line 1259
    iget v6, v6, Ldefpackage/r23;->u:I

    .line 1260
    .line 1261
    const/4 v9, 0x0

    .line 1262
    invoke-virtual {v4, v6, v4, v9, v7}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v4

    .line 1266
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    goto :goto_1b

    .line 1270
    :cond_39
    const/4 v9, 0x0

    .line 1271
    iput-object v4, v3, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 1272
    .line 1273
    goto :goto_1a

    .line 1274
    :cond_3a
    :goto_1c
    return-void
.end method

.method public final w(Ldefpackage/a23;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/v23;->j:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ldefpackage/a23;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v0, p0, Ldefpackage/v23;->k:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    iget-object v1, p1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 45
    .line 46
    iget-object v1, v1, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object p0, p0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ldefpackage/d23;

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ldefpackage/d23;->b(Ldefpackage/a23;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_1
    return-void
.end method

.method public final x()V
    .locals 14

    .line 1
    iget-object v0, p0, Ldefpackage/v23;->g:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/q40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    invoke-static {v0}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ldefpackage/a23;

    .line 20
    .line 21
    iget-object v1, v1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 22
    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    instance-of v3, v1, Ldefpackage/rp0;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-static {v0}, Ldefpackage/q40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ldefpackage/a23;

    .line 51
    .line 52
    iget-object v4, v4, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    instance-of v5, v4, Ldefpackage/rp0;

    .line 58
    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    instance-of v4, v4, Ldefpackage/t23;

    .line 62
    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    :cond_2
    new-instance v3, Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ldefpackage/q40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/4 v6, 0x0

    .line 83
    if-eqz v5, :cond_f

    .line 84
    .line 85
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Ldefpackage/a23;

    .line 90
    .line 91
    iget-object v7, v5, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 92
    .line 93
    iget-object v8, v5, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 94
    .line 95
    const-string v9, "List is empty."

    .line 96
    .line 97
    sget-object v10, Ldefpackage/r92;->r:Ldefpackage/r92;

    .line 98
    .line 99
    sget-object v11, Ldefpackage/r92;->q:Ldefpackage/r92;

    .line 100
    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    iget v12, v8, Ldefpackage/r23;->u:I

    .line 104
    .line 105
    iget v13, v1, Ldefpackage/r23;->u:I

    .line 106
    .line 107
    if-ne v12, v13, :cond_a

    .line 108
    .line 109
    if-eq v7, v10, :cond_7

    .line 110
    .line 111
    iget-object v7, p0, Ldefpackage/v23;->u:Ldefpackage/u43;

    .line 112
    .line 113
    iget-object v12, v8, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v7, v12}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    iget-object v12, p0, Ldefpackage/v23;->v:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-virtual {v12, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, Ldefpackage/d23;

    .line 126
    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    iget-object v7, v7, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 130
    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    iget-object v7, v7, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 134
    .line 135
    invoke-virtual {v7}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Ljava/util/Set;

    .line 140
    .line 141
    if-eqz v7, :cond_4

    .line 142
    .line 143
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    goto :goto_1

    .line 152
    :cond_4
    const/4 v7, 0x0

    .line 153
    :goto_1
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-static {v7, v12}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-nez v7, :cond_6

    .line 160
    .line 161
    iget-object v7, p0, Ldefpackage/v23;->k:Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 168
    .line 169
    if-eqz v7, :cond_5

    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-nez v7, :cond_5

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {v3, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    :goto_2
    invoke-virtual {v3, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_7
    :goto_3
    invoke-static {v2}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ldefpackage/r23;

    .line 190
    .line 191
    if-eqz v5, :cond_9

    .line 192
    .line 193
    iget v5, v5, Ldefpackage/r23;->u:I

    .line 194
    .line 195
    iget v7, v8, Ldefpackage/r23;->u:I

    .line 196
    .line 197
    if-ne v5, v7, :cond_9

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_8

    .line 204
    .line 205
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_8
    invoke-static {v9}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_9
    :goto_4
    iget-object v1, v1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-nez v12, :cond_e

    .line 222
    .line 223
    iget v8, v8, Ldefpackage/r23;->u:I

    .line 224
    .line 225
    invoke-static {v2}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    check-cast v12, Ldefpackage/r23;

    .line 230
    .line 231
    iget v12, v12, Ldefpackage/r23;->u:I

    .line 232
    .line 233
    if-ne v8, v12, :cond_e

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-nez v8, :cond_d

    .line 240
    .line 241
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    check-cast v6, Ldefpackage/r23;

    .line 246
    .line 247
    if-ne v7, v10, :cond_b

    .line 248
    .line 249
    iput-object v11, v5, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 250
    .line 251
    invoke-virtual {v5}, Ldefpackage/a23;->e()V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_b
    if-eq v7, v11, :cond_c

    .line 256
    .line 257
    invoke-virtual {v3, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :cond_c
    :goto_5
    iget-object v5, v6, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 261
    .line 262
    if-eqz v5, :cond_3

    .line 263
    .line 264
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-nez v6, :cond_3

    .line 269
    .line 270
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_d
    invoke-static {v9}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_e
    sget-object v6, Ldefpackage/r92;->p:Ldefpackage/r92;

    .line 280
    .line 281
    iput-object v6, v5, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 282
    .line 283
    invoke-virtual {v5}, Ldefpackage/a23;->e()V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    :goto_6
    if-ge v6, p0, :cond_11

    .line 293
    .line 294
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    add-int/lit8 v6, v6, 0x1

    .line 299
    .line 300
    check-cast v1, Ldefpackage/a23;

    .line 301
    .line 302
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    check-cast v2, Ldefpackage/r92;

    .line 307
    .line 308
    if-eqz v2, :cond_10

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iput-object v2, v1, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 314
    .line 315
    invoke-virtual {v1}, Ldefpackage/a23;->e()V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_10
    invoke-virtual {v1}, Ldefpackage/a23;->e()V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_11
    :goto_7
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/v23;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/v23;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-le v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-object p0, p0, Ldefpackage/v23;->s:Ldefpackage/bd1;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ldefpackage/v83;->c(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
