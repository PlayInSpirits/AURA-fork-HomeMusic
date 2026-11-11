.class public Lbw4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:Z

.field public B:Lyw1;

.field public C:I

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Ljava/util/HashMap;

.field public I:Ljava/util/HashSet;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Lyw1;

.field public n:Lyw1;

.field public o:Lyw1;

.field public p:I

.field public q:Lyw1;

.field public r:Lyw1;

.field public s:I

.field public t:I

.field public u:I

.field public v:Lyw1;

.field public w:Law4;

.field public x:Z

.field public y:Lyw1;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lbw4;->a:I

    .line 8
    .line 9
    iput v0, p0, Lbw4;->b:I

    .line 10
    .line 11
    iput v0, p0, Lbw4;->c:I

    .line 12
    .line 13
    iput v0, p0, Lbw4;->d:I

    .line 14
    .line 15
    iput v0, p0, Lbw4;->i:I

    .line 16
    .line 17
    iput v0, p0, Lbw4;->j:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Lbw4;->k:Z

    .line 21
    .line 22
    iput-boolean v1, p0, Lbw4;->l:Z

    .line 23
    .line 24
    sget-object v2, Lyw1;->o:Lvw1;

    .line 25
    .line 26
    sget-object v2, Lgy3;->r:Lgy3;

    .line 27
    .line 28
    iput-object v2, p0, Lbw4;->m:Lyw1;

    .line 29
    .line 30
    iput-object v2, p0, Lbw4;->n:Lyw1;

    .line 31
    .line 32
    iput-object v2, p0, Lbw4;->o:Lyw1;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    iput v3, p0, Lbw4;->p:I

    .line 36
    .line 37
    iput-object v2, p0, Lbw4;->q:Lyw1;

    .line 38
    .line 39
    iput-object v2, p0, Lbw4;->r:Lyw1;

    .line 40
    .line 41
    iput v3, p0, Lbw4;->s:I

    .line 42
    .line 43
    iput v0, p0, Lbw4;->t:I

    .line 44
    .line 45
    iput v0, p0, Lbw4;->u:I

    .line 46
    .line 47
    iput-object v2, p0, Lbw4;->v:Lyw1;

    .line 48
    .line 49
    sget-object v0, Law4;->d:Law4;

    .line 50
    .line 51
    iput-object v0, p0, Lbw4;->w:Law4;

    .line 52
    .line 53
    iput-boolean v3, p0, Lbw4;->x:Z

    .line 54
    .line 55
    iput-object v2, p0, Lbw4;->y:Lyw1;

    .line 56
    .line 57
    iput v3, p0, Lbw4;->z:I

    .line 58
    .line 59
    iput-boolean v1, p0, Lbw4;->A:Z

    .line 60
    .line 61
    iput-object v2, p0, Lbw4;->B:Lyw1;

    .line 62
    .line 63
    iput v3, p0, Lbw4;->C:I

    .line 64
    .line 65
    iput-boolean v3, p0, Lbw4;->D:Z

    .line 66
    .line 67
    iput-boolean v3, p0, Lbw4;->E:Z

    .line 68
    .line 69
    iput-boolean v3, p0, Lbw4;->F:Z

    .line 70
    .line 71
    iput-boolean v3, p0, Lbw4;->G:Z

    .line 72
    .line 73
    new-instance v0, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 79
    .line 80
    new-instance v0, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lbw4;->I:Ljava/util/HashSet;

    .line 86
    .line 87
    return-void
.end method

.method public static f([Ljava/lang/String;)Lgy3;
    .locals 4

    .line 1
    invoke-static {}, Lyw1;->j()Luw1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, p0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Lf35;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0, v3}, Lpw1;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public a(Lyv4;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p1, Lyv4;->a:Lsv4;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b()Lcw4;
    .locals 1

    .line 1
    new-instance v0, Lcw4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcw4;-><init>(Lbw4;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public c()Lbw4;
    .locals 1

    .line 1
    iget-object v0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(I)Lbw4;
    .locals 2

    .line 1
    iget-object v0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lyv4;

    .line 22
    .line 23
    iget-object v1, v1, Lyv4;->a:Lsv4;

    .line 24
    .line 25
    iget v1, v1, Lsv4;->c:I

    .line 26
    .line 27
    if-ne v1, p1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object p0
.end method

.method public final e(Lcw4;)V
    .locals 2

    .line 1
    iget v0, p1, Lcw4;->a:I

    .line 2
    .line 3
    iput v0, p0, Lbw4;->a:I

    .line 4
    .line 5
    iget v0, p1, Lcw4;->b:I

    .line 6
    .line 7
    iput v0, p0, Lbw4;->b:I

    .line 8
    .line 9
    iget v0, p1, Lcw4;->c:I

    .line 10
    .line 11
    iput v0, p0, Lbw4;->c:I

    .line 12
    .line 13
    iget v0, p1, Lcw4;->d:I

    .line 14
    .line 15
    iput v0, p0, Lbw4;->d:I

    .line 16
    .line 17
    iget v0, p1, Lcw4;->e:I

    .line 18
    .line 19
    iput v0, p0, Lbw4;->e:I

    .line 20
    .line 21
    iget v0, p1, Lcw4;->f:I

    .line 22
    .line 23
    iput v0, p0, Lbw4;->f:I

    .line 24
    .line 25
    iget v0, p1, Lcw4;->g:I

    .line 26
    .line 27
    iput v0, p0, Lbw4;->g:I

    .line 28
    .line 29
    iget v0, p1, Lcw4;->h:I

    .line 30
    .line 31
    iput v0, p0, Lbw4;->h:I

    .line 32
    .line 33
    iget v0, p1, Lcw4;->i:I

    .line 34
    .line 35
    iput v0, p0, Lbw4;->i:I

    .line 36
    .line 37
    iget v0, p1, Lcw4;->j:I

    .line 38
    .line 39
    iput v0, p0, Lbw4;->j:I

    .line 40
    .line 41
    iget-boolean v0, p1, Lcw4;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Lbw4;->k:Z

    .line 44
    .line 45
    iget-boolean v0, p1, Lcw4;->l:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Lbw4;->l:Z

    .line 48
    .line 49
    iget-object v0, p1, Lcw4;->n:Lyw1;

    .line 50
    .line 51
    iput-object v0, p0, Lbw4;->n:Lyw1;

    .line 52
    .line 53
    iget-object v0, p1, Lcw4;->m:Lyw1;

    .line 54
    .line 55
    iput-object v0, p0, Lbw4;->m:Lyw1;

    .line 56
    .line 57
    iget-object v0, p1, Lcw4;->o:Lyw1;

    .line 58
    .line 59
    iput-object v0, p0, Lbw4;->o:Lyw1;

    .line 60
    .line 61
    iget v0, p1, Lcw4;->p:I

    .line 62
    .line 63
    iput v0, p0, Lbw4;->p:I

    .line 64
    .line 65
    iget-object v0, p1, Lcw4;->q:Lyw1;

    .line 66
    .line 67
    iput-object v0, p0, Lbw4;->q:Lyw1;

    .line 68
    .line 69
    iget v0, p1, Lcw4;->s:I

    .line 70
    .line 71
    iput v0, p0, Lbw4;->s:I

    .line 72
    .line 73
    iget-object v0, p1, Lcw4;->r:Lyw1;

    .line 74
    .line 75
    iput-object v0, p0, Lbw4;->r:Lyw1;

    .line 76
    .line 77
    iget v0, p1, Lcw4;->t:I

    .line 78
    .line 79
    iput v0, p0, Lbw4;->t:I

    .line 80
    .line 81
    iget v0, p1, Lcw4;->u:I

    .line 82
    .line 83
    iput v0, p0, Lbw4;->u:I

    .line 84
    .line 85
    iget-object v0, p1, Lcw4;->v:Lyw1;

    .line 86
    .line 87
    iput-object v0, p0, Lbw4;->v:Lyw1;

    .line 88
    .line 89
    iget-object v0, p1, Lcw4;->w:Law4;

    .line 90
    .line 91
    iput-object v0, p0, Lbw4;->w:Law4;

    .line 92
    .line 93
    iget-boolean v0, p1, Lcw4;->x:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Lbw4;->x:Z

    .line 96
    .line 97
    iget-object v0, p1, Lcw4;->y:Lyw1;

    .line 98
    .line 99
    iput-object v0, p0, Lbw4;->y:Lyw1;

    .line 100
    .line 101
    iget v0, p1, Lcw4;->A:I

    .line 102
    .line 103
    iput v0, p0, Lbw4;->z:I

    .line 104
    .line 105
    iget-boolean v0, p1, Lcw4;->B:Z

    .line 106
    .line 107
    iput-boolean v0, p0, Lbw4;->A:Z

    .line 108
    .line 109
    iget-object v0, p1, Lcw4;->z:Lyw1;

    .line 110
    .line 111
    iput-object v0, p0, Lbw4;->B:Lyw1;

    .line 112
    .line 113
    iget v0, p1, Lcw4;->C:I

    .line 114
    .line 115
    iput v0, p0, Lbw4;->C:I

    .line 116
    .line 117
    iget-boolean v0, p1, Lcw4;->D:Z

    .line 118
    .line 119
    iput-boolean v0, p0, Lbw4;->D:Z

    .line 120
    .line 121
    iget-boolean v0, p1, Lcw4;->E:Z

    .line 122
    .line 123
    iput-boolean v0, p0, Lbw4;->E:Z

    .line 124
    .line 125
    iget-boolean v0, p1, Lcw4;->F:Z

    .line 126
    .line 127
    iput-boolean v0, p0, Lbw4;->F:Z

    .line 128
    .line 129
    iget-boolean v0, p1, Lcw4;->G:Z

    .line 130
    .line 131
    iput-boolean v0, p0, Lbw4;->G:Z

    .line 132
    .line 133
    new-instance v0, Ljava/util/HashSet;

    .line 134
    .line 135
    iget-object v1, p1, Lcw4;->I:Ljx1;

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lbw4;->I:Ljava/util/HashSet;

    .line 141
    .line 142
    new-instance v0, Ljava/util/HashMap;

    .line 143
    .line 144
    iget-object p1, p1, Lcw4;->H:Lbx1;

    .line 145
    .line 146
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    iput-object v0, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 150
    .line 151
    return-void
.end method

.method public g()Lbw4;
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    iput v0, p0, Lbw4;->C:I

    .line 3
    .line 4
    return-object p0
.end method

.method public h(Lyv4;)Lbw4;
    .locals 2

    .line 1
    iget-object v0, p1, Lyv4;->a:Lsv4;

    .line 2
    .line 3
    iget v1, v0, Lsv4;->c:I

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lbw4;->d(I)Lbw4;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbw4;->H:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public i()Lbw4;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lbw4;->j([Ljava/lang/String;)Lbw4;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public varargs j([Ljava/lang/String;)Lbw4;
    .locals 0

    .line 1
    invoke-static {p1}, Lbw4;->f([Ljava/lang/String;)Lgy3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lbw4;->y:Lyw1;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lbw4;->A:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public k()Lbw4;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lbw4;->z:I

    .line 3
    .line 4
    iput-boolean v0, p0, Lbw4;->A:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public l(IZ)Lbw4;
    .locals 1

    .line 1
    iget-object v0, p0, Lbw4;->I:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-object p0
.end method
