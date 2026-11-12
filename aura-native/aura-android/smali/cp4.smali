.class public final synthetic Lcp4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Ljx3;

.field public final synthetic o:F

.field public final synthetic p:Lrd;

.field public final synthetic q:Lxd;

.field public final synthetic r:Lif1;


# direct methods
.method public synthetic constructor <init>(Ljx3;FLrd;Lxd;Lif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcp4;->n:Ljx3;

    .line 5
    .line 6
    iput p2, p0, Lcp4;->o:F

    .line 7
    .line 8
    iput-object p3, p0, Lcp4;->p:Lrd;

    .line 9
    .line 10
    iput-object p4, p0, Lcp4;->q:Lxd;

    .line 11
    .line 12
    iput-object p5, p0, Lcp4;->r:Lif1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p1, p0, Lcp4;->n:Ljx3;

    .line 8
    .line 9
    iget-object p1, p1, Ljx3;->n:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lvd;

    .line 16
    .line 17
    iget v3, p0, Lcp4;->o:F

    .line 18
    .line 19
    iget-object v4, p0, Lcp4;->p:Lrd;

    .line 20
    .line 21
    iget-object v5, p0, Lcp4;->q:Lxd;

    .line 22
    .line 23
    iget-object v6, p0, Lcp4;->r:Lif1;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lj51;->q(Lvd;JFLrd;Lxd;Lif1;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lj15;->a:Lj15;

    .line 29
    .line 30
    return-object p0
.end method
