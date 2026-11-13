.class public final Ldefpackage/ew2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final n:Ldefpackage/dw2;

.field public o:Ldefpackage/bq;

.field public p:Ldefpackage/no2;

.field public q:Ldefpackage/cu4;

.field public r:Z

.field public final synthetic s:Ldefpackage/fw2;


# direct methods
.method public constructor <init>(Ldefpackage/fw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 5
    .line 6
    new-instance p1, Ldefpackage/dw2;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Ldefpackage/dw2;-><init>(Ldefpackage/ew2;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/ew2;->n:Ldefpackage/dw2;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/ew2;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq v0, v1, :cond_8

    .line 12
    .line 13
    if-eq v0, v3, :cond_6

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    if-eq v0, p1, :cond_5

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-eq v0, p1, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    iget-object p1, p0, Ldefpackage/ew2;->p:Ldefpackage/no2;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Ldefpackage/ew2;->o:Ldefpackage/bq;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/ew2;->p:Ldefpackage/no2;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ldefpackage/bq;->n(Ldefpackage/no2;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Ldefpackage/ew2;->o:Ldefpackage/bq;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Ldefpackage/ew2;->n:Ldefpackage/dw2;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ldefpackage/bq;->o(Ldefpackage/nt2;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object p1, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 47
    .line 48
    iget-object p1, p1, Ldefpackage/fw2;->c:Ldefpackage/yp4;

    .line 49
    .line 50
    invoke-virtual {p1}, Ldefpackage/yp4;->e()V

    .line 51
    .line 52
    .line 53
    sget-object p1, Ldefpackage/fw2;->g:Ldefpackage/gw2;

    .line 54
    .line 55
    monitor-enter p1

    .line 56
    :try_start_0
    iget v0, p1, Ldefpackage/gw2;->c:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    iput v0, p1, Ldefpackage/gw2;->c:I

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p1, Ldefpackage/gw2;->b:Landroid/os/HandlerThread;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 69
    .line 70
    .line 71
    iput-object v2, p1, Ldefpackage/gw2;->b:Landroid/os/HandlerThread;

    .line 72
    .line 73
    iget-object v0, p1, Ldefpackage/gw2;->a:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-virtual {p1}, Ldefpackage/gw2;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :goto_0
    monitor-exit p1

    .line 85
    iput-boolean v1, p0, Ldefpackage/ew2;->r:Z

    .line 86
    .line 87
    return v1

    .line 88
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p0

    .line 90
    :cond_5
    iget-object p0, p0, Ldefpackage/ew2;->p:Ldefpackage/no2;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance p1, Ldefpackage/od2;

    .line 96
    .line 97
    invoke-direct {p1}, Ldefpackage/od2;-><init>()V

    .line 98
    .line 99
    .line 100
    const-wide/16 v2, 0x0

    .line 101
    .line 102
    iput-wide v2, p1, Ldefpackage/od2;->a:J

    .line 103
    .line 104
    new-instance v0, Ldefpackage/pd2;

    .line 105
    .line 106
    invoke-direct {v0, p1}, Ldefpackage/pd2;-><init>(Ldefpackage/od2;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0, v0}, Ldefpackage/da4;->o(Ldefpackage/pd2;)Z

    .line 110
    .line 111
    .line 112
    return v1

    .line 113
    :cond_6
    :try_start_2
    iget-object p1, p0, Ldefpackage/ew2;->p:Ldefpackage/no2;

    .line 114
    .line 115
    if-nez p1, :cond_7

    .line 116
    .line 117
    iget-object p1, p0, Ldefpackage/ew2;->o:Ldefpackage/bq;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ldefpackage/bq;->j()V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catch_0
    move-exception p1

    .line 127
    goto :goto_3

    .line 128
    :cond_7
    invoke-interface {p1}, Ldefpackage/no2;->h()V

    .line 129
    .line 130
    .line 131
    :goto_2
    iget-object p1, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 132
    .line 133
    iget-object p1, p1, Ldefpackage/fw2;->c:Ldefpackage/yp4;

    .line 134
    .line 135
    const/16 v0, 0x64

    .line 136
    .line 137
    invoke-virtual {p1, v3, v0}, Ldefpackage/yp4;->h(II)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 138
    .line 139
    .line 140
    return v1

    .line 141
    :goto_3
    iget-object v0, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 142
    .line 143
    iget-object v0, v0, Ldefpackage/fw2;->e:Ldefpackage/bw2;

    .line 144
    .line 145
    iget-object v0, v0, Ldefpackage/bw2;->a:Ldefpackage/hw2;

    .line 146
    .line 147
    iget-object v4, v0, Ldefpackage/hw2;->p:Ljava/lang/Object;

    .line 148
    .line 149
    monitor-enter v4

    .line 150
    :try_start_3
    iget-object v0, v0, Ldefpackage/hw2;->r:Ldefpackage/lb4;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 156
    .line 157
    .line 158
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    iget-object p0, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 160
    .line 161
    invoke-virtual {p0}, Ldefpackage/fw2;->a()V

    .line 162
    .line 163
    .line 164
    return v1

    .line 165
    :catchall_1
    move-exception p0

    .line 166
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    throw p0

    .line 168
    :cond_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, Ldefpackage/gn2;

    .line 171
    .line 172
    iget-object v0, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 173
    .line 174
    iget-object v0, v0, Ldefpackage/fw2;->a:Ldefpackage/dm0;

    .line 175
    .line 176
    invoke-virtual {v0, p1}, Ldefpackage/dm0;->d(Ldefpackage/gn2;)Ldefpackage/bq;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iput-object p1, p0, Ldefpackage/ew2;->o:Ldefpackage/bq;

    .line 181
    .line 182
    iget-object v0, p0, Ldefpackage/ew2;->n:Ldefpackage/dw2;

    .line 183
    .line 184
    sget-object v4, Ldefpackage/ik3;->c:Ldefpackage/ik3;

    .line 185
    .line 186
    invoke-virtual {p1, v0, v2, v4}, Ldefpackage/bq;->k(Ldefpackage/nt2;Ldefpackage/rw4;Ldefpackage/ik3;)V

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, Ldefpackage/ew2;->s:Ldefpackage/fw2;

    .line 190
    .line 191
    iget-object p0, p0, Ldefpackage/fw2;->c:Ldefpackage/yp4;

    .line 192
    .line 193
    invoke-virtual {p0, v3}, Ldefpackage/yp4;->g(I)V

    .line 194
    .line 195
    .line 196
    return v1
.end method
