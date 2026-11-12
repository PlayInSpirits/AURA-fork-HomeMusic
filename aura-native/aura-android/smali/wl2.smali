.class public final synthetic Lwl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:Lbm2;

.field public final synthetic o:Lil;

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(Lbm2;Lil;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwl2;->n:Lbm2;

    .line 5
    .line 6
    iput-object p2, p0, Lwl2;->o:Lil;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwl2;->p:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lwl2;->n:Lbm2;

    .line 2
    .line 3
    iget-object v0, v0, Lbm2;->c:Lmm2;

    .line 4
    .line 5
    iget-object v1, p0, Lwl2;->o:Lil;

    .line 6
    .line 7
    invoke-virtual {v1}, Lil;->d()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-boolean p0, p0, Lwl2;->p:Z

    .line 12
    .line 13
    invoke-interface {p1, v0, p2, v1, p0}, Lpu1;->b(Lju1;ILandroid/os/Bundle;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
