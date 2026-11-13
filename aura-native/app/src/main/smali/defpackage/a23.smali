.class public final Ldefpackage/a23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ba2;
.implements Ldefpackage/f75;
.implements Ldefpackage/ml1;
.implements Ldefpackage/j54;


# instance fields
.field public final n:Landroid/content/Context;

.field public o:Ldefpackage/r23;

.field public final p:Landroid/os/Bundle;

.field public q:Ldefpackage/r92;

.field public final r:Ldefpackage/j23;

.field public final s:Ljava/lang/String;

.field public final t:Landroid/os/Bundle;

.field public final u:Ldefpackage/ea2;

.field public final v:Ldefpackage/gp3;

.field public w:Z

.field public x:Ldefpackage/r92;

.field public final y:Ldefpackage/k54;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/r23;Landroid/os/Bundle;Ldefpackage/r92;Ldefpackage/j23;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/a23;->n:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/a23;->p:Landroid/os/Bundle;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/a23;->r:Ldefpackage/j23;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/a23;->t:Landroid/os/Bundle;

    .line 17
    .line 18
    new-instance p1, Ldefpackage/ea2;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-direct {p1, p0, p2}, Ldefpackage/ea2;-><init>(Ldefpackage/ba2;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 25
    .line 26
    new-instance p1, Ldefpackage/xm2;

    .line 27
    .line 28
    new-instance p2, Ldefpackage/wc;

    .line 29
    .line 30
    const/16 p3, 0x16

    .line 31
    .line 32
    invoke-direct {p2, p3, p0}, Ldefpackage/wc;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, Ldefpackage/xm2;-><init>(Ldefpackage/j54;Ldefpackage/wc;)V

    .line 36
    .line 37
    .line 38
    new-instance p2, Ldefpackage/gp3;

    .line 39
    .line 40
    invoke-direct {p2, p1}, Ldefpackage/gp3;-><init>(Ldefpackage/xm2;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 44
    .line 45
    new-instance p1, Ldefpackage/zf0;

    .line 46
    .line 47
    const/4 p2, 0x2

    .line 48
    invoke-direct {p1, p2, p0}, Ldefpackage/zf0;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Ldefpackage/rp4;

    .line 52
    .line 53
    invoke-direct {p2, p1}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Ldefpackage/r92;->o:Ldefpackage/r92;

    .line 57
    .line 58
    iput-object p1, p0, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 59
    .line 60
    invoke-virtual {p2}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ldefpackage/k54;

    .line 65
    .line 66
    iput-object p1, p0, Ldefpackage/a23;->y:Ldefpackage/k54;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/b75;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/a23;->y:Ldefpackage/k54;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ldefpackage/f03;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/f03;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/f03;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/a23;->n:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, Landroid/app/Application;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    iget-object v2, v0, Ldefpackage/tf0;->a:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget-object v3, Ldefpackage/a75;->d:Ldefpackage/z45;

    .line 26
    .line 27
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_1
    sget-object v1, Ldefpackage/e54;->a:Ldefpackage/hh3;

    .line 31
    .line 32
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object v1, Ldefpackage/e54;->b:Ldefpackage/hh3;

    .line 36
    .line 37
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/a23;->c()Landroid/os/Bundle;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    sget-object v1, Ldefpackage/e54;->c:Ldefpackage/hh3;

    .line 47
    .line 48
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_2
    return-object v0
.end method

.method public final c()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/a23;->p:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final d()Ldefpackage/e75;
    .locals 3

    .line 1
    iget-boolean v0, p0, Ldefpackage/a23;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 7
    .line 8
    iget-object v0, v0, Ldefpackage/ea2;->h:Ldefpackage/r92;

    .line 9
    .line 10
    sget-object v2, Ldefpackage/r92;->n:Ldefpackage/r92;

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/a23;->r:Ldefpackage/j23;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Ldefpackage/j23;->b:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ldefpackage/e75;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance v1, Ldefpackage/e75;

    .line 34
    .line 35
    invoke-direct {v1}, Ldefpackage/e75;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object v1

    .line 42
    :cond_1
    const-string p0, "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."

    .line 43
    .line 44
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    const-string p0, "You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed."

    .line 49
    .line 50
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_3
    const-string p0, "You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    .line 55
    .line 56
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ldefpackage/a23;->w:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/xm2;

    .line 10
    .line 11
    invoke-virtual {v1}, Ldefpackage/xm2;->a()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Ldefpackage/a23;->w:Z

    .line 16
    .line 17
    iget-object v1, p0, Ldefpackage/a23;->r:Ldefpackage/j23;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, Ldefpackage/e54;->b(Ldefpackage/j54;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Ldefpackage/a23;->t:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ldefpackage/gp3;->s(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 42
    .line 43
    if-ge v0, v1, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Ldefpackage/a23;->q:Ldefpackage/r92;

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ldefpackage/ea2;->g(Ldefpackage/r92;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget-object p0, p0, Ldefpackage/a23;->x:Ldefpackage/r92;

    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ldefpackage/ea2;->g(Ldefpackage/r92;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    instance-of v1, p1, Ldefpackage/a23;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    check-cast p1, Ldefpackage/a23;

    .line 11
    .line 12
    iget-object v1, p1, Ldefpackage/a23;->p:Landroid/os/Bundle;

    .line 13
    .line 14
    iget-object v2, p1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v3, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    iget-object v2, p0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 25
    .line 26
    iget-object v3, p1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 27
    .line 28
    invoke-static {v2, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_5

    .line 33
    .line 34
    iget-object v2, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 35
    .line 36
    iget-object v3, p1, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 37
    .line 38
    invoke-static {v2, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_5

    .line 43
    .line 44
    iget-object v2, p0, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 45
    .line 46
    iget-object v2, v2, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ldefpackage/rm3;

    .line 49
    .line 50
    iget-object p1, p1, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 51
    .line 52
    iget-object p1, p1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ldefpackage/rm3;

    .line 55
    .line 56
    invoke-static {v2, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iget-object p0, p0, Ldefpackage/a23;->p:Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-static {p0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    check-cast p1, Ljava/lang/Iterable;

    .line 79
    .line 80
    instance-of v2, p1, Ljava/util/Collection;

    .line 81
    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    move-object v2, p1

    .line 85
    check-cast v2, Ljava/util/Collection;

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    goto :goto_0

    .line 121
    :cond_3
    const/4 v2, 0x0

    .line 122
    :goto_0
    invoke-static {v3, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 130
    return p0

    .line 131
    :cond_5
    :goto_2
    return v0
.end method

.method public final f()Ldefpackage/rm3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/rm3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h()Ldefpackage/ea2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 10
    .line 11
    invoke-virtual {v1}, Ldefpackage/r23;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    iget-object v0, p0, Ldefpackage/a23;->p:Landroid/os/Bundle;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v2, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const/4 v3, 0x0

    .line 58
    :goto_1
    add-int/2addr v1, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    mul-int/lit8 v1, v1, 0x1f

    .line 61
    .line 62
    iget-object v0, p0, Ldefpackage/a23;->u:Ldefpackage/ea2;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, v1

    .line 69
    mul-int/lit8 v0, v0, 0x1f

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/a23;->v:Ldefpackage/gp3;

    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Ldefpackage/rm3;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    add-int/2addr p0, v0

    .line 82
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Ldefpackage/a23;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "("

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x29

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, " destination="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
