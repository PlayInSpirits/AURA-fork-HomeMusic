.class public final Lf10;
.super La10;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final r:Lxf1;


# direct methods
.method public constructor <init>(Lxf1;Lp81;Lne0;ILwv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4, p5}, La10;-><init>(Lp81;Lne0;ILwv;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf10;->r:Lxf1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Lne0;ILwv;)Lz00;
    .locals 6

    .line 1
    new-instance v0, Lf10;

    .line 2
    .line 3
    iget-object v1, p0, Lf10;->r:Lxf1;

    .line 4
    .line 5
    iget-object v2, p0, La10;->q:Lp81;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Lf10;-><init>(Lxf1;Lp81;Lne0;ILwv;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final f(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lc10;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lc10;-><init>(Lf10;Lq81;Lvd0;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lte5;->j(Lwf1;Lvd0;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lxe0;->n:Lxe0;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 17
    .line 18
    return-object p0
.end method
