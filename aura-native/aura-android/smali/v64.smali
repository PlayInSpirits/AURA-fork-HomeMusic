.class public abstract Lv64;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lt64;

.field public static final b:Lsq0;

.field public static final c:Ldd3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt64;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv64;->a:Lt64;

    .line 7
    .line 8
    new-instance v0, Lsq0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lsq0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lv64;->b:Lsq0;

    .line 15
    .line 16
    new-instance v0, Ldd3;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ldd3;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lv64;->c:Ldd3;

    .line 22
    .line 23
    return-void
.end method

.method public static final a(Lg74;JLwd0;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lu64;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lu64;

    .line 7
    .line 8
    iget v1, v0, Lu64;->q:I

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
    iput v1, v0, Lu64;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu64;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lwd0;-><init>(Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lu64;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lu64;->q:I

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
    iget-object p0, v0, Lu64;->o:Lgx3;

    .line 35
    .line 36
    iget-object p1, v0, Lu64;->n:Lg74;

    .line 37
    .line 38
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v7, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Lgx3;

    .line 55
    .line 56
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v3, Ls;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x1

    .line 63
    move-object v4, p0

    .line 64
    move-wide v5, p1

    .line 65
    invoke-direct/range {v3 .. v9}, Ls;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lvd0;I)V

    .line 66
    .line 67
    .line 68
    iput-object v4, v0, Lu64;->n:Lg74;

    .line 69
    .line 70
    iput-object v7, v0, Lu64;->o:Lgx3;

    .line 71
    .line 72
    iput v2, v0, Lu64;->q:I

    .line 73
    .line 74
    sget-object p0, Lh13;->n:Lh13;

    .line 75
    .line 76
    invoke-virtual {v4, p0, v3, v0}, Lg74;->g(Lh13;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object p1, Lxe0;->n:Lxe0;

    .line 81
    .line 82
    if-ne p0, p1, :cond_3

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_3
    move-object p0, v4

    .line 86
    :goto_1
    iget p1, v7, Lgx3;->n:F

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lg74;->i(F)J

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    new-instance p2, Lg83;

    .line 93
    .line 94
    invoke-direct {p2, p0, p1}, Lg83;-><init>(J)V

    .line 95
    .line 96
    .line 97
    return-object p2
.end method
