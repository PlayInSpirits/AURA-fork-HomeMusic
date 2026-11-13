.class public final Ldefpackage/tv3;
.super Ldefpackage/u80;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final z:Ldefpackage/nl4;


# instance fields
.field public final a:Ldefpackage/ed;

.field public final b:Ldefpackage/jv3;

.field public final c:Ljava/lang/Object;

.field public d:Ldefpackage/s22;

.field public e:Ljava/lang/Throwable;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/List;

.field public h:Ldefpackage/x03;

.field public final i:Ldefpackage/f13;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ldefpackage/w03;

.field public final m:Ldefpackage/rf2;

.field public final n:Ldefpackage/w03;

.field public final o:Ldefpackage/w03;

.field public p:Ljava/util/ArrayList;

.field public q:Ldefpackage/x03;

.field public r:Ldefpackage/cz;

.field public final s:Ldefpackage/nl4;

.field public t:Z

.field public final u:Ldefpackage/nl4;

.field public final v:Ldefpackage/z05;

.field public final w:Ldefpackage/t22;

.field public final x:Ldefpackage/ne0;

.field public final y:Ldefpackage/hh3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/vf3;->q:Ldefpackage/vf3;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldefpackage/tv3;->A:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ldefpackage/ne0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/ed;

    .line 5
    .line 6
    new-instance v1, Ldefpackage/mv3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Ldefpackage/mv3;-><init>(Ldefpackage/tv3;I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ldefpackage/ed;-><init>(Ldefpackage/mv3;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/tv3;->a:Ldefpackage/ed;

    .line 16
    .line 17
    new-instance v1, Ldefpackage/jv3;

    .line 18
    .line 19
    new-instance v3, Ldefpackage/mv3;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-direct {v3, p0, v4}, Ldefpackage/mv3;-><init>(Ldefpackage/tv3;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v4, Ldefpackage/fl;

    .line 29
    .line 30
    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v4, v1, Ldefpackage/jv3;->n:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v2, Ldefpackage/z40;

    .line 36
    .line 37
    invoke-direct {v2}, Ldefpackage/z40;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, v1, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v2, Ldefpackage/fa;

    .line 43
    .line 44
    const/16 v4, 0xe

    .line 45
    .line 46
    invoke-direct {v2, v4, v1, v3}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, v1, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v1, p0, Ldefpackage/tv3;->b:Ldefpackage/jv3;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 66
    .line 67
    new-instance v1, Ldefpackage/x03;

    .line 68
    .line 69
    invoke-direct {v1}, Ldefpackage/x03;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 73
    .line 74
    new-instance v1, Ldefpackage/f13;

    .line 75
    .line 76
    const/16 v2, 0x10

    .line 77
    .line 78
    new-array v3, v2, [Ldefpackage/z80;

    .line 79
    .line 80
    invoke-direct {v1, v3}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 84
    .line 85
    new-instance v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Ldefpackage/tv3;->j:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance v1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 98
    .line 99
    new-instance v1, Ldefpackage/w03;

    .line 100
    .line 101
    invoke-direct {v1}, Ldefpackage/w03;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Ldefpackage/tv3;->l:Ldefpackage/w03;

    .line 105
    .line 106
    new-instance v1, Ldefpackage/rf2;

    .line 107
    .line 108
    invoke-direct {v1, v2}, Ldefpackage/rf2;-><init>(I)V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Ldefpackage/tv3;->m:Ldefpackage/rf2;

    .line 112
    .line 113
    new-instance v1, Ldefpackage/w03;

    .line 114
    .line 115
    invoke-direct {v1}, Ldefpackage/w03;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Ldefpackage/tv3;->n:Ldefpackage/w03;

    .line 119
    .line 120
    new-instance v1, Ldefpackage/w03;

    .line 121
    .line 122
    invoke-direct {v1}, Ldefpackage/w03;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v1, p0, Ldefpackage/tv3;->o:Ldefpackage/w03;

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-static {v1}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iput-object v1, p0, Ldefpackage/tv3;->s:Ldefpackage/nl4;

    .line 133
    .line 134
    sget-object v1, Ldefpackage/ov3;->p:Ldefpackage/ov3;

    .line 135
    .line 136
    invoke-static {v1}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 141
    .line 142
    new-instance v1, Ldefpackage/z05;

    .line 143
    .line 144
    const/16 v2, 0x9

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ldefpackage/z05;-><init>(I)V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, Ldefpackage/tv3;->v:Ldefpackage/z05;

    .line 150
    .line 151
    sget-object v1, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 152
    .line 153
    invoke-interface {p1, v1}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Ldefpackage/s22;

    .line 158
    .line 159
    new-instance v2, Ldefpackage/t22;

    .line 160
    .line 161
    invoke-direct {v2, v1}, Ldefpackage/t22;-><init>(Ldefpackage/s22;)V

    .line 162
    .line 163
    .line 164
    new-instance v1, Ldefpackage/kl3;

    .line 165
    .line 166
    const/4 v3, 0x2

    .line 167
    invoke-direct {v1, v3, p0}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ldefpackage/a32;->M(Ldefpackage/if1;)Ldefpackage/as0;

    .line 171
    .line 172
    .line 173
    iput-object v2, p0, Ldefpackage/tv3;->w:Ldefpackage/t22;

    .line 174
    .line 175
    invoke-interface {p1, v0}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {p1, v2}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iput-object p1, p0, Ldefpackage/tv3;->x:Ldefpackage/ne0;

    .line 184
    .line 185
    new-instance p1, Ldefpackage/hh3;

    .line 186
    .line 187
    const/16 v0, 0xc

    .line 188
    .line 189
    invoke-direct {p1, v0}, Ldefpackage/hh3;-><init>(I)V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, Ldefpackage/tv3;->y:Ldefpackage/hh3;

    .line 193
    .line 194
    return-void
.end method

.method public static final G(Ljava/util/ArrayList;Ldefpackage/tv3;Ldefpackage/z80;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object p1, p1, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ldefpackage/jy2;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    .line 34
    throw p1
.end method

.method public static w(Ldefpackage/a13;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/a13;->w()Ldefpackage/jz4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ldefpackage/dh4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/a13;->c()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-virtual {p0}, Ldefpackage/a13;->c()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/f13;->p:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ldefpackage/tv3;->z()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/tv3;->B()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/tv3;->l:Ldefpackage/w03;

    .line 21
    .line 22
    iget p0, p0, Ldefpackage/w03;->e:I

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/tv3;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/tv3;->b:Ldefpackage/jv3;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/z40;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/fl;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const v0, 0x7ffffff

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-lez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final C()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 5
    .line 6
    invoke-virtual {v1}, Ldefpackage/x03;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 13
    .line 14
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ldefpackage/tv3;->z()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/tv3;->B()Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    return p0

    .line 39
    :goto_2
    monitor-exit v0

    .line 40
    throw p0
.end method

.method public final D()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    iput-object v0, p0, Ldefpackage/tv3;->g:Ljava/util/List;

    .line 24
    .line 25
    return-object v0
.end method

.method public final E()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 9
    .line 10
    invoke-virtual {v2}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ldefpackage/ov3;

    .line 15
    .line 16
    sget-object v3, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 28
    .line 29
    check-cast v1, Ldefpackage/cz;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    :try_start_1
    const-string v1, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 36
    .line 37
    iget-object p0, p0, Ldefpackage/tv3;->e:Ljava/lang/Throwable;

    .line 38
    .line 39
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    monitor-exit v0

    .line 50
    throw p0
.end method

.method public final F(Ldefpackage/z80;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    monitor-exit p1

    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/jy2;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit p1

    .line 28
    throw p0
.end method

.method public final H(Ljava/util/List;Ldefpackage/x03;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    const/4 v5, 0x0

    .line 18
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    move-object/from16 v6, p1

    .line 21
    .line 22
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v8, v7

    .line 27
    check-cast v8, Ldefpackage/jy2;

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    new-instance v8, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    check-cast v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_11

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, Ldefpackage/z80;

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/util/List;

    .line 85
    .line 86
    iget-object v7, v6, Ldefpackage/z80;->I:Ldefpackage/rg1;

    .line 87
    .line 88
    iget-boolean v7, v7, Ldefpackage/rg1;->F:Z

    .line 89
    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    const-string v7, "Check failed"

    .line 93
    .line 94
    invoke-static {v7}, Ldefpackage/l80;->a(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    new-instance v7, Ldefpackage/kl3;

    .line 98
    .line 99
    const/4 v8, 0x1

    .line 100
    invoke-direct {v7, v8, v6}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v8, Ldefpackage/o;

    .line 104
    .line 105
    const/16 v9, 0x19

    .line 106
    .line 107
    move-object/from16 v10, p2

    .line 108
    .line 109
    invoke-direct {v8, v9, v6, v10}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    instance-of v11, v9, Ldefpackage/a13;

    .line 117
    .line 118
    if-eqz v11, :cond_3

    .line 119
    .line 120
    check-cast v9, Ldefpackage/a13;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    move-object v9, v5

    .line 124
    :goto_2
    if-eqz v9, :cond_10

    .line 125
    .line 126
    invoke-virtual {v9, v7, v8}, Ldefpackage/a13;->C(Ldefpackage/if1;Ldefpackage/if1;)Ldefpackage/a13;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-eqz v7, :cond_10

    .line 131
    .line 132
    :try_start_0
    invoke-virtual {v7}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 133
    .line 134
    .line 135
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 136
    :try_start_1
    iget-object v9, v0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 137
    .line 138
    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    :try_start_2
    new-instance v11, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    const/4 v13, 0x0

    .line 153
    :goto_3
    if-ge v13, v12, :cond_4

    .line 154
    .line 155
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    check-cast v14, Ldefpackage/jy2;

    .line 160
    .line 161
    iget-object v15, v0, Ldefpackage/tv3;->l:Ldefpackage/w03;

    .line 162
    .line 163
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v15}, Ldefpackage/mz2;->a(Ldefpackage/w03;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    move-object/from16 v16, v15

    .line 171
    .line 172
    check-cast v16, Ldefpackage/jy2;

    .line 173
    .line 174
    new-instance v3, Ldefpackage/kd3;

    .line 175
    .line 176
    invoke-direct {v3, v14, v15}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    add-int/lit8 v13, v13, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto/16 :goto_d

    .line 187
    .line 188
    :cond_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    const/4 v4, 0x0

    .line 193
    :goto_4
    if-ge v4, v3, :cond_8

    .line 194
    .line 195
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    check-cast v12, Ldefpackage/kd3;

    .line 200
    .line 201
    iget-object v13, v12, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 202
    .line 203
    if-nez v13, :cond_7

    .line 204
    .line 205
    iget-object v13, v0, Ldefpackage/tv3;->m:Ldefpackage/rf2;

    .line 206
    .line 207
    iget-object v12, v12, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v12, Ldefpackage/jy2;

    .line 210
    .line 211
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v12, v13, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v12, Ldefpackage/w03;

    .line 217
    .line 218
    invoke-virtual {v12, v5}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_7

    .line 223
    .line 224
    new-instance v3, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    const/4 v12, 0x0

    .line 238
    :goto_5
    if-ge v12, v4, :cond_6

    .line 239
    .line 240
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    check-cast v13, Ldefpackage/kd3;

    .line 245
    .line 246
    iget-object v14, v13, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 247
    .line 248
    if-nez v14, :cond_5

    .line 249
    .line 250
    iget-object v14, v0, Ldefpackage/tv3;->m:Ldefpackage/rf2;

    .line 251
    .line 252
    iget-object v15, v13, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v15, Ldefpackage/jy2;

    .line 255
    .line 256
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget-object v15, v14, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v15, Ldefpackage/w03;

    .line 262
    .line 263
    invoke-static {v15}, Ldefpackage/mz2;->a(Ldefpackage/w03;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v17

    .line 267
    check-cast v17, Ldefpackage/v43;

    .line 268
    .line 269
    invoke-virtual {v15}, Ldefpackage/w03;->i()Z

    .line 270
    .line 271
    .line 272
    move-result v15

    .line 273
    if-eqz v15, :cond_5

    .line 274
    .line 275
    iget-object v14, v14, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v14, Ldefpackage/w03;

    .line 278
    .line 279
    invoke-virtual {v14}, Ldefpackage/w03;->a()V

    .line 280
    .line 281
    .line 282
    :cond_5
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    .line 284
    .line 285
    add-int/lit8 v12, v12, 0x1

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_6
    move-object v11, v3

    .line 289
    goto :goto_6

    .line 290
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_8
    :goto_6
    :try_start_3
    monitor-exit v9

    .line 294
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    const/4 v4, 0x0

    .line 299
    :goto_7
    if-ge v4, v3, :cond_f

    .line 300
    .line 301
    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    check-cast v9, Ldefpackage/kd3;

    .line 306
    .line 307
    iget-object v9, v9, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 308
    .line 309
    if-nez v9, :cond_9

    .line 310
    .line 311
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_9
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    const/4 v4, 0x0

    .line 319
    :goto_8
    if-ge v4, v3, :cond_f

    .line 320
    .line 321
    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    check-cast v9, Ldefpackage/kd3;

    .line 326
    .line 327
    iget-object v9, v9, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 328
    .line 329
    if-eqz v9, :cond_a

    .line 330
    .line 331
    add-int/lit8 v4, v4, 0x1

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    const/4 v9, 0x0

    .line 348
    :goto_9
    if-ge v9, v4, :cond_c

    .line 349
    .line 350
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    check-cast v12, Ldefpackage/kd3;

    .line 355
    .line 356
    iget-object v13, v12, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 357
    .line 358
    if-nez v13, :cond_b

    .line 359
    .line 360
    iget-object v12, v12, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v12, Ldefpackage/jy2;

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :catchall_1
    move-exception v0

    .line 366
    goto :goto_e

    .line 367
    :cond_b
    :goto_a
    add-int/lit8 v9, v9, 0x1

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_c
    iget-object v4, v0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 371
    .line 372
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 373
    :try_start_4
    iget-object v9, v0, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-static {v3, v9}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 376
    .line 377
    .line 378
    :try_start_5
    monitor-exit v4

    .line 379
    new-instance v3, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    const/4 v9, 0x0

    .line 393
    :goto_b
    if-ge v9, v4, :cond_e

    .line 394
    .line 395
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v12

    .line 399
    move-object v13, v12

    .line 400
    check-cast v13, Ldefpackage/kd3;

    .line 401
    .line 402
    iget-object v13, v13, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 403
    .line 404
    if-eqz v13, :cond_d

    .line 405
    .line 406
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_e
    move-object v11, v3

    .line 413
    goto :goto_c

    .line 414
    :catchall_2
    move-exception v0

    .line 415
    monitor-exit v4

    .line 416
    throw v0

    .line 417
    :cond_f
    :goto_c
    invoke-virtual {v6, v11}, Ldefpackage/z80;->r(Ljava/util/ArrayList;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 418
    .line 419
    .line 420
    :try_start_6
    invoke-static {v8}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 421
    .line 422
    .line 423
    invoke-static {v7}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :catchall_3
    move-exception v0

    .line 429
    goto :goto_f

    .line 430
    :goto_d
    :try_start_7
    monitor-exit v9

    .line 431
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 432
    :goto_e
    :try_start_8
    invoke-static {v8}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 433
    .line 434
    .line 435
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 436
    :goto_f
    invoke-static {v7}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_10
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 441
    .line 442
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    return-object v5

    .line 446
    :cond_11
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, Ljava/lang/Iterable;

    .line 451
    .line 452
    invoke-static {v0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0
.end method

.method public final I(Ldefpackage/z80;Ldefpackage/x03;)Ldefpackage/z80;
    .locals 5

    .line 1
    iget-object v0, p1, Ldefpackage/z80;->I:Ldefpackage/rg1;

    .line 2
    .line 3
    iget-boolean v0, v0, Ldefpackage/rg1;->F:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    iget v0, p1, Ldefpackage/z80;->J:I

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object p0, p0, Ldefpackage/tv3;->q:Ldefpackage/x03;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ldefpackage/x03;->c(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v0, :cond_1

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_1
    new-instance p0, Ldefpackage/kl3;

    .line 27
    .line 28
    invoke-direct {p0, v0, p1}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Ldefpackage/o;

    .line 32
    .line 33
    const/16 v3, 0x19

    .line 34
    .line 35
    invoke-direct {v2, v3, p1, p2}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    instance-of v4, v3, Ldefpackage/a13;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    check-cast v3, Ldefpackage/a13;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v3, v1

    .line 50
    :goto_0
    if-eqz v3, :cond_5

    .line 51
    .line 52
    invoke-virtual {v3, p0, v2}, Ldefpackage/a13;->C(Ldefpackage/if1;Ldefpackage/if1;)Ldefpackage/a13;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_5

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p2}, Ldefpackage/x03;->h()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ne v3, v0, :cond_4

    .line 69
    .line 70
    new-instance v3, Ldefpackage/fa;

    .line 71
    .line 72
    const/16 v4, 0xf

    .line 73
    .line 74
    invoke-direct {v3, v4, p2, p1}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p1, Ldefpackage/z80;->I:Ldefpackage/rg1;

    .line 78
    .line 79
    iget-boolean v4, p2, Ldefpackage/rg1;->F:Z

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    const-string v4, "Preparing a composition while composing is not supported"

    .line 84
    .line 85
    invoke-static {v4}, Ldefpackage/l80;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    iput-boolean v0, p2, Ldefpackage/rg1;->F:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    :try_start_2
    invoke-virtual {v3}, Ldefpackage/fa;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    :try_start_3
    iput-boolean v0, p2, Ldefpackage/rg1;->F:Z

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    iput-boolean v0, p2, Ldefpackage/rg1;->F:Z

    .line 99
    .line 100
    throw p1

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ldefpackage/z80;->w()Z

    .line 104
    .line 105
    .line 106
    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 107
    :try_start_4
    invoke-static {v2}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V

    .line 111
    .line 112
    .line 113
    if-eqz p2, :cond_6

    .line 114
    .line 115
    return-object p1

    .line 116
    :catchall_2
    move-exception p1

    .line 117
    goto :goto_3

    .line 118
    :goto_2
    :try_start_5
    invoke-static {v2}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 119
    .line 120
    .line 121
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 122
    :goto_3
    invoke-static {p0}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_5
    const-string p0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 127
    .line 128
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_4
    return-object v1
.end method

.method public final J(Ljava/lang/Throwable;Ldefpackage/z80;)V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/tv3;->A:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    instance-of v0, p1, Landroidx/compose/runtime/ComposeRuntimeError;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    .line 24
    .line 25
    const-string v3, "ComposeInternal"

    .line 26
    .line 27
    invoke-static {v3, v2, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Ldefpackage/tv3;->j:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 36
    .line 37
    invoke-virtual {v2}, Ldefpackage/f13;->g()V

    .line 38
    .line 39
    .line 40
    new-instance v2, Ldefpackage/x03;

    .line 41
    .line 42
    invoke-direct {v2}, Ldefpackage/x03;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 46
    .line 47
    iget-object v2, p0, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Ldefpackage/tv3;->l:Ldefpackage/w03;

    .line 53
    .line 54
    invoke-virtual {v2}, Ldefpackage/w03;->a()V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Ldefpackage/tv3;->n:Ldefpackage/w03;

    .line 58
    .line 59
    invoke-virtual {v2}, Ldefpackage/w03;->a()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Ldefpackage/tv3;->s:Ldefpackage/nl4;

    .line 63
    .line 64
    new-instance v3, Ldefpackage/nv3;

    .line 65
    .line 66
    invoke-direct {v3, p1}, Ldefpackage/nv3;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1, v3}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    if-eqz p2, :cond_0

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Ldefpackage/tv3;->L(Ldefpackage/z80;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    const-string p0, "expected to go to inactive state due to composition error"

    .line 90
    .line 91
    invoke-static {p0}, Ldefpackage/l80;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    :cond_1
    monitor-exit v0

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v0

    .line 97
    throw p0

    .line 98
    :cond_2
    iget-object p2, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter p2

    .line 101
    :try_start_1
    const-string v0, "Error was captured in composition."

    .line 102
    .line 103
    const-string v2, "ComposeInternal"

    .line 104
    .line 105
    invoke-static {v2, v0, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Ldefpackage/tv3;->s:Ldefpackage/nl4;

    .line 109
    .line 110
    invoke-virtual {v0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ldefpackage/nv3;

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    iget-object p0, p0, Ldefpackage/tv3;->s:Ldefpackage/nl4;

    .line 119
    .line 120
    new-instance v0, Ldefpackage/nv3;

    .line 121
    .line 122
    invoke-direct {v0, p1}, Ldefpackage/nv3;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v1, v0}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    monitor-exit p2

    .line 132
    throw p1

    .line 133
    :catchall_1
    move-exception p0

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    :try_start_2
    iget-object p0, v0, Ldefpackage/nv3;->a:Ljava/lang/Throwable;

    .line 136
    .line 137
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    :goto_2
    monitor-exit p2

    .line 139
    throw p0
.end method

.method public final K()Z
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 5
    .line 6
    invoke-virtual {v1}, Ldefpackage/x03;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/tv3;->A()Z

    .line 13
    .line 14
    .line 15
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/tv3;->D()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 26
    .line 27
    new-instance v3, Ldefpackage/x54;

    .line 28
    .line 29
    invoke-direct {v3, v2}, Ldefpackage/x54;-><init>(Ldefpackage/x03;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ldefpackage/x03;

    .line 33
    .line 34
    invoke-direct {v2}, Ldefpackage/x03;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    :try_start_2
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v2, 0x0

    .line 45
    :goto_0
    if-ge v2, v0, :cond_1

    .line 46
    .line 47
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ldefpackage/z80;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ldefpackage/z80;->x(Ldefpackage/x54;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 57
    .line 58
    invoke-virtual {v4}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ldefpackage/ov3;

    .line 63
    .line 64
    sget-object v5, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 67
    .line 68
    .line 69
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    if-lez v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 78
    .line 79
    monitor-enter v0

    .line 80
    :try_start_3
    invoke-virtual {p0}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0}, Ldefpackage/tv3;->A()Z

    .line 87
    .line 88
    .line 89
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 90
    monitor-exit v0

    .line 91
    return p0

    .line 92
    :catchall_2
    move-exception p0

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v1, "called outside of runRecomposeAndApplyChanges"

    .line 97
    .line 98
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 102
    :goto_1
    monitor-exit v0

    .line 103
    throw p0

    .line 104
    :goto_2
    iget-object v1, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v1

    .line 107
    :try_start_5
    iget-object p0, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {p0, v3}, Ldefpackage/x03;->k(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    monitor-exit v1

    .line 131
    throw v0

    .line 132
    :catchall_3
    move-exception p0

    .line 133
    monitor-exit v1

    .line 134
    throw p0

    .line 135
    :goto_4
    monitor-exit v0

    .line 136
    throw p0
.end method

.method public final L(Ldefpackage/z80;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/tv3;->p:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Ldefpackage/tv3;->g:Ljava/util/List;

    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final a(Ldefpackage/z80;Ldefpackage/wf1;)V
    .locals 8

    .line 1
    iget-object v0, p1, Ldefpackage/z80;->I:Ldefpackage/rg1;

    .line 2
    .line 3
    iget-boolean v0, v0, Ldefpackage/rg1;->F:Z

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 9
    .line 10
    invoke-virtual {v2}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ldefpackage/ov3;

    .line 15
    .line 16
    sget-object v3, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v4, 0x1

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/tv3;->D()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    xor-int/2addr v2, v4

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    move v2, v4

    .line 39
    :goto_0
    monitor-exit v1

    .line 40
    :try_start_1
    new-instance v1, Ldefpackage/kl3;

    .line 41
    .line 42
    invoke-direct {v1, v4, p1}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Ldefpackage/o;

    .line 46
    .line 47
    const/16 v5, 0x19

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct {v4, v5, p1, v6}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    instance-of v7, v5, Ldefpackage/a13;

    .line 58
    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    check-cast v5, Ldefpackage/a13;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v5, v6

    .line 65
    :goto_1
    if-eqz v5, :cond_5

    .line 66
    .line 67
    invoke-virtual {v5, v1, v4}, Ldefpackage/a13;->C(Ldefpackage/if1;Ldefpackage/if1;)Ldefpackage/a13;

    .line 68
    .line 69
    .line 70
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    :try_start_2
    invoke-virtual {v1}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 74
    .line 75
    .line 76
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 77
    :try_start_3
    invoke-virtual {p1, p2}, Ldefpackage/z80;->j(Ldefpackage/wf1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 78
    .line 79
    .line 80
    :try_start_4
    invoke-static {v4}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 81
    .line 82
    .line 83
    :try_start_5
    invoke-static {v1}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 87
    .line 88
    monitor-enter p2

    .line 89
    :try_start_6
    iget-object v1, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 90
    .line 91
    invoke-virtual {v1}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ldefpackage/ov3;

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-lez v1, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0}, Ldefpackage/tv3;->D()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_2

    .line 112
    .line 113
    iget-object v1, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    iput-object v6, p0, Ldefpackage/tv3;->g:Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catchall_1
    move-exception p0

    .line 122
    goto :goto_3

    .line 123
    :cond_2
    :goto_2
    monitor-exit p2

    .line 124
    if-nez v0, :cond_3

    .line 125
    .line 126
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p2}, Ldefpackage/ch4;->m()V

    .line 131
    .line 132
    .line 133
    :cond_3
    :try_start_7
    invoke-virtual {p0, p1}, Ldefpackage/tv3;->F(Ldefpackage/z80;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 134
    .line 135
    .line 136
    :try_start_8
    invoke-virtual {p1}, Ldefpackage/z80;->d()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ldefpackage/z80;->f()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 140
    .line 141
    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ldefpackage/ch4;->m()V

    .line 149
    .line 150
    .line 151
    :cond_4
    return-void

    .line 152
    :catchall_2
    move-exception p1

    .line 153
    invoke-virtual {p0, p1, v6}, Ldefpackage/tv3;->J(Ljava/lang/Throwable;Ldefpackage/z80;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :catchall_3
    move-exception p2

    .line 158
    invoke-virtual {p0, p2, p1}, Ldefpackage/tv3;->J(Ljava/lang/Throwable;Ldefpackage/z80;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_3
    monitor-exit p2

    .line 163
    throw p0

    .line 164
    :catchall_4
    move-exception p2

    .line 165
    goto :goto_5

    .line 166
    :catchall_5
    move-exception p2

    .line 167
    goto :goto_4

    .line 168
    :catchall_6
    move-exception p2

    .line 169
    :try_start_9
    invoke-static {v4}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 170
    .line 171
    .line 172
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 173
    :goto_4
    :try_start_a
    invoke-static {v1}, Ldefpackage/tv3;->w(Ldefpackage/a13;)V

    .line 174
    .line 175
    .line 176
    throw p2

    .line 177
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 180
    .line 181
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 185
    :goto_5
    if-eqz v2, :cond_6

    .line 186
    .line 187
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 188
    .line 189
    monitor-enter v0

    .line 190
    monitor-exit v0

    .line 191
    :cond_6
    invoke-virtual {p0, p2, p1}, Ldefpackage/tv3;->J(Ljava/lang/Throwable;Ldefpackage/z80;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :goto_6
    monitor-exit v1

    .line 196
    throw p0
.end method

.method public final b(Ldefpackage/z80;Ldefpackage/md4;Ldefpackage/wf1;)Ldefpackage/x03;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->v:Ldefpackage/z05;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p1, Ldefpackage/z80;->C:Ldefpackage/md4;

    .line 5
    .line 6
    iput-object p2, p1, Ldefpackage/z80;->C:Ldefpackage/md4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    :try_start_1
    invoke-virtual {p0, p1, p3}, Ldefpackage/tv3;->a(Ldefpackage/z80;Ldefpackage/wf1;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ldefpackage/x03;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p0, Ldefpackage/w54;->a:Ldefpackage/x03;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :goto_0
    :try_start_2
    iput-object v2, p1, Ldefpackage/z80;->C:Ldefpackage/md4;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ldefpackage/z05;->n(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception p0

    .line 34
    :try_start_3
    iput-object v2, p1, Ldefpackage/z80;->C:Ldefpackage/md4;

    .line 35
    .line 36
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 37
    :goto_1
    invoke-virtual {v0, v1}, Ldefpackage/z05;->n(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/tv3;->A:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Ldefpackage/t80;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final j()Ldefpackage/ne0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tv3;->x:Ldefpackage/ne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l(Ldefpackage/z80;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ldefpackage/f13;->h(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/tv3;->y()Ldefpackage/az;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 29
    .line 30
    check-cast p0, Ldefpackage/cz;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public final m(Ldefpackage/jy2;)Ldefpackage/iy2;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/tv3;->n:Ldefpackage/w03;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/w03;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ldefpackage/iy2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
.end method

.method public final n(Ldefpackage/z80;Ldefpackage/md4;Ldefpackage/x03;)Ldefpackage/x03;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->v:Ldefpackage/z05;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/tv3;->K()Z

    .line 5
    .line 6
    .line 7
    new-instance v2, Ldefpackage/x54;

    .line 8
    .line 9
    invoke-direct {v2, p3}, Ldefpackage/x54;-><init>(Ldefpackage/x03;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ldefpackage/z80;->x(Ldefpackage/x54;)V

    .line 13
    .line 14
    .line 15
    iget-object p3, p1, Ldefpackage/z80;->C:Ldefpackage/md4;

    .line 16
    .line 17
    iput-object p2, p1, Ldefpackage/z80;->C:Ldefpackage/md4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {p0, p1, v1}, Ldefpackage/tv3;->I(Ldefpackage/z80;Ldefpackage/x03;)Ldefpackage/z80;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/tv3;->F(Ldefpackage/z80;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ldefpackage/z80;->d()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ldefpackage/z80;->f()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ldefpackage/x03;

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object p0, Ldefpackage/w54;->a:Ldefpackage/x03;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_1
    :try_start_2
    iput-object p3, p1, Ldefpackage/z80;->C:Ldefpackage/md4;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ldefpackage/z05;->n(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    goto :goto_3

    .line 59
    :goto_2
    :try_start_3
    iput-object p3, p1, Ldefpackage/z80;->C:Ldefpackage/md4;

    .line 60
    .line 61
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :goto_3
    invoke-virtual {v0, v1}, Ldefpackage/z05;->n(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw p0
.end method

.method public final o(Ljava/util/Set;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Ldefpackage/lv3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tv3;->v:Ldefpackage/z05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/x03;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ldefpackage/w54;->a:Ldefpackage/x03;

    .line 12
    .line 13
    new-instance v0, Ldefpackage/x03;

    .line 14
    .line 15
    invoke-direct {v0}, Ldefpackage/x03;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/z05;->n(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Ldefpackage/x03;->a(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final r(Ldefpackage/z80;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->q:Ldefpackage/x03;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Ldefpackage/w54;->a:Ldefpackage/x03;

    .line 9
    .line 10
    new-instance v1, Ldefpackage/x03;

    .line 11
    .line 12
    invoke-direct {v1}, Ldefpackage/x03;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Ldefpackage/tv3;->q:Ldefpackage/x03;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1, p1}, Ldefpackage/x03;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final s(Ldefpackage/wc;)Ldefpackage/ez;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/tv3;->b:Ldefpackage/jv3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/z40;

    .line 6
    .line 7
    new-instance v1, Ldefpackage/w53;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, v1, Ldefpackage/w53;->a:Ldefpackage/wc;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/fa;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Ldefpackage/z40;->a(Ldefpackage/ko;Ldefpackage/gf1;)Ldefpackage/ez;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final v(Ldefpackage/z80;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Ldefpackage/tv3;->g:Ljava/util/List;

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ldefpackage/f13;->j(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/tv3;->j:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit v0

    .line 29
    throw p0
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 5
    .line 6
    invoke-virtual {v1}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ldefpackage/ov3;

    .line 11
    .line 12
    sget-object v2, Ldefpackage/ov3;->r:Ldefpackage/ov3;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-ltz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 22
    .line 23
    sget-object v3, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    iget-object p0, p0, Ldefpackage/tv3;->w:Ldefpackage/t22;

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Ldefpackage/a32;->f(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
.end method

.method public final y()Ldefpackage/az;
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ldefpackage/ov3;

    .line 8
    .line 9
    sget-object v2, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Ldefpackage/tv3;->s:Ldefpackage/nl4;

    .line 16
    .line 17
    iget-object v3, p0, Ldefpackage/tv3;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v4, p0, Ldefpackage/tv3;->j:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v5, p0, Ldefpackage/tv3;->i:Ldefpackage/f13;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-gtz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/tv3;->D()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v7, 0x0

    .line 35
    :goto_0
    if-ge v7, v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    check-cast v8, Ldefpackage/z80;

    .line 42
    .line 43
    add-int/lit8 v7, v7, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Ldefpackage/tv3;->f:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 52
    .line 53
    iput-object v0, p0, Ldefpackage/tv3;->g:Ljava/util/List;

    .line 54
    .line 55
    new-instance v0, Ldefpackage/x03;

    .line 56
    .line 57
    invoke-direct {v0}, Ldefpackage/x03;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 61
    .line 62
    invoke-virtual {v5}, Ldefpackage/f13;->g()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 69
    .line 70
    .line 71
    iput-object v6, p0, Ldefpackage/tv3;->p:Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v0, p0, Ldefpackage/tv3;->r:Ldefpackage/cz;

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0, v6}, Ldefpackage/cz;->r(Ljava/lang/Throwable;)Z

    .line 78
    .line 79
    .line 80
    :cond_1
    iput-object v6, p0, Ldefpackage/tv3;->r:Ldefpackage/cz;

    .line 81
    .line 82
    invoke-virtual {v2, v6}, Ldefpackage/nl4;->i(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v6

    .line 86
    :cond_2
    invoke-virtual {v2}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v2, Ldefpackage/ov3;->s:Ldefpackage/ov3;

    .line 91
    .line 92
    sget-object v7, Ldefpackage/ov3;->p:Ldefpackage/ov3;

    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    iget-object v1, p0, Ldefpackage/tv3;->d:Ldefpackage/s22;

    .line 98
    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    new-instance v1, Ldefpackage/x03;

    .line 102
    .line 103
    invoke-direct {v1}, Ldefpackage/x03;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 107
    .line 108
    invoke-virtual {v5}, Ldefpackage/f13;->g()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ldefpackage/tv3;->z()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0}, Ldefpackage/tv3;->B()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    :cond_4
    sget-object v7, Ldefpackage/ov3;->q:Ldefpackage/ov3;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    iget v1, v5, Ldefpackage/f13;->p:I

    .line 127
    .line 128
    if-eqz v1, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    iget-object v1, p0, Ldefpackage/tv3;->h:Ldefpackage/x03;

    .line 132
    .line 133
    invoke-virtual {v1}, Ldefpackage/x03;->h()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_8

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    invoke-virtual {p0}, Ldefpackage/tv3;->z()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p0}, Ldefpackage/tv3;->B()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    iget-object v1, p0, Ldefpackage/tv3;->l:Ldefpackage/w03;

    .line 164
    .line 165
    iget v1, v1, Ldefpackage/w03;->e:I

    .line 166
    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    sget-object v7, Ldefpackage/ov3;->r:Ldefpackage/ov3;

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    :goto_1
    move-object v7, v2

    .line 174
    :cond_9
    :goto_2
    invoke-virtual {v0, v6, v7}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    if-ne v7, v2, :cond_a

    .line 178
    .line 179
    iget-object v0, p0, Ldefpackage/tv3;->r:Ldefpackage/cz;

    .line 180
    .line 181
    iput-object v6, p0, Ldefpackage/tv3;->r:Ldefpackage/cz;

    .line 182
    .line 183
    return-object v0

    .line 184
    :cond_a
    return-object v6
.end method

.method public final z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/tv3;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/tv3;->a:Ldefpackage/ed;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ed;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/z40;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/fl;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const v0, 0x7ffffff

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-lez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method
