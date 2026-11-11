.class public final synthetic Lmu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Ljg3;

.field public final synthetic o:Lpi2;

.field public final synthetic p:Lcf2;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Lou;


# direct methods
.method public synthetic constructor <init>(Ljg3;Lpi2;Lcf2;IILou;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmu;->n:Ljg3;

    .line 5
    .line 6
    iput-object p2, p0, Lmu;->o:Lpi2;

    .line 7
    .line 8
    iput-object p3, p0, Lmu;->p:Lcf2;

    .line 9
    .line 10
    iput p4, p0, Lmu;->q:I

    .line 11
    .line 12
    iput p5, p0, Lmu;->r:I

    .line 13
    .line 14
    iput-object p6, p0, Lmu;->s:Lou;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lig3;

    .line 3
    .line 4
    iget-object p1, p0, Lmu;->p:Lcf2;

    .line 5
    .line 6
    invoke-interface {p1}, Lwi2;->getLayoutDirection()Lr62;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Lmu;->s:Lou;

    .line 11
    .line 12
    iget-object v6, p1, Lou;->a:Lhs;

    .line 13
    .line 14
    iget-object v1, p0, Lmu;->n:Ljg3;

    .line 15
    .line 16
    iget-object v2, p0, Lmu;->o:Lpi2;

    .line 17
    .line 18
    iget v4, p0, Lmu;->q:I

    .line 19
    .line 20
    iget v5, p0, Lmu;->r:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Llu;->a(Lig3;Ljg3;Lpi2;Lr62;IILhs;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lj15;->a:Lj15;

    .line 26
    .line 27
    return-object p0
.end method
