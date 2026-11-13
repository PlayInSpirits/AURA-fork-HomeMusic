.class public final Ldefpackage/uq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/oq2;

.field public final b:I

.field public final c:Z

.field public final d:Ldefpackage/wq2;

.field public final e:Ldefpackage/wq2;

.field public final f:Ldefpackage/wq2;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/lang/ref/WeakReference;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Ldefpackage/ui1;Ldefpackage/wq2;Ldefpackage/oq2;IZLdefpackage/wq2;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/uq2;->i:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Ldefpackage/uq2;->j:Z

    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/uq2;->h:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    iput-object p2, p0, Ldefpackage/uq2;->e:Ldefpackage/wq2;

    .line 17
    .line 18
    iput-object p3, p0, Ldefpackage/uq2;->a:Ldefpackage/oq2;

    .line 19
    .line 20
    iput p4, p0, Ldefpackage/uq2;->b:I

    .line 21
    .line 22
    iput-boolean p5, p0, Ldefpackage/uq2;->c:Z

    .line 23
    .line 24
    iget-object p2, p1, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 25
    .line 26
    iput-object p2, p0, Ldefpackage/uq2;->d:Ldefpackage/wq2;

    .line 27
    .line 28
    iput-object p6, p0, Ldefpackage/uq2;->f:Ldefpackage/wq2;

    .line 29
    .line 30
    if-nez p7, :cond_0

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p2, p7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iput-object p2, p0, Ldefpackage/uq2;->g:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object p1, p1, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 42
    .line 43
    new-instance p2, Ldefpackage/qa1;

    .line 44
    .line 45
    const/16 p3, 0x14

    .line 46
    .line 47
    invoke-direct {p2, p3, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const-wide/16 p3, 0x3a98

    .line 51
    .line 52
    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/uq2;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/uq2;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ldefpackage/uq2;->j:Z

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/uq2;->a:Ldefpackage/oq2;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/oq2;->h(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/oq2;->d()V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    invoke-static {}, Ldefpackage/yq2;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ldefpackage/uq2;->i:Z

    .line 5
    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    iget-boolean v0, p0, Ldefpackage/uq2;->j:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ldefpackage/uq2;->h:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ldefpackage/ui1;

    .line 21
    .line 22
    if-eqz v1, :cond_8

    .line 23
    .line 24
    iget-object v2, v1, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 25
    .line 26
    if-ne v2, p0, :cond_8

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    iput-boolean v2, p0, Ldefpackage/uq2;->i:Z

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    iput-object v2, v1, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ldefpackage/ui1;

    .line 39
    .line 40
    iget-object v3, p0, Ldefpackage/uq2;->d:Ldefpackage/wq2;

    .line 41
    .line 42
    iget v4, p0, Ldefpackage/uq2;->b:I

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    iget-object v5, v1, Ldefpackage/ui1;->b:Ljava/util/HashMap;

    .line 47
    .line 48
    iget-object v6, v1, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 49
    .line 50
    if-eq v6, v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v6, v1, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 54
    .line 55
    const/16 v7, 0x107

    .line 56
    .line 57
    invoke-virtual {v6, v7, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput v4, v6, Landroid/os/Message;->arg1:I

    .line 62
    .line 63
    invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V

    .line 64
    .line 65
    .line 66
    iget-object v6, v1, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    invoke-virtual {v6, v4}, Ldefpackage/oq2;->h(I)V

    .line 71
    .line 72
    .line 73
    iget-object v6, v1, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 74
    .line 75
    invoke-virtual {v6}, Ldefpackage/oq2;->d()V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_4

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_3

    .line 97
    .line 98
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Ldefpackage/oq2;

    .line 103
    .line 104
    invoke-virtual {v7, v4}, Ldefpackage/oq2;->h(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Ldefpackage/oq2;->d()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 112
    .line 113
    .line 114
    :cond_4
    iput-object v2, v1, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 115
    .line 116
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ldefpackage/ui1;

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    iget-object v1, p0, Ldefpackage/uq2;->e:Ldefpackage/wq2;

    .line 126
    .line 127
    iput-object v1, v0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 128
    .line 129
    iget-object v2, p0, Ldefpackage/uq2;->a:Ldefpackage/oq2;

    .line 130
    .line 131
    iput-object v2, v0, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 132
    .line 133
    iget-object v2, v0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 134
    .line 135
    iget-boolean v5, p0, Ldefpackage/uq2;->c:Z

    .line 136
    .line 137
    iget-object v6, p0, Ldefpackage/uq2;->f:Ldefpackage/wq2;

    .line 138
    .line 139
    if-nez v6, :cond_7

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v6, Ldefpackage/ti1;

    .line 145
    .line 146
    invoke-direct {v6, v3, v1, v5}, Ldefpackage/ti1;-><init>(Ldefpackage/wq2;Ldefpackage/wq2;Z)V

    .line 147
    .line 148
    .line 149
    const/16 v1, 0x106

    .line 150
    .line 151
    invoke-virtual {v2, v1, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput v4, v1, Landroid/os/Message;->arg1:I

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v3, Ldefpackage/ti1;

    .line 165
    .line 166
    invoke-direct {v3, v6, v1, v5}, Ldefpackage/ti1;-><init>(Ldefpackage/wq2;Ldefpackage/wq2;Z)V

    .line 167
    .line 168
    .line 169
    const/16 v1, 0x108

    .line 170
    .line 171
    invoke-virtual {v2, v1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput v4, v1, Landroid/os/Message;->arg1:I

    .line 176
    .line 177
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 178
    .line 179
    .line 180
    :goto_2
    iget-object v1, v0, Ldefpackage/ui1;->b:Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ldefpackage/ui1;->h()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ldefpackage/ui1;->l()V

    .line 189
    .line 190
    .line 191
    iget-object p0, p0, Ldefpackage/uq2;->g:Ljava/util/ArrayList;

    .line 192
    .line 193
    if-eqz p0, :cond_9

    .line 194
    .line 195
    iget-object v0, v0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 196
    .line 197
    invoke-virtual {v0}, Ldefpackage/wq2;->a()Ldefpackage/tq2;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-eqz v0, :cond_9

    .line 202
    .line 203
    invoke-virtual {v0, p0}, Ldefpackage/tq2;->o(Ljava/util/Collection;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_8
    invoke-virtual {p0}, Ldefpackage/uq2;->a()V

    .line 208
    .line 209
    .line 210
    :cond_9
    :goto_3
    return-void
.end method
