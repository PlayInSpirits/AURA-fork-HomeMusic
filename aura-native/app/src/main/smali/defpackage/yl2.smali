.class public final Ldefpackage/yl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final n:Landroid/os/Bundle;

.field public final synthetic o:Ldefpackage/bm2;


# direct methods
.method public constructor <init>(Ldefpackage/bm2;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/yl2;->o:Ldefpackage/bm2;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/yl2;->n:Landroid/os/Bundle;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/yl2;->o:Ldefpackage/bm2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ldefpackage/qa1;

    .line 15
    .line 16
    const/16 v1, 0x12

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 8

    .line 1
    const-string v0, "MCImplBase"

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/yl2;->o:Ldefpackage/bm2;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/bm2;->e:Ldefpackage/cb4;

    .line 6
    .line 7
    const-string v3, "Service "

    .line 8
    .line 9
    const-string v4, "Expected connection to "

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    :try_start_0
    iget-object v6, v2, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 14
    .line 15
    invoke-interface {v6}, Ldefpackage/bb4;->g()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-nez v6, :cond_0

    .line 28
    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, v2, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 35
    .line 36
    invoke-interface {p2}, Ldefpackage/bb4;->g()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p2, " but is connected to "

    .line 44
    .line 45
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v0, p0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    new-instance p2, Ldefpackage/qa1;

    .line 70
    .line 71
    invoke-direct {p2, v5, p1}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {p0, p2}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    :try_start_1
    invoke-static {p2}, Ldefpackage/qs2;->m(Landroid/os/IBinder;)Ldefpackage/su1;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-nez p2, :cond_1

    .line 85
    .line 86
    const-string p0, "Service interface is missing."

    .line 87
    .line 88
    invoke-static {v0, p0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    new-instance p2, Ldefpackage/qa1;

    .line 103
    .line 104
    invoke-direct {p2, v5, p1}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    :try_start_2
    new-instance v2, Ldefpackage/ja0;

    .line 109
    .line 110
    iget-object v4, v1, Ldefpackage/bm2;->d:Landroid/content/Context;

    .line 111
    .line 112
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    iget-object p0, p0, Ldefpackage/yl2;->n:Landroid/os/Bundle;

    .line 121
    .line 122
    iget-object v7, v1, Ldefpackage/bm2;->a:Ldefpackage/sk2;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-direct {v2, v4, v6, p0}, Ldefpackage/ja0;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 128
    .line 129
    .line 130
    iget-object p0, v1, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 131
    .line 132
    invoke-virtual {v2}, Ldefpackage/ja0;->b()Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {p2, p0, v2}, Ldefpackage/su1;->k0(Ldefpackage/ju1;Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catch_0
    :try_start_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string p1, " has died prematurely"

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {v0, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    new-instance p2, Ldefpackage/qa1;

    .line 172
    .line 173
    invoke-direct {p2, v5, p1}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :goto_1
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    new-instance v0, Ldefpackage/qa1;

    .line 189
    .line 190
    invoke-direct {v0, v5, p2}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 194
    .line 195
    .line 196
    throw p0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/yl2;->o:Ldefpackage/bm2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ldefpackage/qa1;

    .line 15
    .line 16
    const/16 v1, 0x12

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
