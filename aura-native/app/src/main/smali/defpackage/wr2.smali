.class public final Ldefpackage/wr2;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:Z

.field public final synthetic c:Ldefpackage/tn2;


# direct methods
.method public constructor <init>(Ldefpackage/tn2;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/wr2;->c:Ldefpackage/tn2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ldefpackage/wr2;->a:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Ldefpackage/wr2;->b:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ldefpackage/wr2;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move p1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p1, v1

    .line 12
    :goto_0
    iput-boolean p1, p0, Ldefpackage/wr2;->a:Z

    .line 13
    .line 14
    iget-boolean p1, p0, Ldefpackage/wr2;->b:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    iput-boolean v1, p0, Ldefpackage/wr2;->b:Z

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/wr2;->c:Ldefpackage/tn2;

    .line 6
    .line 7
    iget-object v3, v2, Ldefpackage/tn2;->g:Ldefpackage/kt2;

    .line 8
    .line 9
    iget v4, v0, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-ne v4, v5, :cond_5

    .line 13
    .line 14
    iget-object v0, v2, Ldefpackage/tn2;->r:Ldefpackage/lk3;

    .line 15
    .line 16
    iget-object v4, v2, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 17
    .line 18
    invoke-virtual {v4}, Ldefpackage/al3;->Z0()Ldefpackage/cu4;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iget-object v6, v2, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 23
    .line 24
    invoke-virtual {v6}, Ldefpackage/al3;->X0()Ldefpackage/za4;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    iget-object v7, v2, Ldefpackage/tn2;->r:Ldefpackage/lk3;

    .line 29
    .line 30
    iget v7, v7, Ldefpackage/lk3;->k:I

    .line 31
    .line 32
    invoke-virtual {v0, v4, v6, v7}, Ldefpackage/lk3;->n(Ldefpackage/cu4;Ldefpackage/za4;I)Ldefpackage/lk3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, v2, Ldefpackage/tn2;->r:Ldefpackage/lk3;

    .line 37
    .line 38
    iget-boolean v10, v1, Ldefpackage/wr2;->a:Z

    .line 39
    .line 40
    iget-boolean v11, v1, Ldefpackage/wr2;->b:Z

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ldefpackage/kt2;->X(Ldefpackage/lk3;)Ldefpackage/lk3;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget-object v12, v3, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 47
    .line 48
    invoke-virtual {v12}, Ldefpackage/na4;->u()Ldefpackage/yw1;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    const/4 v15, 0x0

    .line 53
    :goto_0
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ge v15, v0, :cond_4

    .line 58
    .line 59
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v6, v0

    .line 64
    check-cast v6, Ldefpackage/fr2;

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {v12, v6}, Ldefpackage/na4;->C(Ldefpackage/fr2;)Ldefpackage/yk;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, Ldefpackage/yk;->s()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    move v7, v0

    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object v14, v6

    .line 80
    goto :goto_3

    .line 81
    :catch_1
    move-object v14, v6

    .line 82
    goto :goto_4

    .line 83
    :cond_0
    invoke-virtual {v2, v6}, Ldefpackage/tn2;->j(Ldefpackage/fr2;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_1
    const/4 v7, 0x0

    .line 91
    :goto_1
    invoke-virtual {v12, v6}, Ldefpackage/na4;->B(Ldefpackage/fr2;)Ldefpackage/lk3;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_2
    invoke-virtual {v12, v6}, Ldefpackage/na4;->A(Ldefpackage/fr2;)Landroidx/media3/common/PlaybackException;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v6}, Ldefpackage/na4;->t(Ldefpackage/fr2;)Ldefpackage/mi3;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    iget-object v9, v2, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 106
    .line 107
    invoke-virtual {v9}, Ldefpackage/al3;->o()Ldefpackage/mi3;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-static {v8, v9}, Ldefpackage/ju2;->d(Ldefpackage/mi3;Ldefpackage/mi3;)Ldefpackage/mi3;

    .line 112
    .line 113
    .line 114
    move-result-object v9
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    move-object v8, v6

    .line 116
    :try_start_1
    iget-object v6, v8, Ldefpackage/fr2;->d:Ldefpackage/er2;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3

    .line 119
    .line 120
    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    move-object v14, v8

    .line 124
    move-object v8, v4

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    move-object v14, v8

    .line 127
    move-object v8, v0

    .line 128
    :goto_2
    :try_start_2
    invoke-interface/range {v6 .. v11}, Ldefpackage/er2;->A(ILdefpackage/lk3;Ldefpackage/mi3;ZZ)V
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :catch_2
    move-exception v0

    .line 133
    goto :goto_3

    .line 134
    :catch_3
    move-exception v0

    .line 135
    move-object v14, v8

    .line 136
    goto :goto_3

    .line 137
    :catch_4
    move-object v14, v8

    .line 138
    goto :goto_4

    .line 139
    :goto_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v7, "Exception in "

    .line 142
    .line 143
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const-string v7, "MediaSessionImpl"

    .line 154
    .line 155
    invoke-static {v7, v6, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :catch_5
    :goto_4
    iget-object v0, v3, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 160
    .line 161
    invoke-virtual {v0, v14}, Ldefpackage/na4;->N(Ldefpackage/fr2;)V

    .line 162
    .line 163
    .line 164
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_4
    :goto_6
    iput-boolean v5, v1, Ldefpackage/wr2;->a:Z

    .line 168
    .line 169
    iput-boolean v5, v1, Ldefpackage/wr2;->b:Z

    .line 170
    .line 171
    return-void

    .line 172
    :cond_5
    const-string v1, "Invalid message what="

    .line 173
    .line 174
    iget v0, v0, Landroid/os/Message;->what:I

    .line 175
    .line 176
    invoke-static {v0, v1}, Ldefpackage/zr2;->c(ILjava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method
