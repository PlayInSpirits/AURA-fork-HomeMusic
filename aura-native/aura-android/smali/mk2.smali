.class public final Lmk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Z

.field public c:Lzj2;

.field public d:J

.field public e:Landroid/os/Handler;

.field public f:Lo55;

.field public g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmk2;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Loj1;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p1, v1}, Loj1;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lmk2;->c:Lzj2;

    .line 13
    .line 14
    return-void
.end method
