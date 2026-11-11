.class public final Lii1;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final k:Lch1;


# instance fields
.field public final a:Lqj0;

.field public final b:Lsd0;

.field public final c:Ltv1;

.field public final d:Lfi1;

.field public final e:Ljava/util/List;

.field public final f:Loi;

.field public final g:Li11;

.field public final h:Ld34;

.field public final i:I

.field public j:Lg04;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lch1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lii1;->k:Lch1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lqj0;Lll;Ltv1;Lfi1;Loi;Ljava/util/List;Li11;Ld34;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lii1;->a:Lqj0;

    .line 9
    .line 10
    iput-object p4, p0, Lii1;->c:Ltv1;

    .line 11
    .line 12
    iput-object p5, p0, Lii1;->d:Lfi1;

    .line 13
    .line 14
    iput-object p7, p0, Lii1;->e:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, Lii1;->f:Loi;

    .line 17
    .line 18
    iput-object p8, p0, Lii1;->g:Li11;

    .line 19
    .line 20
    iput-object p9, p0, Lii1;->h:Ld34;

    .line 21
    .line 22
    iput p10, p0, Lii1;->i:I

    .line 23
    .line 24
    new-instance p1, Lsd0;

    .line 25
    .line 26
    invoke-direct {p1, p3}, Lsd0;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lii1;->b:Lsd0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()Ley3;
    .locals 0

    .line 1
    iget-object p0, p0, Lii1;->b:Lsd0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsd0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ley3;

    .line 8
    .line 9
    return-object p0
.end method
