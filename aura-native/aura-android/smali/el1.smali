.class public final synthetic Lel1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Las0;


# instance fields
.field public final synthetic n:Lfl1;

.field public final synthetic o:Lgu4;


# direct methods
.method public synthetic constructor <init>(Lfl1;Lgu4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lel1;->n:Lfl1;

    .line 5
    .line 6
    iput-object p2, p0, Lel1;->o:Lgu4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lel1;->o:Lgu4;

    .line 2
    .line 3
    iget-object p0, p0, Lel1;->n:Lfl1;

    .line 4
    .line 5
    iget-object p0, p0, Lfl1;->p:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
