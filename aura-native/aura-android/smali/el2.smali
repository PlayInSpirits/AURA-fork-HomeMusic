.class public final synthetic Lel2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:Lbm2;

.field public final synthetic o:Lgn2;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lbm2;Lgn2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lel2;->n:Lbm2;

    .line 5
    .line 6
    iput-object p2, p0, Lel2;->o:Lgn2;

    .line 7
    .line 8
    iput-wide p3, p0, Lel2;->p:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lel2;->n:Lbm2;

    .line 2
    .line 3
    iget-object v2, v0, Lbm2;->c:Lmm2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object v1, p0, Lel2;->o:Lgn2;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    iget-wide v5, p0, Lel2;->p:J

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    move v3, p2

    .line 16
    invoke-interface/range {v1 .. v6}, Lpu1;->l(Lju1;ILandroid/os/Bundle;J)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
