.class public final Lfy3;
.super Lbx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final v:Lfy3;


# instance fields
.field public final transient q:Ljava/lang/Object;

.field public final transient r:[Ljava/lang/Object;

.field public final transient s:I

.field public final transient t:I

.field public final transient u:Lfy3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lfy3;

    .line 2
    .line 3
    invoke-direct {v0}, Lfy3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfy3;->v:Lfy3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 70
    iput-object v0, p0, Lfy3;->q:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 71
    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lfy3;->r:[Ljava/lang/Object;

    .line 72
    iput v0, p0, Lfy3;->s:I

    .line 73
    iput v0, p0, Lfy3;->t:I

    .line 74
    iput-object p0, p0, Lfy3;->u:Lfy3;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lfy3;->r:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p1, p0, Lfy3;->t:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lfy3;->s:I

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-lt p1, v1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Ljx1;->i(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v0

    .line 20
    :goto_0
    invoke-static {p2, p1, v2, v0}, Lly3;->h([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v3, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lfy3;->q:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-static {p2, p1, v2, v0}, Lly3;->h([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v2, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    new-instance v1, Lfy3;

    .line 40
    .line 41
    invoke-direct {v1, v0, p2, p1, p0}, Lfy3;-><init>(Ljava/lang/Object;[Ljava/lang/Object;ILfy3;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lfy3;->u:Lfy3;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    check-cast v0, [Ljava/lang/Object;

    .line 48
    .line 49
    aget-object p0, v0, v1

    .line 50
    .line 51
    check-cast p0, Lax1;

    .line 52
    .line 53
    invoke-virtual {p0}, Lax1;->a()Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    throw p0

    .line 58
    :cond_2
    check-cast v0, [Ljava/lang/Object;

    .line 59
    .line 60
    aget-object p0, v0, v1

    .line 61
    .line 62
    check-cast p0, Lax1;

    .line 63
    .line 64
    invoke-virtual {p0}, Lax1;->a()Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    throw p0
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;ILfy3;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lfy3;->q:Ljava/lang/Object;

    .line 77
    iput-object p2, p0, Lfy3;->r:[Ljava/lang/Object;

    const/4 p1, 0x1

    .line 78
    iput p1, p0, Lfy3;->s:I

    .line 79
    iput p3, p0, Lfy3;->t:I

    .line 80
    iput-object p4, p0, Lfy3;->u:Lfy3;

    return-void
.end method


# virtual methods
.method public final c()Liy3;
    .locals 4

    .line 1
    new-instance v0, Liy3;

    .line 2
    .line 3
    iget v1, p0, Lfy3;->s:I

    .line 4
    .line 5
    iget v2, p0, Lfy3;->t:I

    .line 6
    .line 7
    iget-object v3, p0, Lfy3;->r:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, p0, v3, v1, v2}, Liy3;-><init>(Lbx1;[Ljava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final d()Ljy3;
    .locals 4

    .line 1
    new-instance v0, Lky3;

    .line 2
    .line 3
    iget v1, p0, Lfy3;->s:I

    .line 4
    .line 5
    iget v2, p0, Lfy3;->t:I

    .line 6
    .line 7
    iget-object v3, p0, Lfy3;->r:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lky3;-><init>([Ljava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljy3;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0}, Ljy3;-><init>(Lbx1;Lky3;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public final e()Lrw1;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v0, "should never be called"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final f()Lrw1;
    .locals 1

    .line 1
    iget-object p0, p0, Lfy3;->u:Lfy3;

    .line 2
    .line 3
    iget-object v0, p0, Lbx1;->o:Ljx1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lfy3;->d()Ljy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lbx1;->o:Ljx1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lfy3;->t:I

    .line 2
    .line 3
    iget v1, p0, Lfy3;->s:I

    .line 4
    .line 5
    iget-object v2, p0, Lfy3;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lfy3;->r:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v2, p0, v0, v1, p1}, Lly3;->i(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    :cond_0
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lfy3;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object p0, p0, Lfy3;->u:Lfy3;

    .line 2
    .line 3
    iget-object v0, p0, Lbx1;->o:Ljx1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lfy3;->d()Ljy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lbx1;->o:Ljx1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
