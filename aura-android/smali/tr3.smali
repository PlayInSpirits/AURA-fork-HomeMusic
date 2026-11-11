.class public final Ltr3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lmz0;

.field public final b:Liu4;

.field public final c:Lh00;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J


# direct methods
.method public constructor <init>(Lmz0;Liu4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltr3;->a:Lmz0;

    .line 5
    .line 6
    iput-object p2, p0, Ltr3;->b:Liu4;

    .line 7
    .line 8
    new-instance p1, Lh00;

    .line 9
    .line 10
    const/16 p2, 0x40

    .line 11
    .line 12
    new-array v0, p2, [B

    .line 13
    .line 14
    invoke-direct {p1, p2, v0}, Lh00;-><init>(I[B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ltr3;->c:Lh00;

    .line 18
    .line 19
    return-void
.end method
