.class public final synthetic Lml2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:Lbm2;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:I

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lbm2;Ljava/util/List;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lml2;->n:Lbm2;

    .line 5
    .line 6
    iput-object p2, p0, Lml2;->o:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lml2;->p:I

    .line 9
    .line 10
    iput-wide p4, p0, Lml2;->q:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lml2;->n:Lbm2;

    .line 2
    .line 3
    iget-object v2, v0, Lbm2;->c:Lmm2;

    .line 4
    .line 5
    new-instance v4, Liw;

    .line 6
    .line 7
    invoke-static {}, Lyw1;->j()Luw1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v3, p0, Lml2;->o:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-ge v1, v5, :cond_0

    .line 19
    .line 20
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lgn2;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-virtual {v3, v5}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v0, v3}, Lpw1;->c(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v4, v0}, Liw;-><init>(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    iget v5, p0, Lml2;->p:I

    .line 45
    .line 46
    iget-wide v6, p0, Lml2;->q:J

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    move v3, p2

    .line 50
    invoke-interface/range {v1 .. v7}, Lpu1;->u(Lju1;ILandroid/os/IBinder;IJ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
