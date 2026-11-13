.class public final synthetic Ldefpackage/ap4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:Ldefpackage/jx3;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ldefpackage/rd;

.field public final synthetic q:Ldefpackage/ce;

.field public final synthetic r:Ldefpackage/xd;

.field public final synthetic s:F

.field public final synthetic t:Ldefpackage/if1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/jx3;Ljava/lang/Object;Ldefpackage/rd;Ldefpackage/ce;Ldefpackage/xd;FLdefpackage/if1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ap4;->n:Ldefpackage/jx3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ap4;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ap4;->p:Ldefpackage/rd;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/ap4;->q:Ldefpackage/ce;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/ap4;->r:Ldefpackage/xd;

    .line 13
    .line 14
    iput p6, p0, Ldefpackage/ap4;->s:F

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/ap4;->t:Ldefpackage/if1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    new-instance v0, Ldefpackage/vd;

    .line 8
    .line 9
    iget-object p1, p0, Ldefpackage/ap4;->p:Ldefpackage/rd;

    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    invoke-interface {p1}, Ldefpackage/rd;->c()Ldefpackage/hd5;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1}, Ldefpackage/rd;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v9, Ldefpackage/bp4;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v10, p0, Ldefpackage/ap4;->r:Ldefpackage/xd;

    .line 24
    .line 25
    invoke-direct {v9, v10, v1}, Ldefpackage/bp4;-><init>(Ldefpackage/xd;I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/ap4;->o:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v3, p0, Ldefpackage/ap4;->q:Ldefpackage/ce;

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    invoke-direct/range {v0 .. v9}, Ldefpackage/vd;-><init>(Ljava/lang/Object;Ldefpackage/hd5;Ldefpackage/ce;JLjava/lang/Object;JLdefpackage/gf1;)V

    .line 34
    .line 35
    .line 36
    iget v3, p0, Ldefpackage/ap4;->s:F

    .line 37
    .line 38
    iget-object v6, p0, Ldefpackage/ap4;->t:Ldefpackage/if1;

    .line 39
    .line 40
    move-wide v1, v4

    .line 41
    move-object v5, v10

    .line 42
    move-object v4, p1

    .line 43
    invoke-static/range {v0 .. v6}, Ldefpackage/j51;->q(Ldefpackage/vd;JFLdefpackage/rd;Ldefpackage/xd;Ldefpackage/if1;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/ap4;->n:Ldefpackage/jx3;

    .line 47
    .line 48
    iput-object v0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 51
    .line 52
    return-object p0
.end method
