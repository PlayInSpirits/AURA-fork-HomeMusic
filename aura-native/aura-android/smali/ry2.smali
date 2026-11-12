.class public final Lry2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lpv4;

.field public final b:Lxv4;

.field public final c:Lwv4;

.field public final d:Lmy4;

.field public e:I

.field public f:Ltb1;


# direct methods
.method public constructor <init>(Lpv4;Lxv4;Lwv4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lry2;->a:Lpv4;

    .line 5
    .line 6
    iput-object p2, p0, Lry2;->b:Lxv4;

    .line 7
    .line 8
    iput-object p3, p0, Lry2;->c:Lwv4;

    .line 9
    .line 10
    iget-object p1, p1, Lpv4;->g:Ltb1;

    .line 11
    .line 12
    iget-object p1, p1, Ltb1;->n:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, Lmy4;

    .line 23
    .line 24
    invoke-direct {p1}, Lmy4;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-object p1, p0, Lry2;->d:Lmy4;

    .line 30
    .line 31
    return-void
.end method
