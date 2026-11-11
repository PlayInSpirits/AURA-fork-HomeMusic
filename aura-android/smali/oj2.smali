.class public final Loj2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Lms2;

.field public final e:Lhg3;

.field public final f:Ljava/util/HashMap;

.field public final synthetic g:Lpn2;


# direct methods
.method public constructor <init>(Lpn2;Ljava/lang/String;IILhg3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loj2;->g:Lpn2;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Loj2;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p2, p0, Loj2;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput p3, p0, Loj2;->b:I

    .line 16
    .line 17
    iput p4, p0, Loj2;->c:I

    .line 18
    .line 19
    new-instance p1, Lms2;

    .line 20
    .line 21
    invoke-direct {p1, p2, p3, p4}, Lms2;-><init>(Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Loj2;->d:Lms2;

    .line 25
    .line 26
    iput-object p5, p0, Loj2;->e:Lhg3;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    .line 1
    iget-object v0, p0, Loj2;->g:Lpn2;

    .line 2
    .line 3
    iget-object v0, v0, Lpn2;->t:Lzk;

    .line 4
    .line 5
    new-instance v1, Lg5;

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    invoke-direct {v1, v2, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
