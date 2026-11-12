.class public abstract Lvq4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnv0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v3, v2}, Lnv0;-><init>(ILvd0;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lhp4;Lln3;Ljp;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Luq4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Luq4;

    .line 7
    .line 8
    iget v1, v0, Luq4;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luq4;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luq4;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lwd0;-><init>(Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Luq4;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luq4;->q:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Luq4;->o:Lln3;

    .line 35
    .line 36
    iget-object p1, v0, Luq4;->n:Lhp4;

    .line 37
    .line 38
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v4, p1

    .line 42
    move-object p1, p0

    .line 43
    move-object p0, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iput-object p0, v0, Luq4;->n:Lhp4;

    .line 56
    .line 57
    iput-object p1, v0, Luq4;->o:Lln3;

    .line 58
    .line 59
    iput v2, v0, Luq4;->q:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, Lhp4;->a(Lln3;Ljp;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v1, Lxe0;->n:Lxe0;

    .line 66
    .line 67
    if-ne p2, v1, :cond_4

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_4
    :goto_1
    check-cast p2, Lkn3;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-static {p2, v1}, Lvq4;->b(Lkn3;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    iget-object p0, p2, Lkn3;->a:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public static b(Lkn3;Z)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lkn3;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, 0x1

    .line 10
    if-ge v2, v0, :cond_3

    .line 11
    .line 12
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lon3;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v4}, Lon3;->c()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    iget-boolean v5, v4, Lon3;->h:Z

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    iget-boolean v4, v4, Lon3;->d:Z

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v3, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {v4}, Lgi1;->g(Lon3;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :goto_1
    if-nez v3, :cond_2

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    return v3
.end method
