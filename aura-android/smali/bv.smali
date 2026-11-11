.class public final Lbv;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lcv;

.field public final synthetic q:Lf63;

.field public final synthetic r:Lfa;

.field public final synthetic s:Ljo;


# direct methods
.method public constructor <init>(Lcv;Lf63;Lfa;Ljo;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbv;->p:Lcv;

    .line 2
    .line 3
    iput-object p2, p0, Lbv;->q:Lf63;

    .line 4
    .line 5
    iput-object p3, p0, Lbv;->r:Lfa;

    .line 6
    .line 7
    iput-object p4, p0, Lbv;->s:Ljo;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 6

    .line 1
    new-instance v0, Lbv;

    .line 2
    .line 3
    iget-object v3, p0, Lbv;->r:Lfa;

    .line 4
    .line 5
    iget-object v4, p0, Lbv;->s:Ljo;

    .line 6
    .line 7
    iget-object v1, p0, Lbv;->p:Lcv;

    .line 8
    .line 9
    iget-object v2, p0, Lbv;->q:Lf63;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lbv;-><init>(Lcv;Lf63;Lfa;Ljo;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lbv;->o:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwe0;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lbv;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lbv;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lbv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lbv;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lwe0;

    .line 7
    .line 8
    new-instance v0, Lr;

    .line 9
    .line 10
    iget-object v3, p0, Lbv;->r:Lfa;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v1, p0, Lbv;->p:Lcv;

    .line 14
    .line 15
    iget-object v2, p0, Lbv;->q:Lf63;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v0 .. v5}, Lr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {p1, v4, v4, v0, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lp;

    .line 26
    .line 27
    iget-object p0, p0, Lbv;->s:Ljo;

    .line 28
    .line 29
    invoke-direct {v0, v1, p0, v4, v2}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v4, v4, v0, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
