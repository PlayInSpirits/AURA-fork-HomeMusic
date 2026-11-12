.class public final Lyl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final h:Lgo4;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:Landroid/app/NotificationManager;

.field public d:Lmf4;

.field public final e:I

.field public f:Lx7;

.field public g:Lxc5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldi0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ldi0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lau0;->L(Lgo4;)Lgo4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lyl0;->h:Lgo4;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lbk;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lbk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget p1, p1, Lbk;->o:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyl0;->a:Landroid/content/Context;

    .line 11
    .line 12
    iput p1, p0, Lyl0;->b:I

    .line 13
    .line 14
    const-string p1, "notification"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/app/NotificationManager;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lyl0;->c:Landroid/app/NotificationManager;

    .line 26
    .line 27
    const p1, 0x7f080295

    .line 28
    .line 29
    .line 30
    iput p1, p0, Lyl0;->e:I

    .line 31
    .line 32
    return-void
.end method
