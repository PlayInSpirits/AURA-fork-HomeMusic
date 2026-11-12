.class public final Lgf5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgj1;
.implements Lhj1;


# instance fields
.field public final e:Ljava/util/LinkedList;

.field public final f:Lme;

.field public final g:Lve;

.field public final h:Lxc5;

.field public final i:Ljava/util/HashSet;

.field public final j:Ljava/util/HashMap;

.field public final k:I

.field public final l:Lrf5;

.field public m:Z

.field public final n:Ljava/util/ArrayList;

.field public o:Lka0;

.field public p:I

.field public final synthetic q:Lij1;


# direct methods
.method public constructor <init>(Lij1;Ldj1;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgf5;->q:Lij1;

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lgf5;->i:Ljava/util/HashSet;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lgf5;->j:Ljava/util/HashMap;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lgf5;->n:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lgf5;->o:Lka0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput v1, p0, Lgf5;->p:I

    .line 39
    .line 40
    iget-object v1, p1, Lij1;->A:Lzw2;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {p2}, Ldj1;->a()Lc12;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v5, Lml3;

    .line 51
    .line 52
    iget-object v2, v1, Lc12;->o:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Lqi;

    .line 55
    .line 56
    iget-object v3, v1, Lc12;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, v1, Lc12;->q:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v5, v2, v3, v1}, Lml3;-><init>(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p2, Ldj1;->c:Lrf2;

    .line 68
    .line 69
    iget-object v1, v1, Lrf2;->n:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v2, v1

    .line 72
    check-cast v2, Lvr1;

    .line 73
    .line 74
    invoke-static {v2}, Lji2;->m(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v6, p2, Ldj1;->d:Lle;

    .line 78
    .line 79
    iget-object v3, p2, Ldj1;->a:Landroid/content/Context;

    .line 80
    .line 81
    move-object v8, p0

    .line 82
    move-object v7, p0

    .line 83
    invoke-virtual/range {v2 .. v8}, Lvr1;->a(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgj1;Lhj1;)Lme;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object v1, p2, Ldj1;->b:Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    instance-of v2, p0, Lcom/google/android/gms/common/internal/a;

    .line 92
    .line 93
    if-eqz v2, :cond_0

    .line 94
    .line 95
    move-object v2, p0

    .line 96
    check-cast v2, Lcom/google/android/gms/common/internal/a;

    .line 97
    .line 98
    iput-object v1, v2, Lcom/google/android/gms/common/internal/a;->E:Ljava/lang/String;

    .line 99
    .line 100
    :cond_0
    if-eqz v1, :cond_2

    .line 101
    .line 102
    instance-of v1, p0, Ll63;

    .line 103
    .line 104
    if-nez v1, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-static {p0}, Lxa3;->r(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_2
    :goto_0
    iput-object p0, v7, Lgf5;->f:Lme;

    .line 112
    .line 113
    iget-object v1, p2, Ldj1;->e:Lve;

    .line 114
    .line 115
    iput-object v1, v7, Lgf5;->g:Lve;

    .line 116
    .line 117
    new-instance v1, Lxc5;

    .line 118
    .line 119
    const/16 v2, 0x17

    .line 120
    .line 121
    invoke-direct {v1, v2}, Lxc5;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object v1, v7, Lgf5;->h:Lxc5;

    .line 125
    .line 126
    iget v1, p2, Ldj1;->g:I

    .line 127
    .line 128
    iput v1, v7, Lgf5;->k:I

    .line 129
    .line 130
    invoke-interface {p0}, Lme;->i0()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    iget-object p0, p1, Lij1;->r:Landroid/content/Context;

    .line 137
    .line 138
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 139
    .line 140
    new-instance v0, Lrf5;

    .line 141
    .line 142
    invoke-virtual {p2}, Ldj1;->a()Lc12;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    new-instance v1, Lml3;

    .line 147
    .line 148
    iget-object v2, p2, Lc12;->o:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Lqi;

    .line 151
    .line 152
    iget-object v3, p2, Lc12;->p:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Ljava/lang/String;

    .line 155
    .line 156
    iget-object p2, p2, Lc12;->q:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p2, Ljava/lang/String;

    .line 159
    .line 160
    invoke-direct {v1, v2, v3, p2}, Lml3;-><init>(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v0, p0, p1, v1}, Lrf5;-><init>(Landroid/content/Context;Lzw2;Lml3;)V

    .line 164
    .line 165
    .line 166
    iput-object v0, v7, Lgf5;->l:Lrf5;

    .line 167
    .line 168
    return-void

    .line 169
    :cond_3
    iput-object v0, v7, Lgf5;->l:Lrf5;

    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public final U(I)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 6
    .line 7
    iget-object v1, v1, Lij1;->A:Lzw2;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lgf5;->f(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lrq;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v0, p1, v2, p0}, Lrq;-><init>(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final X()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 6
    .line 7
    iget-object v1, v1, Lij1;->A:Lzw2;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lgf5;->e()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lwu4;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {v0, v2, p0}, Lwu4;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final a(Lka0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgf5;->i:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lka0;->r:Lka0;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p0, p0, Lgf5;->f:Lme;

    .line 28
    .line 29
    invoke-interface {p0}, Lme;->d0()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final b(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, p1, v0, v1}, Lgf5;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    :cond_1
    if-eq v2, v0, :cond_6

    .line 19
    .line 20
    iget-object p0, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcg5;

    .line 37
    .line 38
    if-eqz p3, :cond_3

    .line 39
    .line 40
    iget v1, v0, Lcg5;->a:I

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    :cond_3
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lcg5;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    invoke-virtual {v0, p2}, Lcg5;->b(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    return-void

    .line 59
    :cond_6
    const-string p0, "Status XOR exception should be null"

    .line 60
    .line 61
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final d()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcg5;

    .line 20
    .line 21
    iget-object v5, p0, Lgf5;->f:Lme;

    .line 22
    .line 23
    invoke-interface {v5}, Lme;->Y()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {p0, v4}, Lgf5;->h(Lcg5;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v1, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v1}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lgf5;->o:Lka0;

    .line 10
    .line 11
    sget-object v1, Lka0;->r:Lka0;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lgf5;->a(Lka0;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 17
    .line 18
    iget-boolean v1, p0, Lgf5;->m:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0xb

    .line 23
    .line 24
    iget-object v2, p0, Lgf5;->g:Lve;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lgf5;->m:Z

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lgf5;->j:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Lgf5;->d()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lgf5;->g()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-static {v0}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0
.end method

.method public final f(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v1, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    iget-object v2, v0, Lij1;->A:Lzw2;

    .line 6
    .line 7
    invoke-static {v2}, Lji2;->j(Landroid/os/Handler;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lgf5;->o:Lka0;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    iput-boolean v3, p0, Lgf5;->m:Z

    .line 15
    .line 16
    iget-object v4, p0, Lgf5;->f:Lme;

    .line 17
    .line 18
    invoke-interface {v4}, Lme;->h0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iget-object v5, p0, Lgf5;->h:Lxc5;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v7, "The connection to Google Play services was lost"

    .line 30
    .line 31
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    if-ne p1, v3, :cond_0

    .line 35
    .line 36
    const-string p1, " due to service disconnection."

    .line 37
    .line 38
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v7, 0x3

    .line 43
    if-ne p1, v7, :cond_1

    .line 44
    .line 45
    const-string p1, " due to dead object exception."

    .line 46
    .line 47
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 51
    .line 52
    const-string p1, " Last reason for disconnect: "

    .line 53
    .line 54
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v4, Lcom/google/android/gms/common/api/Status;

    .line 65
    .line 66
    const/16 v6, 0x14

    .line 67
    .line 68
    invoke-direct {v4, v6, p1, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v3, v4}, Lxc5;->x(ZLcom/google/android/gms/common/api/Status;)V

    .line 72
    .line 73
    .line 74
    const/16 p1, 0x9

    .line 75
    .line 76
    iget-object v2, p0, Lgf5;->g:Lve;

    .line 77
    .line 78
    invoke-static {v1, p1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-wide/16 v3, 0x1388

    .line 83
    .line 84
    invoke-virtual {v1, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 85
    .line 86
    .line 87
    const/16 p1, 0xb

    .line 88
    .line 89
    invoke-static {v1, p1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-wide/32 v2, 0x1d4c0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, v0, Lij1;->t:Lhd5;

    .line 100
    .line 101
    iget-object p1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Landroid/util/SparseIntArray;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lgf5;->j:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    invoke-static {p0}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    throw p0
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v1, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    iget-object p0, p0, Lgf5;->g:Lve;

    .line 8
    .line 9
    invoke-virtual {v1, v2, p0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-wide v2, v0, Lij1;->n:J

    .line 17
    .line 18
    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final h(Lcg5;)Z
    .locals 14

    .line 1
    instance-of v0, p1, Lkf5;

    .line 2
    .line 3
    const-string v1, "DeadObjectException thrown while running ApiCallRunner."

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lgf5;->h:Lxc5;

    .line 9
    .line 10
    iget-object v3, p0, Lgf5;->f:Lme;

    .line 11
    .line 12
    invoke-interface {v3}, Lme;->i0()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-virtual {p1, v0, v4}, Lcg5;->d(Lxc5;Z)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1, p0}, Lcg5;->c(Lgf5;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :catch_0
    invoke-virtual {p0, v2}, Lgf5;->U(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v3, v1}, Lme;->a0(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    move-object v0, p1

    .line 31
    check-cast v0, Lkf5;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lkf5;->g(Lgf5;)[Lp61;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    array-length v6, v3

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget-object v6, p0, Lgf5;->f:Lme;

    .line 46
    .line 47
    invoke-interface {v6}, Lme;->g0()[Lp61;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    new-array v6, v4, [Lp61;

    .line 54
    .line 55
    :cond_2
    new-instance v7, Loi;

    .line 56
    .line 57
    array-length v8, v6

    .line 58
    invoke-direct {v7, v8}, Lyd4;-><init>(I)V

    .line 59
    .line 60
    .line 61
    move v8, v4

    .line 62
    :goto_0
    array-length v9, v6

    .line 63
    if-ge v8, v9, :cond_3

    .line 64
    .line 65
    aget-object v9, v6, v8

    .line 66
    .line 67
    iget-object v10, v9, Lp61;->n:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v9}, Lp61;->b()J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v7, v10, v9}, Lyd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    array-length v6, v3

    .line 84
    move v8, v4

    .line 85
    :goto_1
    if-ge v8, v6, :cond_5

    .line 86
    .line 87
    aget-object v9, v3, v8

    .line 88
    .line 89
    iget-object v10, v9, Lp61;->n:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v7, v10}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    check-cast v10, Ljava/lang/Long;

    .line 96
    .line 97
    if-eqz v10, :cond_6

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-virtual {v9}, Lp61;->b()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    cmp-long v10, v10, v12

    .line 108
    .line 109
    if-gez v10, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    :goto_2
    move-object v9, v5

    .line 116
    :cond_6
    :goto_3
    if-nez v9, :cond_7

    .line 117
    .line 118
    iget-object v0, p0, Lgf5;->h:Lxc5;

    .line 119
    .line 120
    iget-object v3, p0, Lgf5;->f:Lme;

    .line 121
    .line 122
    invoke-interface {v3}, Lme;->i0()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-virtual {p1, v0, v4}, Lcg5;->d(Lxc5;Z)V

    .line 127
    .line 128
    .line 129
    :try_start_1
    invoke-virtual {p1, p0}, Lcg5;->c(Lgf5;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1

    .line 130
    .line 131
    .line 132
    return v2

    .line 133
    :catch_1
    invoke-virtual {p0, v2}, Lgf5;->U(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v3, v1}, Lme;->a0(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return v2

    .line 140
    :cond_7
    iget-object p1, p0, Lgf5;->f:Lme;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v1, v9, Lp61;->n:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v9}, Lp61;->b()J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    new-instance v3, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string p1, " could not execute call because it requires feature ("

    .line 165
    .line 166
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p1, ", "

    .line 173
    .line 174
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p1, ")."

    .line 181
    .line 182
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v1, "GoogleApiManager"

    .line 190
    .line 191
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 195
    .line 196
    iget-boolean p1, p1, Lij1;->B:Z

    .line 197
    .line 198
    if-eqz p1, :cond_a

    .line 199
    .line 200
    invoke-virtual {v0, p0}, Lkf5;->f(Lgf5;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_a

    .line 205
    .line 206
    iget-object p1, p0, Lgf5;->g:Lve;

    .line 207
    .line 208
    new-instance v0, Lhf5;

    .line 209
    .line 210
    invoke-direct {v0, p1, v9}, Lhf5;-><init>(Lve;Lp61;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lgf5;->n:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    iget-object v1, p0, Lgf5;->n:Ljava/util/ArrayList;

    .line 220
    .line 221
    const-wide/16 v2, 0x1388

    .line 222
    .line 223
    const/16 v6, 0xf

    .line 224
    .line 225
    if-ltz p1, :cond_8

    .line 226
    .line 227
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Lhf5;

    .line 232
    .line 233
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 234
    .line 235
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 236
    .line 237
    invoke-virtual {v0, v6, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object p0, p0, Lgf5;->q:Lij1;

    .line 241
    .line 242
    iget-object p0, p0, Lij1;->A:Lzw2;

    .line 243
    .line 244
    invoke-static {p0, v6, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {p0, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 249
    .line 250
    .line 251
    return v4

    .line 252
    :cond_8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 256
    .line 257
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 258
    .line 259
    invoke-static {p1, v6, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 267
    .line 268
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 269
    .line 270
    const/16 v1, 0x10

    .line 271
    .line 272
    invoke-static {p1, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const-wide/32 v1, 0x1d4c0

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 280
    .line 281
    .line 282
    new-instance p1, Lka0;

    .line 283
    .line 284
    const/4 v0, 0x2

    .line 285
    invoke-direct {p1, v0, v5}, Lka0;-><init>(ILandroid/app/PendingIntent;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, p1}, Lgf5;->i(Lka0;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_9

    .line 293
    .line 294
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 295
    .line 296
    iget p0, p0, Lgf5;->k:I

    .line 297
    .line 298
    invoke-virtual {v0, p1, p0}, Lij1;->c(Lka0;I)Z

    .line 299
    .line 300
    .line 301
    :cond_9
    return v4

    .line 302
    :cond_a
    new-instance p0, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    .line 303
    .line 304
    invoke-direct {p0, v9}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lp61;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, p0}, Lcg5;->b(Ljava/lang/Exception;)V

    .line 308
    .line 309
    .line 310
    return v2
.end method

.method public final i(Lka0;)Z
    .locals 4

    .line 1
    sget-object v0, Lij1;->E:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 5
    .line 6
    iget-object v2, v1, Lij1;->x:Ldf5;

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget-object v1, v1, Lij1;->y:Lqi;

    .line 11
    .line 12
    iget-object v2, p0, Lgf5;->g:Lve;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lqi;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 21
    .line 22
    iget-object v1, v1, Lij1;->x:Ldf5;

    .line 23
    .line 24
    iget p0, p0, Lgf5;->k:I

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, Leg5;

    .line 30
    .line 31
    invoke-direct {v2, p1, p0}, Leg5;-><init>(Lka0;I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p0, v1, Ldf5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    invoke-virtual {p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object p0, v1, Ldf5;->q:Lzw2;

    .line 45
    .line 46
    new-instance p1, Lqf5;

    .line 47
    .line 48
    invoke-direct {p1, v3, v1, v2}, Lqf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    :goto_0
    monitor-exit v0

    .line 68
    return v3

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    monitor-exit v0

    .line 72
    const/4 p0, 0x0

    .line 73
    return p0

    .line 74
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    throw p0
.end method

.method public final j()V
    .locals 11

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v1, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v1}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lgf5;->f:Lme;

    .line 9
    .line 10
    invoke-interface {v1}, Lme;->Y()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_a

    .line 15
    .line 16
    invoke-interface {v1}, Lme;->c0()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_0
    const/16 v2, 0xa

    .line 25
    .line 26
    :try_start_0
    iget-object v3, v0, Lij1;->t:Lhd5;

    .line 27
    .line 28
    iget-object v4, v0, Lij1;->r:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v5, v3, Lhd5;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-static {v4}, Lji2;->m(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Lme;->f0()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    iget-object v7, v3, Lhd5;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Landroid/util/SparseIntArray;

    .line 44
    .line 45
    const/4 v8, -0x1

    .line 46
    invoke-virtual {v7, v6, v8}, Landroid/util/SparseIntArray;->get(II)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eq v7, v8, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/4 v7, 0x0

    .line 54
    move v9, v7

    .line 55
    :goto_0
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->size()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-ge v9, v10, :cond_3

    .line 60
    .line 61
    invoke-virtual {v5, v9}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-le v10, v6, :cond_2

    .line 66
    .line 67
    invoke-virtual {v5, v10}, Landroid/util/SparseIntArray;->get(I)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-nez v10, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v7, v8

    .line 78
    :goto_1
    if-ne v7, v8, :cond_4

    .line 79
    .line 80
    iget-object v3, v3, Lhd5;->p:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v3, Lej1;

    .line 83
    .line 84
    invoke-virtual {v3, v4, v6}, Lfj1;->b(Landroid/content/Context;I)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    move v7, v3

    .line 89
    :cond_4
    invoke-virtual {v5, v6, v7}, Landroid/util/SparseIntArray;->put(II)V

    .line 90
    .line 91
    .line 92
    :goto_2
    if-eqz v7, :cond_5

    .line 93
    .line 94
    new-instance v0, Lka0;

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-direct {v0, v7, v3}, Lka0;-><init>(ILandroid/app/PendingIntent;)V

    .line 98
    .line 99
    .line 100
    const-string v4, "GoogleApiManager"

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v0}, Lka0;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v6, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v7, "The service for "

    .line 120
    .line 121
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v1, " is not available: "

    .line 128
    .line 129
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0, v3}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :catch_0
    move-exception v0

    .line 147
    goto :goto_5

    .line 148
    :cond_5
    new-instance v3, Lnq;

    .line 149
    .line 150
    iget-object v4, p0, Lgf5;->g:Lve;

    .line 151
    .line 152
    invoke-direct {v3, v0, v1, v4}, Lnq;-><init>(Lij1;Lme;Lve;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v1}, Lme;->i0()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    iget-object v9, p0, Lgf5;->l:Lrf5;

    .line 162
    .line 163
    invoke-static {v9}, Lji2;->m(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, v9, Lrf5;->g:Landroid/os/Handler;

    .line 167
    .line 168
    iget-object v7, v9, Lrf5;->j:Lml3;

    .line 169
    .line 170
    iget-object v4, v9, Lrf5;->k:Lsd4;

    .line 171
    .line 172
    if-eqz v4, :cond_6

    .line 173
    .line 174
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/a;->b()V

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    iput-object v4, v7, Lml3;->f:Ljava/lang/Object;

    .line 186
    .line 187
    iget-object v4, v9, Lrf5;->h:Lu02;

    .line 188
    .line 189
    iget-object v5, v9, Lrf5;->f:Landroid/content/Context;

    .line 190
    .line 191
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    iget-object v8, v7, Lml3;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v8, Lud4;

    .line 198
    .line 199
    move-object v10, v9

    .line 200
    invoke-virtual/range {v4 .. v10}, Lu02;->a(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgj1;Lhj1;)Lme;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, Lsd4;

    .line 205
    .line 206
    iput-object v4, v9, Lrf5;->k:Lsd4;

    .line 207
    .line 208
    iput-object v3, v9, Lrf5;->l:Lnq;

    .line 209
    .line 210
    iget-object v4, v9, Lrf5;->i:Ljava/util/Set;

    .line 211
    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_7

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_7
    iget-object v0, v9, Lrf5;->k:Lsd4;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v4, Ld34;

    .line 227
    .line 228
    const/16 v5, 0x9

    .line 229
    .line 230
    invoke-direct {v4, v5, v0}, Ld34;-><init>(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v4}, Lcom/google/android/gms/common/internal/a;->e0(Lpp;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_8
    :goto_3
    new-instance v4, Lwu4;

    .line 238
    .line 239
    const/4 v5, 0x7

    .line 240
    invoke-direct {v4, v5, v9}, Lwu4;-><init>(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 244
    .line 245
    .line 246
    :cond_9
    :goto_4
    :try_start_1
    invoke-interface {v1, v3}, Lme;->e0(Lpp;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :catch_1
    move-exception v0

    .line 251
    new-instance v1, Lka0;

    .line 252
    .line 253
    invoke-direct {v1, v2}, Lka0;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v1, v0}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :goto_5
    new-instance v1, Lka0;

    .line 261
    .line 262
    invoke-direct {v1, v2}, Lka0;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v1, v0}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 266
    .line 267
    .line 268
    :cond_a
    :goto_6
    return-void
.end method

.method public final k(Lcg5;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgf5;->f:Lme;

    .line 9
    .line 10
    invoke-interface {v0}, Lme;->Y()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lgf5;->h(Lcg5;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lgf5;->g()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lgf5;->o:Lka0;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget v0, p1, Lka0;->o:I

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p1, Lka0;->p:Landroid/app/PendingIntent;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0}, Lgf5;->j()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final l(Lka0;Ljava/lang/RuntimeException;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgf5;->l:Lrf5;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lrf5;->k:Lsd4;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->b()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 20
    .line 21
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 22
    .line 23
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lgf5;->o:Lka0;

    .line 28
    .line 29
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 30
    .line 31
    iget-object v1, v1, Lij1;->t:Lhd5;

    .line 32
    .line 33
    iget-object v1, v1, Lhd5;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Landroid/util/SparseIntArray;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lgf5;->a(Lka0;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lgf5;->f:Lme;

    .line 44
    .line 45
    instance-of v1, v1, Lfg5;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget v1, p1, Lka0;->o:I

    .line 51
    .line 52
    const/16 v3, 0x18

    .line 53
    .line 54
    if-eq v1, v3, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 57
    .line 58
    iput-boolean v2, v1, Lij1;->o:Z

    .line 59
    .line 60
    iget-object v1, v1, Lij1;->A:Lzw2;

    .line 61
    .line 62
    const/16 v3, 0x13

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-wide/32 v4, 0x493e0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    iget v1, p1, Lka0;->o:I

    .line 75
    .line 76
    const/4 v3, 0x4

    .line 77
    if-ne v1, v3, :cond_2

    .line 78
    .line 79
    sget-object p1, Lij1;->D:Lcom/google/android/gms/common/api/Status;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-object v1, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iput-object p1, p0, Lgf5;->o:Lka0;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 97
    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    iget-object p1, v1, Lij1;->A:Lzw2;

    .line 101
    .line 102
    invoke-static {p1}, Lji2;->j(Landroid/os/Handler;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-virtual {p0, v0, p2, p1}, Lgf5;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    iget-boolean p2, v1, Lij1;->B:Z

    .line 111
    .line 112
    iget-object v1, p0, Lgf5;->g:Lve;

    .line 113
    .line 114
    if-eqz p2, :cond_9

    .line 115
    .line 116
    invoke-static {v1, p1}, Lij1;->d(Lve;Lka0;)Lcom/google/android/gms/common/api/Status;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p0, p2, v0, v2}, Lgf5;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 124
    .line 125
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_5

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    invoke-virtual {p0, p1}, Lgf5;->i(Lka0;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-nez p2, :cond_8

    .line 137
    .line 138
    iget-object p2, p0, Lgf5;->q:Lij1;

    .line 139
    .line 140
    iget v0, p0, Lgf5;->k:I

    .line 141
    .line 142
    invoke-virtual {p2, p1, v0}, Lij1;->c(Lka0;I)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-nez p2, :cond_8

    .line 147
    .line 148
    iget p2, p1, Lka0;->o:I

    .line 149
    .line 150
    const/16 v0, 0x12

    .line 151
    .line 152
    if-ne p2, v0, :cond_6

    .line 153
    .line 154
    iput-boolean v2, p0, Lgf5;->m:Z

    .line 155
    .line 156
    :cond_6
    iget-boolean p2, p0, Lgf5;->m:Z

    .line 157
    .line 158
    if-eqz p2, :cond_7

    .line 159
    .line 160
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 161
    .line 162
    iget-object p0, p0, Lgf5;->g:Lve;

    .line 163
    .line 164
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 165
    .line 166
    const/16 p2, 0x9

    .line 167
    .line 168
    invoke-static {p1, p2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-wide/16 v0, 0x1388

    .line 173
    .line 174
    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_7
    iget-object p2, p0, Lgf5;->g:Lve;

    .line 179
    .line 180
    invoke-static {p2, p1}, Lij1;->d(Lve;Lka0;)Lcom/google/android/gms/common/api/Status;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p0, p1}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 185
    .line 186
    .line 187
    :cond_8
    :goto_0
    return-void

    .line 188
    :cond_9
    invoke-static {v1, p1}, Lij1;->d(Lve;Lka0;)Lcom/google/android/gms/common/api/Status;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p1}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final m(Lka0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final n(Lka0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgf5;->f:Lme;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "onSignInFailed for "

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " with "

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, Lme;->a0(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, Lgf5;->q:Lij1;

    .line 2
    .line 3
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 4
    .line 5
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lij1;->C:Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lgf5;->h:Lxc5;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2, v0}, Lxc5;->x(ZLcom/google/android/gms/common/api/Status;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lgf5;->j:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-array v1, v2, [Lpc2;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, [Lpc2;

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_0

    .line 35
    .line 36
    aget-object v3, v0, v2

    .line 37
    .line 38
    new-instance v3, Lag5;

    .line 39
    .line 40
    new-instance v4, Lcr4;

    .line 41
    .line 42
    invoke-direct {v4}, Lcr4;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4}, Lag5;-><init>(Lcr4;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lgf5;->k(Lcg5;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Lka0;

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    invoke-direct {v0, v1}, Lka0;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lgf5;->a(Lka0;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lgf5;->f:Lme;

    .line 64
    .line 65
    invoke-interface {v0}, Lme;->Y()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    new-instance v2, Lh45;

    .line 72
    .line 73
    invoke-direct {v2, v1, p0}, Lh45;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v2}, Lme;->b0(Lh45;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method
