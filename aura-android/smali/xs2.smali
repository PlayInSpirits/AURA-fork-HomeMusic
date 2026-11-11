.class public final synthetic Lxs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwc0;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lxs2;->n:Z

    .line 5
    .line 6
    iput p1, p0, Lxs2;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lxs2;->o:I

    .line 2
    .line 3
    check-cast p1, Lal3;

    .line 4
    .line 5
    iget-boolean p0, p0, Lxs2;->n:Z

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Lal3;->E(IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
