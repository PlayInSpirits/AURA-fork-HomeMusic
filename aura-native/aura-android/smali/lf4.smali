.class public final Llf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Loy1;


# direct methods
.method public constructor <init>(Loy1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llf4;->o:Loy1;

    .line 5
    .line 6
    iput-boolean p2, p0, Llf4;->n:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    invoke-static {}, Le35;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llf4;->o:Loy1;

    .line 5
    .line 6
    iget-object v0, v0, Loy1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lll;

    .line 9
    .line 10
    iget-boolean v1, v0, Lll;->o:Z

    .line 11
    .line 12
    iget-boolean p0, p0, Llf4;->n:Z

    .line 13
    .line 14
    iput-boolean p0, v0, Lll;->o:Z

    .line 15
    .line 16
    if-eq v1, p0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lll;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lkf4;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lkf4;->a(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
