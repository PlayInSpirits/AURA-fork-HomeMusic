.class public final synthetic Lll2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lit2;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lll2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iput-wide p1, p0, Lll2;->n:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(Lpu1;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lll2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbm2;

    .line 4
    .line 5
    iget-wide v1, p0, Lll2;->n:J

    .line 6
    .line 7
    iget-object p0, v0, Lbm2;->c:Lmm2;

    .line 8
    .line 9
    invoke-interface {p1, p0, p2, v1, v2}, Lpu1;->d0(Lju1;IJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p3, p0, Lll2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lgn2;

    .line 4
    .line 5
    invoke-static {p3}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    iget-wide v4, p0, Lll2;->n:J

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    move-object v1, p2

    .line 14
    invoke-virtual/range {v0 .. v5}, Ltn2;->x(Lfr2;Ljava/util/List;IJ)Llb4;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
